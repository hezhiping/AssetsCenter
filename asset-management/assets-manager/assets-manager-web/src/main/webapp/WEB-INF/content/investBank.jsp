<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>投资理财</title>
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

	var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
	var editIndex ;//全局的行索引
	
	function endEditing(){
		if (editIndex == undefined){return true}
		if ($('#grid').datagrid('validateRow', editIndex)){			
				$('#grid').datagrid('endEdit', editIndex);
				editIndex = undefined;
				return true;
			
		} else {			
			return false;
		}
	}	
	// 计算年化收益率
	function calculateRate(rowIndex){ 				 	
			var editors = $('#grid').datagrid('getEditors', rowIndex); 
		    var buyDateEditor = $(editors[2].target);  
		    var sailDateEditor = $(editors[3].target);
		    var iMoneyEditor = $(editors[5].target);  
		    var pMoneyEditor = $(editors[6].target);  
		    var rateEditor = $(editors[7].target); 
			var day ;		     	
		    pMoneyEditor.numberbox({
		    		onChange:function(){
		    			 if(buyDateEditor.datebox('getValue') == sailDateEditor.datebox('getValue')){//日期相等算一天
		    			    	day = 1;
		    			    }else{
		    			    	day = getDays(userAgent,buyDateEditor.datebox('getValue'),sailDateEditor.datebox('getValue'));
		    			    }		
						var rate = parseFloat(((pMoneyEditor.numberbox('getValue')/iMoneyEditor.numberbox('getValue'))/day)*365).toFixed(2);
						rateEditor.numberbox('setValue',rate);  	
					}
			})	
	}
	
	//添加一行
	function doAdd(){
		
		// 当前行必填项验证通过才让追加一行
		  if (endEditing()) { 
			 
			  $('#grid').datagrid('appendRow', {investDate:transformDate(new Date()),investProfitDate:transformDate(new Date()),investProfit:0});	// 添加一行不初始化某些列的值	，可以指定对应的列赋值eg: id:1
				 editIndex = $('#grid').datagrid('getRows').length - 1;
	          $('#grid').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
	      	 calculateRate(editIndex);
		  }		  
	}
	// 双击行修改数据
	function doDblClickRow(rowIndex, rowData){
		if(rowIndex != editIndex ){ //判断正在编辑的行和双击选中的行是否相等
			if(endEditing()){ // 验证内容是否通过，通过结束当前编辑行，开启双击选中行
				// 编辑行时，时间格式为1534435200000 这种格式，需要转换成yyyy-MM-dd格式后easyUI会处理该日期显示在date控件上
				rowData.investDate = transformDate(rowData.investDate);
				rowData.investProfitDate = transformDate(rowData.investProfitDate);
				 $('#grid').datagrid('endEdit', editIndex);
				 $('#grid').datagrid('beginEdit',rowIndex);
					editIndex = rowIndex;
					calculateRate(rowIndex);
			}
		}else{			
			$('#grid').datagrid('beginEdit',rowIndex);
			editIndex = rowIndex;
			calculateRate(rowIndex);
		}		
	}
	// 取消行
	function doCancel(){
		if(editIndex!=undefined){
			$("#grid").datagrid('cancelEdit',editIndex);
			if($('#grid').datagrid('getRows')[editIndex].id == undefined){
				$("#grid").datagrid('deleteRow',editIndex);
			}
			editIndex = undefined;
		}
	}
	//结束编辑
	function doSave(){		
		 if (endEditing()) { 			
				$("#grid").datagrid('endEdit',editIndex );
				
			 }else{
				 $.messager.alert("提示","请填写完必填项");
			 }
	}

   	// 保存所有改变的数据
  	function doSaveAll() {
   		if(endEditing){
	        var _lists = [];//定义一个大数组
	        var insertList = [];//定义一个数据
	        var updateList = [];//定义一个数据
	        var insertRows = $('#grid').datagrid('getChanges','inserted');
	        var updateRows = $('#grid').datagrid('getChanges','updated');
	        $('#grid').datagrid('acceptChanges');
	        if (insertRows.length <= 0 && updateRows.length <= 0) {
	            //$.messager.alert("提示", "请输入信息！", "info");
	            return false;
	        } else {
	            var insertRow;
	            var updateRow;
	            // 插入的数据
	            for (var i = 0; i < insertRows.length; i++) { //for循环遍历添加的行
	            	insertRow = insertRows[i];	
	            //拼接数据为json格式
	            	
               		insertList.push({"investCode":insertRow.investCode,"investName":insertRow.investName,"investDate":insertRow.investDate,
               			"investType":insertRow.investType,"investMoney":insertRow.investMoney,"investProfit":insertRow.investProfit,"investProfitDate":insertRow.investProfitDate,
               			"annualizedRateReturn":insertRow.annualizedRateReturn,"tagStatus":insertRow.tagStatus,});			                
	              
	            }	
	            _lists.push({"type":"insert","insertUpdateData":insertList})
	            // 修改的数据
	            for (var i = 0; i < updateRows.length; i++) { //for循环遍历添加的行
	            	updateRow = updateRows[i];	
	            //拼接数据为json格式		            	
               		updateList.push({"id":updateRow.id,"investCode":updateRow.investCode,"investName":updateRow.investName,"investDate":updateRow.investDate,
               			"investType":updateRow.investType,"investMoney":updateRow.investMoney,"investProfit":updateRow.investProfit,"investProfitDate":updateRow.investProfitDate,
               			"annualizedRateReturn":updateRow.annualizedRateReturn,"tagStatus":updateRow.tagStatus,"psnCode":updateRow.psnCode});			                
	              
	            }
	            _lists.push({"type":"update","insertUpdateData":updateList})
	            console.log(_lists);
	            $.ajax({
	                type: "POST",
	                url: "/assets/InvestBank/addInvestBank",
	                contentType:'application/json;charset=UTF-8',//关键是要加上这行
	                traditional:true,//这使json格式的字符不会被转码
	                dataType: 'JSON',
	                data:JSON.stringify(_lists),
	                success: function (data) {
	                	 console.log(data);
	                    $('#grid').datagrid('acceptChanges', 'inserted');
	                    if (data.status == 200) {
	                    	editIndex = undefined;
	                        //重载记录
	                        $('#grid').datagrid('reload');		                      
	                    }
	                    else {
	                        $.messager.alert("提示",data.msg);
	                        return false;
	                    }	                   
	                }
	            });
	        }
   		}
   		else{
   			return false;
   		}
    }
    //------------------------------------------//	
    	// 格式化表格显示日期
	function formatDatebox(value) {  
	    if (value == null || value == '') {  
	        return '';  
	    }  
	    var dt;  
	    if (value instanceof Date) {  
	        dt = value;  
	    } else {  
	        dt = new Date(value);  
	    }  
	  
	    return dt.format("yyyy-MM-dd"); //扩展的Date的format方法(上述插件实现)  
	}  
	

	// -------------------------------------------------//
    
    
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
		text : '结束编辑',
		iconCls : 'icon-save',
		handler : doSave
	}, {
		id : 'button-save',
		text : '保存',
		iconCls : 'icon-save',
		handler : doSaveAll
	}];
	// 定义列
	var columns = [ [ {
		field : 'id',
		title : '流水号',
		width : 80,
		align : 'center',
		hidden: true
		
	}, {
		field : 'investCode',
		title : '代码',
		width : 120,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				required: true
			}
		}
	}, {
		field : 'investName',
		title : '名称',
		width : 220,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				required: true
			}
		}
	},{
		field : 'investDate',
		title : '买入日期',
		width : 180,
		align : 'center',
		formatter: formatDatebox,
		editor :{
			 type : 'datebox',
			options : {
				editable:false,
				prompt: '请选择日期',
				required: true
			} 
		}
	},{
		field : 'investProfitDate',
		title : '收益日期',
		width : 180,
		align : 'center',
		formatter: formatDatebox,
		editor :{
			 type : 'datebox',
			options : {
				editable:false,
				prompt: '请选择日期',
				required: true
			} 
		}
	}, {
		field : 'investType',
		title : '投资类型',
		width : 120,
		align : 'center',
		editor :{
			type : 'validatebox',
			options : {
				required: true
			}
		}
	}, {
		field : 'investMoney',
		title : '投资金额',
		width : 100,
		align : 'center',
		editor :{
			type : 'numberbox',
			options : {
				precision:2,
				required:true		
			}
		},
		styler: function (value, row, index) {
            return 'color:red'
         }
	}, {
		field : 'investProfit',
		title : '投资收益',
		width : 100,
		align : 'center',
		editor :{
			type : 'numberbox',
			options : {
				precision:2						
			}
		},
		styler: function (value, row, index) {
            return 'color:red'
         }
	}, {
		field : 'annualizedRateReturn',
		title : '年化收益率(%)',
		width : 100,
		align : 'center',
		editor :{
			type : 'numberbox',
			options : {	
				precision:3,
				readonly:true		
			}
		},
		styler: function (value, row, index) {
            return 'color:red'
         }
	}, {
		field : 'tagStatus',
		title : '状态',
		width : 100,
		align : 'center',
		editor :{
			type:'checkbox',
			options:{
				on:'T',off:'F'
				}
		}
	}] ];
	
	$(function(){
		// 先将body隐藏，再显示，不会出现页面刷新效果
		$("body").css({visibility:"visible"});
		
		// 收派标准数据表格
		$('#grid').datagrid( {
			view: myview,//重写datagrid,改变footer的样式
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			pageList: [100,150,200],
			pageSize: 100,
			pagination : true,
			toolbar : toolbar,
			url :  "/assets/InvestBank/investBankList",
			idField : 'id',
			columns : columns,
			onDblClickRow : doDblClickRow,
			showFooter: true,		 	
			rowStyler: function(index,row){			
				if (row.investType == "合  计"){					
					return 'background-color:#E0ECFF;color:red;font-weight:bold;height:40px;';
				}
			}
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