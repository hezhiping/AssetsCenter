<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信用借款</title>
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
	//绑定事件
	/* $("#save").click(function() {
		var ids = [];
		var items = $('#addItem').datagrid('getSelections');

		if (items == null || items == 'undefined') {
			$.messager.alert('提示', '未选中记录!');
			return;
		}			
		for (var i = 0; i < items.length; i++) {
			ids.push(items[i].costCode);
		}			
		$.post("/assets/UserConstDic/AddUserCreditLoanDic/" + ids,
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
	}); */
});
</script>
</head>
<body class="easyui-layout">
	<div region="center" border="false">
	<table border="1" style="border-style: solid; border-width: 1px; border-color:#6293BB; border-collapse: collapse; text-align: center; font-size: 14px;">
		<tr height="30px"></tr>
		<tr>
			<td width="1000px">			
				<!-- <table id ="creditLoan"></table> -->
				<!-- ***********信用借款详细表************** -->
				<table class="easyui-datagrid" id="creditLoan"
				data-options="singleSelect:true,border:false,striped:true,url:'/assets/CreditLoan/getCreditLoan',
				method:'get',showFooter: true,
				rowStyler: function(index,row){
					if (row.constName == '合 计'){
						return 'background-color:#6293BB;color:#fff;font-weight:bold;';
					}
				}
				">
					<thead>
						<tr>						
							<th data-options="field:'constName',width:160"></th>
							<th data-options="field:'openingBalance',width:160">期初余额</th>
							<th data-options="field:'currentUse',width:160">本期使用</th>
							<th data-options="field:'currentRepay',width:160">本期偿还</th>
							<th data-options="field:'endingBalance',width:160">期末余额</th>	
						</tr>
					</thead>
				</table>				
			</td>
		</tr>
		<tr height="40px"></tr>
		<tr>
			<td width="1000px">
				<!-- <table id ="creditLoanAmount"></table> -->
				<!-- ***********信用借款额度表************** -->
				<table class="easyui-datagrid" id="creditLoanAmount"
				data-options="singleSelect:true,border:false,striped:true,url:'/assets/CreditLoan/getCreditLoanAmount',
				method:'get',showFooter: true,
				rowStyler: function(index,row){
					if (row.constName == '合 计'){
						return 'background-color:#6293BB;color:#fff;font-weight:bold;';
					}
				}">
					<thead>
						<tr>						
							<th data-options="field:'constName',width:160"></th>
							<th data-options="field:'creditAmount',width:160">信用额度</th>
							<th data-options="field:'creditExposure',width:160">信用敞口</th>							
						</tr>
					</thead>
				</table>				
			</td>
		</tr>
	</table>
	
		<!-- <div
			style="margin-top: 60px; width: 800px; height: 500px; margin-left: -400px; position: absolute; left: 50%;">
			<div style="float: left;">
				<div class="easyui-panel" title="信用借款" collapsible="false"
					minimizable="false" maximizable="false"
					style="top: 120px; left: 200px; width: 300px; height: 450px;">
					<table id="showItem"></table>
				</div>
			</div>
			
			<div style="float: left; margin-left: 160px;">
				<div class="easyui-panel" title="信用借款额度" collapsible="false"
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
		</div> -->
	</div>
</body>
</html>
