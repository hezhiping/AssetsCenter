<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资金变动录入</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">	
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/assets-1.0.js"></script>	
<script type="text/javascript">
  
	var editIndex ;//全局的行索引
	
	function endEditing(){
		if (editIndex == undefined){return true}
		if ($('#grid').datagrid('validateRow', editIndex)){
			// 处理 combobox在datagrid显示值问题 开始
			var ed = $('#grid').datagrid('getEditor', {index:editIndex,field:'profitLossSort'});
			var productname = $(ed.target).combobox('getText');
			$('#grid').datagrid('getRows')[editIndex]['profitLossSortName'] = productname;
			// 处理 combobox在datagrid显示值问题 结束
			$('#grid').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		} else {
			return false;
		}
	}
	
	//校验 当前行必填项是否已填写，通过了返回true，没有通过返回false   
 /*    function endEditing() {
        if (editIndex == undefined) { return true }
        if ($('#grid').datagrid('validateRow', editIndex)) {
            $('#grid').datagrid('endEdit', editIndex);
            editIndex = undefined;
            return true;
        } else {
            return false;
        }
    } */
	
	function doAdd(){
		
		// 当前行必填项验证通过才让追加一行
		  if (endEditing()) {  
			  $('#grid').datagrid('appendRow', {incomMode:0,payMoney:0,money:0});	// 添加一行不初始化某些列的值	，可以指定对应的列赋值eg: id:1
				 editIndex = $('#grid').datagrid('getRows').length - 1;
	          $('#grid').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
		  }		 
	}
	// 双击行修改数据
	function doDblClickRow(rowIndex, rowData){
		if(rowIndex != editIndex ){ //判断正在编辑的行和双击选中的行是否相等
			if(endEditing()){ // 验证内容是否通过，通过结束当前编辑行，开启双击选中行
				 $('#grid').datagrid('endEdit', editIndex);
				 $('#grid').datagrid('beginEdit',rowIndex);
					editIndex = rowIndex;
					}else{
						$.messager.alert("提示", "请完成未编辑完的行，或者取消未编辑的行！");						
					}
		}else{
			console.info(rowIndex);
			$('#grid').datagrid('beginEdit',rowIndex);
			editIndex = rowIndex;
		}		
	}
	// 取消行
	function doCancel(){
		alert(editIndex);
		if(editIndex!=undefined){
			$("#grid").datagrid('cancelEdit',editIndex);
			if($('#grid').datagrid('getRows')[editIndex].id == undefined){
				$("#grid").datagrid('deleteRow',editIndex);
			}
			editIndex = undefined;
		}
	}
	
	function doSave(){
		$("#grid").datagrid('endEdit',editIndex );
	}

	
    // -----------------------------------人员明细表的增删改查--------------------//
       
        /*点击添加一行*/
        function AddRowUserDetail() {
            if (endEditing()) {  //增加一行datagrid是否成功
                //获取datagrid所有改变行
                var rows = $('#dgUserDetailETB').datagrid('getChanges');
                //获取当前行
                var row = $('#dgUserDetailETB').datagrid('getSelected');

                if (rows.length > 1) {
                    var _list = {};
                    for (var i = 0; i < rows.length; i++) {

                        _list["list[" + i + "].User_ID"] = rows[i].User_ID;

                    }
                    //判断数组里的数据是否重复
                    //var bl = isRepeat(_list);
                    //if (bl == true) {
                    //    $.messager.alert("提示", "该人员已存在，请检查！", "warning");
                    //    return;
                    //}
                    //console.log(_list);
                }

                $('#dgUserDetailETB').datagrid('appendRow', { FeeDetailCode: FeeDetail_Id });
                editIndex = $('#dgUserDetailETB').datagrid('getRows').length - 1;
                $('#dgUserDetailETB').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
            }
        }

    

        //判断数组里的值是否存在
        function isRepeat(arr) {
            var hash = {};

            for (var i in arr) {
                if (hash[arr[i].User_ID])
                    return true;
                hash[arr[i].User_ID] = true;
            }
            return false;
        }
   

    /*保存添加多条人员信息*/
  /*   function doSaveUserDetail() {
        var _list = {};
        var rows = $('#dgUserDetailETB').datagrid('getChanges', 'inserted');
        $('#dgUserDetailETB').datagrid('acceptChanges');
        if (rows.length <= 0) {
            //$.messager.alert("提示", "请输入信息！", "info");
            return false;
        } else {
            var row;
            for (var i = 0; i < rows.length; i++) { //for循环遍历添加的行
                row = rows[i];
                _list["list[" + i + "].FeeDetailCode"] = FeeDetail_Id;
                if (row.BasePositionCode != undefined && row.User_ID != undefined) { //判断空行不能插入数据库
                    _list["list[" + i + "].BasePositionCode"] = row.BasePositionCode;
                    _list["list[" + i + "].User_ID"] = row.User_ID;
                } else {
                    return false;
                }
            }
            $.ajax({
                type: "POST",
                url: "/LossFeeUserPublic/UserDetailAdd",
                dataType: 'JSON',
                data: _list,
                success: function (data) {
                    $('#dgUserDetailETB').datagrid('acceptChanges', 'inserted');
                    if (data == "保存成功!") {
                        //重载记录
                        $('#dgUserDetail').datagrid('reload', { url: '/LossFeeUserPublic/GetUserDetailList' });
                        $('#dlgUserDetail').dialog('close');
                    }
                    else {
                        $.messager.alert("提示", "保存失败！错误：请输入信息或者该人员已经存在", data);
                        return false;
                    }
                    console.log(data);
                }
            });
        }
    }
 */
    /*删除添加时的行*/
  /*   function delRowUserDetail() {
        var row = $('#dgUserDetailETB').datagrid('getSelected');
        var index = $('#dgUserDetailETB').datagrid('getRowIndex', row);
        if (row) {
            $('#dgUserDetailETB').datagrid('deleteRow', index);
        } else {
            $.messager.alert("提示", "请选择要删除的行！", "warning");
        }
    } */


    //---------------------人员明细------------------------------------------//	
	
	//工具栏
	var toolbar = [ {
		id : 'button-add',	
		text : '新增一行',
		iconCls : 'icon-edit',
		handler : doAdd
	}, {
		id : 'button-cancel',
		text : '取消编辑',
		iconCls : 'icon-cancel',
		handler : doCancel
	}, {
		id : 'button-save',
		text : '保存',
		iconCls : 'icon-save',
		handler : doSave
	}];
	// 定义列
	var columns = [ [ {
		field : 'id',
		title : '流水号',
		width : 80,
		align : 'center',
		//hidden: true
		
	}, {
		field : 'consumeDate',
		title : '消费日期',
		width : 180,
		align : 'center',
		editor :{
			 type : 'datebox',
			options : {
				editable:false,
				required: true
			} 
		}
	}, {
		field : 'item',
		title : '事项',
		width : 220,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				required: true
			}
		}
	},{
		field : 'money',
		title : '金额',
		width : 100,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				// required: true,
				readonly:true
			}
		}
	}, {
		field : 'profitLossSort',
		title : '损益分类',
		width : 160,
		align : 'center',
	    formatter: function (value, row) {
   	  	//这里是关健，对比找出显示值
	    	return row.profitLossSortName;
            }, 
		editor :{
			type : 'combobox',
			options : {
				url:'/assets/UserConstDic/getProfitLossType',
				valueField:'costCode',
				textField:'costName',
				required: true,
				editable: false
			}
		}
	}, {
		field : 'payMode',
		title : '支付方式',
		width : 160,
		align : 'center',
		editor :{
			type : 'combobox',
			options : {
				url:'/assets/UserConstDic/getPayIncomType',
				valueField:'costCode',
				textField:'costName',				
				editable: false
			}
		}
	}, {
		field : 'payMoney',
		title : '支付金额',
		width : 100,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				
			}
		}
	}, {
		field : 'incomMode',
		title : '收入方式',
		width : 160,
		align : 'center',
		editor :{
			type : 'combobox',
			options : {
				url:'/assets/UserConstDic/getPayIncomType',
				valueField:'costCode',
				textField:'costName',				
				editable: false
			}
		}
	}, {
		field : 'incomMoney',
		title : '收到金额',
		width : 100,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				
			}
		}
	}] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 收派标准数据表格
		$('#grid').datagrid( {
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			pageList: [100,150,200],
			pageSize: 100,
			pagination : true,
			toolbar : toolbar,
			url :  "/assets/FundChange/fundChangeList",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow,
			
			/* onAfterEdit : function(rowIndex, rowData, changes){//结束编辑状态的事件
				console.info(rowData);
				editIndex = undefined;
				//发送ajax请求，提交当前结束编辑行的数据到服务器，完成保存操作
				var url = "";
				$.post(url,rowData,function(data){
					if(data == '1'){
						//录入成功
						$.messager.alert("提示信息","资金变动录入成功！","info");
					}else{
						//录入失败
						$.messager.alert("提示信息","资金变动录入失败！","warning");
					}
				});
			} */
		});
	});


</script>
</head>
<body class="easyui-layout" style="visibility:hidden;">
	<div region="center" border="false">
    	<table id="grid"></table>
	</div>
</body>
</html>