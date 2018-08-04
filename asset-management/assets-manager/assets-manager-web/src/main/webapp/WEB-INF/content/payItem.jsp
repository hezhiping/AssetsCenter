<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>支出项管理</title>
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
	
	// 定义标题栏
	var showColumns = [ [ {
		field : 'assetName',
		title : '固定资产名称',
		width : 160,
	} ] ];

	//定义冻结列
	var frozenAddColumns = [ [ {
		field : 'id',
		checkbox : true,
		width : 160,
	} ] ];

	// 定义标题栏
	var addColumns = [ [ {
		field : 'assetName',
		title : '固定资产名称',
		width : 160,
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
			url : "/assets/FixedAssets/fixedAssetsList",
			method : 'get',			
			columns : showColumns
		});

		$('#addItem').datagrid({
			iconCls : 'icon-forward',
			fit : true,
			border : true,
			rownumbers : true,
			singleSelect : false,
			striped : true,
			url : "/assets/FixedAssets/fixedAssetsList",
			method : 'get',
			idField : 'id',
			frozenColumns : frozenAddColumns,
			columns : addColumns
		});

		$("body").css({
			visibility : "visible"
		});
	});
</script>
</head>
<body class="easyui-layout">
	<div region="center" border="false">
		<div
			style="margin-top: 30px; width: 800px; height: 500px; margin-left: -400px; position: absolute; left: 50%;">
			<div style="float: left;">
				<div class="easyui-panel" title="已配置支出项" collapsible="false"
					minimizable="false" maximizable="false"
					style="top: 120px; left: 200px; width: 300px; height: 450px;">
					<table id="showItem"></table>
				</div>
			</div>
			<p style=" left:50%; width:100px; margin-left:-11%;; top:50%;font-size:120%; position: absolute;">《《《《《《《《《</p>
			<div style="float: left; margin-left: 160px;">
				<div class="easyui-panel" title="全部支出项" collapsible="false"
					minimizable="false" maximizable="false"
					style="top: 120px; left: 400px; width: 300px; height: 450px;"
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
