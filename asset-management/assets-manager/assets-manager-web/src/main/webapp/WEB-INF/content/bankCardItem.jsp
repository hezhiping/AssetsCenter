<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>银行卡管理</title>
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
<script
	src="${pageContext.request.contextPath }/js/easyui/outOfBounds.js"
	type="text/javascript"></script>
<script type="text/javascript">
var editIndex ;//全局的行索引

function endEditing(){
	if (editIndex == undefined){return true}
	if ($('#showItem').datagrid('validateRow', editIndex)){			
			$('#showItem').datagrid('endEdit', editIndex);
			editIndex = undefined;
			return true;
		
	} else {			
		return false;
	}
}
// 单击行修改数据
function doClickRow(rowIndex, rowData){
	if(rowIndex != editIndex ){ //判断正在编辑的行和双击选中的行是否相等
		if(endEditing()){ // 验证内容是否通过，通过结束当前编辑行，开启双击选中行			
			 $('#showItem').datagrid('endEdit', editIndex);
			 $('#showItem').datagrid('beginEdit',rowIndex);
				editIndex = rowIndex;				
		}
	}else{			
		$('#showItem').datagrid('beginEdit',rowIndex);
		editIndex = rowIndex;		
	}		
}

//结束编辑
function doCancle(){		
	 if (endEditing()) { 			
			$("#showItem").datagrid('endEdit',editIndex );			
		 }else{
			 $.messager.alert("提示","请填写完必填项");
		 }
}

	// 定义标题栏
	var frozenShowColumns = [ [{
		field : 'id',
		title : '编号',
		hidden : true
	}, {
		field : 'costName',
		title : '银行卡',
		width : 160
	},{		
		field : 'beginMoney',
		title : '期初金额',
		width : 300,
		editor :{
			type : 'numberbox',
			options : {
				precision:2		
			}
		},
		styler: function (value, row, index) {
            return 'color:red'
         }
	} ] ];

	//定义冻结列
	var frozenAddColumns = [ [ {
		field : 'costCode',
		checkbox : true,
		width : 100,
	} ] ];

	// 定义标题栏
	var addColumns = [ [ {		
		field : 'category',
		title : '参数类别',
		hidden:true
	},{		
		field : 'zhCnCaption',
		title : '银行卡',
		width : 360,
	} ] ];

	$(function() {
		// 初始化 datagrid
		// 创建grid
		$('#showItem').datagrid({
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			striped : true,
			url : "/assets/UserConstDic/getUserBankCardDic",
			method : 'get',			
			frozenColumns : frozenShowColumns,
			onClickRow : doClickRow,
		});

		$('#addItem').datagrid({
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			singleSelect : false,
			striped : true,
			url : "/assets/Dictionary/getUserBankCardAllDic",
			method : 'get',
			idField : 'id',
			frozenColumns : frozenAddColumns,
			columns : addColumns
			
		});

		$("body").css({
			visibility : "visible"
		});
	});
	$(function() {
		//绑定事件
		$("#save").click(function() {
			var ids = [];
			var items = $('#addItem').datagrid('getSelections');

			if (items == null || items == 'undefined') {
				$.messager.alert('提示', '未选中记录!');
				return;
			}			
			for (var i = 0; i < items.length; i++) {
				ids.push(items[i].costCode);
			}			
			$.post("/assets/UserConstDic/AddUserBankCardDic/" + ids,
				function(result) {
					if (result.status == 200) {
						$.messager.alert('提示', '保存成功!', undefined,
								function() {									
									$('#showItem').datagrid('reload');
									$('#addItem').datagrid('uncheckAll');
								});
					} else {
						$.messager.alert("提示", result.data);
					}
			});	
		});
		//绑定事件
		$("#showSave").click(function() {			  
			   var updateList = [];//定义一个数据
		        var updateRows = $('#showItem').datagrid('getChanges','updated');
		        $('#showItem').datagrid('acceptChanges');
		        if (updateRows.length <= 0) {
		            $.messager.alert("提示", "未修改数据，无需保存！", "info");
		            return false;
		        } else {		         
		            var updateRow;		           
		            // 修改的数据
		            for (var i = 0; i < updateRows.length; i++) { //for循环遍历添加的行
		            	updateRow = updateRows[i];
		            //拼接数据为json格式		            	
	               		updateList.push({"id":updateRow.id,"costCode":updateRow.costCode,"beginMoney":updateRow.beginMoney,"category":updateRow.category,"psnCode":updateRow.psnCode});	
		            }
		            console.log(updateList);
		            $.ajax({
		                type: "POST",
		                url: "/assets/UserConstDic/saveBankCardBeginMoney",
		                contentType:'application/json;charset=UTF-8',//关键是要加上这行
		                traditional:true,//这使json格式的字符不会被转码
		                dataType: 'JSON',
		                data:JSON.stringify(updateList),
		                success: function (data) {
		                	 console.log(data);
		                    $('#showItem').datagrid('acceptChanges', 'updated');
		                    if (data.status == 200) {
		                    	editIndex = undefined;
		                        //重载记录
		                        $('#showItem').datagrid('reload');		                      
		                    }
		                    else {
		                        $.messager.alert("提示",data.msg);
		                        return false;
		                    }	                   
		                }
		            });
		        }
		});
		//绑定事件
		$("#showCancle").click(function() {		
			doCancle();
		});
	});
</script>
</head>
<body class="easyui-layout">
	<div region="center" border="false">
		<div
			style="margin-top: 60px; width: 900px; height: 500px; margin-left: -450px; position: absolute; left: 50%;">
			<div style="float: left;">
				<div class="easyui-panel" title="已配置银行卡" collapsible="false"
					minimizable="false" maximizable="false"
					style="top: 120px; left: 300px; width: 400px; height: 450px;">
					<div id="add-toolbar" class="datagrid-toolbar" split="false"
						border="false">
						<a id="showSave" icon="icon-save" href="#" class="easyui-linkbutton"
							plain="true">保存</a>
						<a id="showCancle" icon="icon-undo" href="#" class="easyui-linkbutton"
							plain="true">取消</a>
					</div>
					<table id="showItem"></table>
				</div>
			</div>
			<p style=" left:50%; width:100px; margin-left:-4%; top:50%;font-size:120%; position: absolute;">《《《《《《《《《</p>
			<div style="float: left; margin-left: 160px;">
				<div class="easyui-panel" title="全部银行卡" collapsible="false"
					minimizable="false" maximizable="false"
					style="top: 120px; left: 450px; width: 300px; height: 450px;"
					toolbar="#add-toolbar">
					<div id="add-toolbar" class="datagrid-toolbar" split="false"
						border="false">
						<a id="save" icon="icon-save" href="#" class="easyui-linkbutton"
							plain="true">保存</a>
					</div>
					<table id="addItem"></table>

				</div>
			</div>
		</div>
	</div>
</body>
</html>
