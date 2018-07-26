<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据字典参数类别管理</title>
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
	// 工具栏
	var toolbar = [ {
		id : 'button-view',
		text : '编辑',
		iconCls : 'icon-edit',
		handler : doEdit
	}, {
		id : 'button-add',
		text : '新增',
		iconCls : 'icon-add',
		handler : doAdd
	}, {
		id : 'button-delete',
		text : '删除',
		iconCls : 'icon-cancel',
		handler : doDelete
	} ];
	//定义冻结列
	var frozenColumns = [ [ {
		field : 'id',
		checkbox : true,		
		width : 160,
	} ] ];

	// 定义标题栏
	var columns = [ [ 
	{
		field : 'category',
		title : '类别编号',
		width : 160,
		align : 'center'
	},	{
		field : 'cdescription',
		title : '类别中文描述',
		width : 160,
	}, {
		field : 'edescription',
		title : '类别英文描述',
		width : 160,
		align : 'center'
	}, {
		field : 'query_sql',
		title : '动态Sql',
		width : 160,
		align : 'center'
	} ] ];
	$(function() {
		// 初始化 datagrid
		// 创建grid
		$('#grid').datagrid({
			iconCls : 'icon-forward',
			fit : true,
			border : false,
			rownumbers : true,
			singleSelect : true,
			striped : true,
			toolbar : toolbar,
			url : "",
			method : 'get',
			pageList : [ 3, 5, 10 ],
			pagination : true,
			idField : 'id',
			frozenColumns : frozenColumns,
			columns : columns,
			onClickRow : onClickRow,
			onDblClickRow : doDblClickRow
		});

		$("body").css({
			visibility : "visible"
		});

		// 添加取派员窗口
		$('#addCategoryWindow').window({
			title : '添加菜单',
			width : 480,
			modal : true,//遮罩效果
			shadow : true,//阴影效果
			closed : true,//关闭状态
			height : 450,
			top : ($(window).height() - 450) * 0.5,
			left : ($(window).width() - 480) * 0.5,
			resizable : false
		//是否可以调整大小
		});

		// 修改取派员窗口
		$('#editCategoryWindow').window({
			title : '修改菜单',
			width : 480,
			modal : true,//遮罩效果
			shadow : true,//阴影效果
			closed : true,//关闭状态
			height : 450,
			top : ($(window).height() - 450) * 0.5,
			left : ($(window).width() - 480) * 0.5,
			resizable : false
		//是否可以调整大小
		});

	});
	//双击
	function doDblClickRow(rowIndex, rowData) {
		var items = $('#grid').datagrid('selectRow', rowIndex);
		doEdit();
	}
	// 单击
	function onClickRow(rowIndex) {

	}

	function doAdd() {
		//location.href = "addCategoryWindow";
		$('#addCategoryWindow').window("open");
	}

	function doEdit() {				
		var item = $('#grid').datagrid('getSelected');	
		$('#editCategoryWindow').window("open");
		$('#editCategoryForm').form('load', item);
	}

	function doDelete() {
		var ids = [];
		var items = $('#grid').datagrid('getSelections');
		
		if(items.length == 0){
    		$.messager.alert('提示','未选中记录!');
    		return ;
    	}
		$.messager.confirm('确认','您确认想要删除记录吗？',function(r){    
		    if (r){	    	
				for (var i = 0; i < items.length; i++) {
					ids.push(items[i].resourceId);
				}
				var params = {"ids":ids};
				$.post("/assets/Category/deleteCategory/"+ids, function (result) {
	                  if (result.status == 200) {
	                	  $.messager.alert('提示','删除成功!',undefined,function(){
	                	 // window.location.reload();// 刷新当前页面
	                		$('#grid').datagrid('reload');
		      				$('#grid').datagrid('uncheckAll');
          				});	                		
	                  } else {
	                      $.messager.alert("提示", result.data);
	                  }
	              });				
		    }    
		});  	
	}
</script>
</head>
<body class="easyui-layout" style="visibility: hidden;">
	<div region="center" border="false">
		<table id="grid"></table>
	</div>
	<div class="easyui-window" title="添加参数类别" id="addCategoryWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 40px; left: 200px">
		<div region="north" split="false" border="false">
			<div class="datagrid-toolbar">
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton"
					plain="true">保存</a>

			</div>
		</div>

		<div region="center" style="overflow: auto; padding: 5px;"
			border="false">
			<form id="addCategoryForm" action="/assets/Category/addCategory" method="post">
				<table class="table-edit" align="center">
					<tr class="title">
						<td colspan="2">参数类别信息</td>
					</tr>
					<tr>
						<td >类别编号：</td>
						<td ><input type="text" name="category"
							class="easyui-validatebox" required="true"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">类别中文描述：</td>
						<td width="60%"><input type="text" name="cdescription"
							class="easyui-validatebox" required="true"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">类别英文描述：</td>
						<td width="60%"><input type="text" name="edescription"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">动态Sql：</td>
						<td width="60%"><input type="text" name="query_sql"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>					
				</table>
			</form>
		</div>
	</div>

	<!-- 修改窗口 -->
	<div class="easyui-window" title="修改菜单" id="editCategoryWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 20px; left: 200px">
		<div region="north" style="height: 40px; overflow: hidden;"
			split="false" border="false">
			<div class="datagrid-toolbar">
				<a id="edit" icon="icon-save" href="#" class="easyui-linkbutton"
					plain="true">保存</a>

			</div>
		</div>

		<div region="center" style="overflow: auto; padding: 5px;"
			border="false">
			<form id="editCategoryForm" action="/assets/Category/modifyCategory" method="post">
				<!-- <input type="hidden" name="id"> -->
				<table class="table-edit"  align="center">
					<tr class="title">
						<td colspan="2">参数类别信息</td>
					</tr>
					<tr>
						<td >类别编号：</td>
						<td ><input type="text" name="category"
							class="easyui-validatebox" required="true"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">类别中文描述：</td>
						<td width="60%"><input type="text" name="cdescription"
							class="easyui-validatebox" required="true"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">类别英文描述：</td>
						<td width="60%"><input type="text" name="edescription"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">动态Sql：</td>
						<td width="60%"><input type="text" name="query_sql"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>					
				</table>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
		$(function(){
			//绑定事件
			$("#save").click(function(){
				//校验表单输入项
				var v = $("#addCategoryForm").form("validate");
				if(v){
					//校验通过，提交表单
					$("#addCategoryForm").submit();
					//alert("baocun");
				}
			});
		});
	 
		$(function(){
			//绑定事件
			$("#edit").click(function(){
				//校验表单输入项
				var v = $("#editCategoryForm").form("validate");
				if(v){
					//校验通过，提交表单
					$("#editCategoryForm").submit();					
				}
			});
		});
	</script>
</html>
