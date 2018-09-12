<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>货币资金</title>
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
	
});
</script>
</head>
<body class="easyui-layout">
	<div region="center" border="false">
	<table border="1" style="border-style: solid; border-width: 1px; border-color:#6293BB; border-collapse: collapse; text-align: center; font-size: 14px;">
		<tr height="30px"></tr>
		<tr>
			<td width="1000px">					
				<!-- ***********银行卡金额表************** -->
				<table class="easyui-datagrid" id="creditLoan"
				data-options="singleSelect:true,border:false,striped:true,url:'/assets/CurrencyFund/getBankCard',
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
							<th data-options="field:'periodIncom',width:160">本期收到</th>
							<th data-options="field:'periodPay',width:160">本期支付</th>
							<th data-options="field:'endingBalance',width:160">期末余额</th>	
						</tr>
					</thead>
				</table>				
			</td>
		</tr>
		<tr height="40px"></tr>
		<tr>
			<td width="1000px">				
				<!-- ***********线上支付金额表************** -->
				<table class="easyui-datagrid" id="creditLoanAmount"
				data-options="singleSelect:true,border:false,striped:true,url:'/assets/CurrencyFund/getOnlineBank',
				method:'get',showFooter: true,
				rowStyler: function(index,row){
					if (row.constName == '合 计'){
						return 'background-color:#6293BB;color:#fff;font-weight:bold;';
					}
				}">
					<thead>
						<tr>						
							<th data-options="field:'constName',width:160"></th>
							<th data-options="field:'openingBalance',width:160">期初余额</th>
							<th data-options="field:'periodIncom',width:160">本期收到</th>
							<th data-options="field:'periodPay',width:160">本期支付</th>
							<th data-options="field:'endingBalance',width:160">期末余额</th>							
						</tr>
					</thead>
				</table>				
			</td>
		</tr>
	</table>
	</div>
</body>
</html>
