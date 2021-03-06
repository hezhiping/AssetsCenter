<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib prefix="s" uri="/struts-tags" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页面</title>
<script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/style.css" />
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/style_grey.css" />
<style>
input[type=text] {
	width: 80%;
	height: 25px;
	font-size: 12pt;
	font-weight: bold;
	margin-left: 45px;
	padding: 3px;
	border-width: 0;
}

input[type=password] {
	width: 80%;
	height: 25px;
	font-size: 12pt;
	font-weight: bold;
	margin-left: 45px;
	padding: 3px;
	border-width: 0;
}

#codeInput {
	margin-left: 1px;
	margin-top: 1px;
}

#loginform\:vCode {
	margin: 0px 0 0 60px;
	height: 34px;
}
</style>
<script type="text/javascript">
	if(window.self != window.top){
		window.top.location = window.location;
	}
</script>
</head>
<body style="background:#eaedf1;">
	<div
		style="width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: -280px;">
		<%-- <img src="${pageContext.request.contextPath }/images/logo.png" style="border-width: 0; margin-left: 0;" /> --%>
		<span style="float: right; margin-top: 35px; color: #488ED5;">资产管理中心系统，更好的管理自己的资产!</span>
	</div>
	<div class="main-inner" id="mainCnt"
		style="border-bottom-left-radius: 20px;border-bottom-right-radius:  20px;border-top-left-radius:  20px;border-top-right-radius:  20px;width: 900px; height: 440px; overflow: hidden; position: absolute; left: 50%; top: 50%; margin-left: -450px; margin-top: -220px; background-image: url('${pageContext.request.contextPath }/images/bg_login.jpg')">
		<div id="loginBlock" class="login"
			style="margin-top: 80px; height: 255px;border-bottom-left-radius: 20px;border-bottom-right-radius:  20px;border-top-left-radius:  20px;border-top-right-radius:  20px;">
			<div class="loginFunc">
				<div id="lbNormal" class="loginFuncMobile">登录</div>
			</div>
			<div class="loginForm" >
				<form id="loginform" name="loginform" method="post" class="niceform">
					<!-- action="/assets/login" -->
					<div id="idInputLine" class="loginFormIpt showPlaceholder"
						style="margin-top: 5px;">
						<input id="idInput" type="text" name="username"
							class="loginFormTdIpt" maxlength="50" />
						<label for="idInput" class="placeholder" id="idPlaceholder">帐号：</label>
					</div>
					<div class="forgetPwdLine"></div>
					<div id="pwdInputLine" class="loginFormIpt showPlaceholder">
						<input id="pwdInput" class="loginFormTdIpt" type="password"
							name="password" value="" />
						<label for="pwdInput" class="placeholder" id="pwdPlaceholder">密码：</label>
					</div>
					<div class="loginFormIpt loginFormIptWiotTh"
						style="margin-top:58px;">
						<div id="codeInputLine" class="loginFormIpt showPlaceholder"
							style="margin-left:0px;margin-top:-40px;width:50px;">
							<input id="codeInput" class="loginFormTdIpt" type="text"
								name="checkcode" title="请输入验证码" />
							<img id="loginform:vCode" src="assets/ex/validatecode"
								onclick="javascript:document.getElementById('loginform:vCode').src='assets/ex/validatecode?'+Math.random();" />
						</div>
						<a id=loginsubmit name="loginform:j_id19">
						<span
							id="loginBtn" class="btn btn-login"
							style="margin-top:-36px;">登录</span>
						</a>
					</div>
					<%-- <div>
						<font color="red">
							<s:actionerror/>
						</font>
					</div> --%>
				</form>
			</div>
		</div>
	</div>
	<div
		style="width: 900px; height: 50px; position: absolute; text-align: left; left: 50%; top: 50%; margin-left: -450px;; margin-top: 220px;">
		<span style="color: #488ED5;">Powered By hzp</span><span
			style="color: #488ED5;margin-left:10px;">推荐浏览器（右键链接-目标另存为）：<a
			href="http://download.firefox.com.cn/releases/full/23.0/zh-CN/Firefox-full-latest.exe">Firefox</a>
		</span><span style="float: right; color: #488ED5;">资产管理中心系统</span>
	</div>
</body>
<script type="text/javascript">
	var redirectUrl = "";
	var LOGIN = {
			checkInput:function() {
				if ($("#idInput").val() == "") {
					alert("用户名不能为空");
					$("#idInput").focus();
					return false;
				}
				if ($("#pwdInput").val() == "") {
					alert("密码不能为空");
					$("#pwdInput").focus();
					return false;
				}
				if ($("#codeInput").val() == "") {
					alert("验证码不能为空");
					$("#codeInput").focus();
					return false;
				}
				return true;
			},
			doLogin:function() {
				$.post("/assets/login", $("#loginform").serialize(),function(data){
					if (data.status == 200) {						
						//if (redirectUrl == "") {
							location.href = "http://localhost:9999/assets/index";
						//} else {
						//	location.href = "http://localhost:9999";
						//}
					} else {
						alert("登录失败，原因是：" + data.msg);
						$("#idInput").select();
					}
				});
			},
			login:function() {
				if (this.checkInput()) {
					this.doLogin();
				}
			}
		
	};
	$(function(){
		$("#loginsubmit").click(function(){			
			LOGIN.login();
		});
	});
</script>
</html>