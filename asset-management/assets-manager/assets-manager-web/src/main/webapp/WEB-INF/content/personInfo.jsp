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

</script>

</head>
<body class="easyui-layout" >
	<div region="center" border="false" class="easyui-dialog"
		title="添加固定资产项" id="addFixedAssetsWindow" collapsible="false"
		minimizable="false" maximizable="false" style="top: 40px; left: 200px"
		toolbar="#toolbar">

		<div id="toolbar" class="datagrid-toolbar" split="false"
			border="false">
			<a id="save" icon="icon-save" href="#" plain="true">保存</a>
		</div>

		<form id="addFixedAssetsForm"
			action="/assets/FixedAssets/addFixedAssets" method="post">
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
					<td width="60%"><input type="text" name="currentYear"
						class="easyui-validatebox" required="true"
						style="width: 96%; height: 22px" /></td>
				</tr>
				<tr>
					<td width="30%">月份：</td>
					<td width="60%"><input type="text" name="currentMonth"
						class="easyui-validatebox" style="width: 96%; height: 22px" /></td>
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
</body>
<script type="text/javascript">
	$(function() {
		//绑定事件
		$("#save").click(function() {
			//校验表单输入项
			var v = $("#addFixedAssetsForm").form("validate");
			if (v) {
				//校验通过，提交表单
				$("#addFixedAssetsForm").submit();
				//alert("baocun");
			}
		});
	});
</script>
</html>
