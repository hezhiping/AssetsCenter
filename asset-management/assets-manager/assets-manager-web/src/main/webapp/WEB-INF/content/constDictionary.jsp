<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>数据字典管理</title>
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
	$(function() {

		$("body").css({
			visibility : "visible"
		});

		// 添加取派员窗口
		$('#addDictionaryWindow').window({
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
		$('#editDictionaryWindow').window({
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
		//location.href = "addDictionaryWindow";
		$('#addDictionaryWindow').window("open");
	}

	function doEdit() {
		var item = $('#grid').datagrid('getSelected');
		if(item == null || item =='undefined'){
			$.messager.alert('提示','未选中记录!');
    		return ;
		}	
		$('#editDictionaryWindow').window("open");
		$('#editDictionaryForm').form('load', item);
	}

	function doDelete() {
		var ids = [];
		var items = $('#grid').datagrid('getSelections');
		if(items == null || items =='undefined'){
			$.messager.alert('提示','未选中记录!');
    		return ;
		}
		$.messager.confirm('确认', '您确认想要删除记录吗？', function(r) {
			if (r) {
				for (var i = 0; i < items.length; i++) {
					ids.push(items[i].category + "-" + items[i].costCode);
				}
				alert(ids);
				$.post("/assets/Dictionary/deleteDictionary/" + ids, function(
						result) {
					if (result.status == 200) {
						$.messager.alert('提示', '删除成功!', undefined, function() {
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
		<table class="easyui-datagrid" id="grid"
			data-options="singleSelect:true,pagination:true,fit:true,border:false,rownumbers:true,striped:true,url:'/assets/Dictionary/dictionaryList',
			method:'get',pageList:[3,5,10],toolbar:'#toolbar',onClickRow:onClickRow,onDblClickRow:doDblClickRow">
			<thead>
				<tr>
					<th data-options="field:'ck',checkbox:true"></th>
					<th data-options="field:'category',width:160">所属类别</th>
					<th data-options="field:'costCode',width:160">常数代码</th>
					<th data-options="field:'zhCnCaption',width:160">简体中文</th>
					<th data-options="field:'enUsCaption',width:160">英文</th>
					<th data-options="field:'zhTwCaption',width:160">繁体中文</th>
					<th data-options="field:'seqNo',width:80">序号</th>
					<th data-options="field:'levelNo',width:80">级别</th>
					<th data-options="field:'constType',width:120">属性类型</th>
					<th
						data-options="field:'remark',width:320,formatter:formatCellTooltip">备注</th>

				</tr>
			</thead>
		</table>
	</div>
	<div id="toolbar">
		<a id="button-view" href="javascript:void(0)"
			class="easyui-linkbutton" text="编辑" iconCls="icon-edit"
			onclick="doEdit()"></a> <a id="button-add" href="javascript:void(0)"
			class="easyui-linkbutton" iconCls="icon-add" onclick="doAdd()">新增</a>
		<a id="button-delete" href="javascript:void(0)"
			class="easyui-linkbutton" iconCls="icon-cancel" onclick="doDelete()">删除</a>
	</div>
	<div class="easyui-dialog" title="添加常数" id="addDictionaryWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 40px; left: 200px" toolbar="#add-toolbar">
		<div id="add-toolbar" class="datagrid-toolbar">
			<a id="save" icon="icon-save" href="#" class="easyui-linkbutton"
				plain="true">保存</a>
		</div>

		<div region="center" style="overflow: auto; padding: 5px;"
			border="false">
			<form id="addDictionaryForm"
				action="/assets/Dictionary/addDictionary" method="post">
				<table class="table-edit" align="center">
					<tr class="title">
						<td colspan="2">常数信息</td>
					</tr>
					<!-- TODO 这里完善菜单添加 table -->

					<tr>
						<td>所属类别：</td>
						<td><input class="easyui-combobox" name="category"
							data-options="
								url:'/assets/Category/getCategoryCombox', 
								valueField:'category',
								textField:'cdescription',
			                    required:true,
			                    editable:false"
							style="width: 100%; height: 24px"> <!-- <input type="text" name="category" class="easyui-validatebox" required="true" style="width: 96%; height: 22px" /> -->
						</td>
					</tr>
					<!-- <tr>
						<td width="30%">常数代码：</td>
						<td width="60%"><input type="text" name="costCode"
							class="easyui-validatebox" required="true"
							style="width: 96%; height: 22px" /></td>
					</tr> -->
					<tr>
						<td width="30%">简体中文：</td>
						<td width="60%"><input type="text" name="zhCnCaption"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">英文：</td>
						<td width="60%"><input type="text" name="enUsCaption"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">繁体中文：</td>
						<td width="60%"><input type="text" name="zhTwCaption"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">序号：</td>
						<td width="60%"><input type="text" name="seqNo"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">级别：</td>
						<td width="60%"><input type="text" name="levelNo"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="16%">属性类型：</td>
						<td width="84%"><input type="text" name="constType"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>

					</tr>
					<tr>
						<td width="16%">备注：</td>
						<td width="84%"><input type="text" name="remark"
							class="easyui-textbox" data-options="multiline:true"
							style="width: 100%; height: 60px" /></td>

					</tr>
				</table>
			</form>
		</div>
	</div>

	<!-- 修改窗口 -->
	<div class="easyui-dialog" title="修改菜单" id="editDictionaryWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 20px; left: 200px" toolbar="#edit-toolbar">
		<div id="edit-toolbar" class="datagrid-toolbar" >
			<a id="edit" icon="icon-save" href="#" class="easyui-linkbutton"
				plain="true">保存</a>
		</div>

		<div region="center" style="overflow: auto; padding: 5px;"
			border="false">
			<form id="editDictionaryForm"
				action="/assets/Dictionary/modifyDictionary" method="post">
				<!-- <input type="hidden" name="id"> -->
				<table class="table-edit" align="center">
					<tr class="title">
						<td colspan="2">常数信息</td>
					</tr>
					<!-- TODO 这里完善菜单添加 table -->

					<tr>
						<td>所属类别：</td>
						<td><input class="easyui-combobox" name="category"
							data-options="
								url:'/assets/Category/getCategoryCombox', 
								valueField:'category',
								textField:'cdescription',
			                    required:true,
			                    editable:false"
							style="width: 100%; height: 24px"> <!-- <input type="text" name="category" class="easyui-validatebox" required="true" style="width: 96%; height: 22px" /> -->

						</td>
					</tr>
					<tr>
						<td width="30%">常数代码：</td>
						<td width="60%"><input type="text" name="costCode"
							class="easyui-validatebox" readonly="readonly"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">简体中文：</td>
						<td width="60%"><input type="text" name="zhCnCaption"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">英文：</td>
						<td width="60%"><input type="text" name="enUsCaption"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">繁体中文：</td>
						<td width="60%"><input type="text" name="zhTwCaption"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">序号：</td>
						<td width="60%"><input type="text" name="seqNo"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">级别：</td>
						<td width="60%"><input type="text" name="levelNo"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="16%">属性类型：</td>
						<td width="84%"><input type="text" name="constType"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>

					</tr>
					<tr>
						<td width="16%">备注：</td>
						<td width="84%"><input type="text" name="remark"
							class="easyui-textbox" data-options="multiline:true"
							style="width: 100%; height: 60px" /></td>

					</tr>
				</table>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		//绑定事件
		$("#save").click(function() {
			//校验表单输入项
			var v = $("#addDictionaryForm").form("validate");
			if (v) {
				//校验通过，提交表单
				$("#addDictionaryForm").submit();
				//alert("baocun");
			}
		});
	});

	$(function() {
		//绑定事件
		$("#edit").click(function() {
			//校验表单输入项
			var v = $("#editDictionaryForm").form("validate");
			if (v) {
				//校验通过，提交表单
				$("#editDictionaryForm").submit();
			}
		});
	});
	//格式化单元格提示信息  
	function formatCellTooltip(value) {
		return "<span title='" + value + "'>" + value + "</span>";
	}
</script>
</html>
