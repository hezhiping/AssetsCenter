<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>菜单管理</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link rel="stylesheet" type="text/css"
	href="/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="/js/easyui/ext/portal.css">
<link rel="stylesheet" type="text/css"
	href="/css/default.css">
<script type="text/javascript"
	src="/js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="/js/easyui/ext/jquery.portal.js"></script>
<script type="text/javascript"
	src="/js/easyui/ext/jquery.cookie.js"></script>
<script
	src="/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script
	src="/js/easyui/outOfBounds.js"
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
	

	$(function() {
		// 初始化 datagrid
		// 创建grid	

		
		// 添加取派员窗口
		$('#addMenuWindow').window({
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
		$('#editMenuWindow').window({
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
		//location.href = "addMenuWindow";
		$('#addMenuWindow').window("open");
	}

	function doEdit() {
		$('#editMenuWindow').window("open");
		var item = $('#grid').datagrid('getSelected');
		console.info(item);
		//window.location.href = "edit.html";
	}

	function doDelete() {
		alert("删除用户");
		var ids = [];
		var items = $('#grid').datagrid('getSelections');
		for (var i = 0; i < items.length; i++) {
			ids.push(items[i].id);
		}

		console.info(ids.join(","));

		$('#grid').datagrid('reload');
		$('#grid').datagrid('uncheckAll');
	}
	//assets/menu/list
</script>
</head>
<body class="easyui-layout" style="visibility: hidden;">
	<div region="center" border="false">
		<!-- <table id="grid"></table> -->
	
		<table class="easyui-datagrid" id="grid" title="菜单列表" 
       data-options="iconCls:'icon-forward',singleSelect:false,rownumbers:true,striped:true,border:false,fit:true,collapsible:true,pagination:true,url:'',method:'get',pageSize:30,toolbar:toolbar">
    	<thead>
        <tr>
        	<th data-options="field:'ck',checkbox:true"></th>
        	<th data-options="field:'id',width:60">商品ID</th>
            <th data-options="field:'title',width:200">商品标题</th>
            <th data-options="field:'cid',width:100">叶子类目</th>
            <th data-options="field:'sellPoint',width:100">卖点</th>
            <th data-options="field:'price',width:70,align:'right'">价格</th>
            <th data-options="field:'num',width:70,align:'right'">库存数量</th>
            <th data-options="field:'barcode',width:100">条形码</th>
            <th data-options="field:'status',width:60,align:'center'">状态</th>
            <th data-options="field:'created',width:130,align:'center'">创建日期</th>
            <th data-options="field:'updated',width:130,align:'center'">更新日期</th>
        </tr>
    </thead>
</table>
	</div>
	<div class="easyui-window" title="添加菜单" id="addMenuWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 40px; left: 200px">
		<div region="north"	split="false" border="false">
			<div class="datagrid-toolbar" >
				<a id="save" icon="icon-save" href="#" class="easyui-linkbutton"
					plain="true">保存</a>

			</div>
		</div>

		<div region="center" style="overflow: auto; padding: 5px; "
			border="false">
			<form id="addMenuForm" action="" method="post">				
				<table class="table-edit" width="90%" align="center">
					<tr class="title">
						<td colspan="2">菜单信息</td>
					</tr>
					<!-- TODO 这里完善收派员添加 table -->

					<tr>
						<td width="30%">菜单编号：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">菜单名称：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">菜单类别：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">跳转URL：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">父级菜单编号：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">菜单状态：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="16%">备注：</td>
						<td width="84%"><input type="text"  name="name"  class="easyui-textbox"
							 style="width: 100%; height: 22px" />
							 	</td>
							 
					</tr>
				</table>
			</form>
		</div>
	</div>

	<!-- 修改窗口 -->
	<div class="easyui-window" title="修改菜单" id="editMenuWindow"
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
			<form id="editMenuForm" action="" method="post">
				<input type="hidden" name="id">
			<table class="table-edit" width="90%" align="center">
					<tr class="title">
						<td colspan="2">菜单信息</td>
					</tr>
					<!-- TODO 这里完善收派员添加 table -->
					<tr>
						<td width="30%">菜单编号：</td>
						<td width="60%"><input type="text" name="name" class="easyui-text"
							required="true" readonly="readonly" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">菜单名称：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">菜单类别：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">跳转URL：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">父级菜单编号：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">菜单状态：</td>
						<td width="60%"><input type="text" name="name" class="easyui-validatebox"
							required="true" style="width: 80%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="16%">备注：</td>
						<td width="84%"><input type="text"  name="name"  class="easyui-textbox"
							 style="width: 100%; height: 22px" />
							 	</td>
							 
					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
<!-- <script type="text/javascript">
					$(function(){
						//绑定事件
						$("#save").click(function(){
							//校验表单输入项
							var v = $("#addStaffForm").form("validate");
							if(v){
								//校验通过，提交表单
								$("#addStaffForm").submit();
							}
						});
					});
				</script> -->
<!-- <script type="text/javascript">
					$(function(){
						//绑定事件
						$("#edit").click(function(){
							//校验表单输入项
							var v = $("#editStaffForm").form("validate");
							if(v){
								//校验通过，提交表单
								$("#editStaffForm").submit();
							}
						});
					});
				</script> -->
</html>
