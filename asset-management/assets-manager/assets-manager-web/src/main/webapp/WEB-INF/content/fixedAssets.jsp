<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>固定资产管理</title>
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
	var columns = [ [ {
		field : 'assetName',
		title : '固定资产名称',
		width : 160,
	}, {
		field : 'currentYear',
		title : '年',
		width : 80,
		align : 'center'
	}, {
		field : 'currentMonth',
		title : '月份',
		width : 80,
		align : 'center'
	}, {
		field : 'assetMoney',
		title : '资产金额',
		width : 160,
		align : 'center'
	}, {
		field : 'tagStatus',
		title : '状态',
		width : 160,
		align : 'center'
	}, {
		field : 'assetRemark',
		title : '备注',
		width : 320,
		align : 'center'
	}, {
		field : 'createDate',
		title : '创建时间',
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
			url : "/assets/FixedAssets/fixedAssetsList",
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
		$('#addFixedAssetsWindow').window({
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
		$('#editFixedAssetsWindow').window({
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
		//location.href = "addFixedAssetsWindow";
		$('#addFixedAssetsWindow').window("open");
	}

	function doEdit() {
		var item = $('#grid').datagrid('getSelected');
		if (item == null || item == 'undefined') {
			$.messager.alert('提示', '未选中记录!');
			return;
		}
		$('#editFixedAssetsWindow').window("open");
		$('#editFixedAssetsForm').form('load', item);
	}

	function doDelete() {
		var ids = [];
		var items = $('#grid').datagrid('getSelections');

		if (items == null || items == 'undefined') {
			$.messager.alert('提示', '未选中记录!');
			return;
		}
		$.messager.confirm('确认', '您确认想要删除记录吗？', function(r) {
			if (r) {
				for (var i = 0; i < items.length; i++) {
					ids.push(items[i].category);
				}
				var params = {
					"ids" : ids
				};
				$.post("/assets/FixedAssets/deleteFixedAssets/" + ids,
						function(result) {
							if (result.status == 200) {
								$.messager.alert('提示', '删除成功!', undefined,
										function() {
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
	<div class="easyui-dialog" title="添加固定资产项" id="addFixedAssetsWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 40px; left: 200px" toolbar="#add-toolbar">
		<div id="add-toolbar" class="datagrid-toolbar" split="false"
			border="false">
			<a id="save" icon="icon-save" href="#" class="easyui-linkbutton"
				plain="true">保存</a>
		</div>

		<div region="center" style="overflow: auto; padding: 5px;"
			border="false">
			<form id="addFixedAssetsForm"
				 method="post">
				<table class="table-edit" align="center">
					<tr class="title">
						<td colspan="2">添加固定资产项</td>
					</tr>
					<tr>
						<td>固定资产名称：</td>
						<td><input type="text" name="assetName"
							class="easyui-validatebox" required="true"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">金额：</td>
						<td width="60%"><input type="text" name="assetMoney"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">年：</td>
						<td width="60%"><input class="easyui-combobox"
							name="currentYear"
							data-options="
								url:'/assets/FixedAssets/getYear', 
								valueField:'dateKey',
								textField:'dateValue',
			                    required:true,
			                    editable:false"
							style="width: 100%; height: 24px">
					</tr>
					<tr>
						<td width="30%">月份：</td>
						<td width="60%"><input class="easyui-combobox"
							name="currentMonth"
							data-options="
								url:'/assets/FixedAssets/getMonth', 
								valueField:'dateKey',
								textField:'dateValue',
			                    required:true,
			                    editable:false"
							style="width: 100%; height: 24px"></td>
					</tr>
					<tr>
						<td width="30%">状态：</td>
						<td width="60%"><input checked="checked" name="tagStatus"
							style="width: 20px; height: 10px; background-color: white"
							type="radio" value="0" />正常 <input name="tag_status"
							style="width: 20px; height: 10px; background-color: white"
							type="radio" value="1" />冻结</td>
					</tr>
					<tr>
						<td width="16%">备注：</td>
						<td width="84%"><input type="text" name="assetRemark"
							class="easyui-textbox" data-options="multiline:true"
							style="width: 100%; height: 60px" /></td>

					</tr>
				</table>
			</form>
		</div>
	</div>

	<!-- 修改窗口 -->
	<div class="easyui-dialog" title="修改固定资产项" id="editFixedAssetsWindow"
		collapsible="false" minimizable="false" maximizable="false"
		style="top: 20px; left: 200px" toolbar="#edit-toolbar">
		<div id="edit-toolbar" class="datagrid-toolbar">
			<a id="edit" icon="icon-save" href="#" class="easyui-linkbutton"
				plain="true">保存</a>
		</div>

		<div region="center" style="overflow: auto; padding: 5px;"
			border="false">
			<form id="editFixedAssetsForm" method="post">
				<input type="hidden" name="id">
				<table class="table-edit" align="center">
					<tr class="title">
						<td colspan="2">修改固定资产项</td>
					</tr>
					<tr>
						<td>固定资产名称：</td>
						<td><input type="text" name="assetName"
							class="easyui-validatebox" readonly="readonly"
							style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">金额：</td>
						<td width="60%"><input type="text" name="assetMoney"
							class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
					</tr>
					<tr>
						<td width="30%">年：</td>
						<td width="60%"><input class="easyui-combobox"
							name="currentYear"
							data-options="
								url:'/assets/FixedAssets/getYear', 
								valueField:'dateKey',
								textField:'dateValue',
			                    required:true,
			                    editable:false"
							style="width: 100%; height: 24px">
					</tr>
					<tr>
						<td width="30%">月份：</td>
						<td width="60%"><input class="easyui-combobox"
							name="currentMonth"
							data-options="
								url:'/assets/FixedAssets/getMonth', 
								valueField:'dateKey',
								textField:'dateValue',
			                    required:true,
			                    editable:false"
							style="width: 100%; height: 24px"></td>
					</tr>
					<tr>
						<td width="30%">状态：</td>
						<td width="60%"><input checked="checked" name="tagStatus"
							style="width: 20px; height: 10px; background-color: white"
							type="radio" value="0" />正常 <input name="tag_status"
							style="width: 20px; height: 10px; background-color: white"
							type="radio" value="1" />冻结</td>
					</tr>
					<tr>
						<td width="16%">备注：</td>
						<td width="84%"><input type="text" name="assetRemark"
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
			var v = $("#addFixedAssetsForm").form("validate");
			if (v) {
				//校验通过，提交表单
				//$("#addFixedAssetsForm").submit();				
				$.ajax({
					//几个参数需要注意一下
					type : "POST",//方法类型
					//dataType : "json",//预期服务器返回的数据类型
					url : "/assets/FixedAssets/addFixedAssets",//url
					data : $('#addFixedAssetsForm').serialize(),
					success : function(result) {
						console.log(result);//打印服务端返回的数据(调试用)
						if (result.status == 200) {
							alert("success");
							  $('#addFixedAssetsWindow').dialog('close');
							// window.location.reload();// 刷新当前页面
								$('#grid').datagrid('reload');
						}else {
							$.messager.alert("提示",  result.status +" : " +result.msg);	
						}
					},
					error : function() {
						alert("异常！");
					}
				});
			}
		});
	});

	$(function() {
		//绑定事件
		$("#edit").click(function() {
			//校验表单输入项
			var v = $("#editFixedAssetsForm").form("validate");
			if (v) {
				//校验通过，提交表单
				//$("#editFixedAssetsForm").submit();
				$.ajax({
					//几个参数需要注意一下
					type : "POST",//方法类型
					//dataType : "json",//预期服务器返回的数据类型
					url : "/assets/FixedAssets/modifyFixedAssets",//url
					data : $('#editFixedAssetsForm').serialize(),
					success : function(result) {
						console.log(result);//打印服务端返回的数据(调试用)
						if (result.status == 200) {
							alert("success");
							  $('#editFixedAssetsWindow').dialog('close');
							// window.location.reload();// 刷新当前页面
								$('#grid').datagrid('reload');
						}else {
							 $.messager.alert("提示",  result.status +" : " +result.msg);							
						}
						
					},
					error : function() {
						alert("异常！");
					}
				});
			}
		});
	});
</script>
</html>
