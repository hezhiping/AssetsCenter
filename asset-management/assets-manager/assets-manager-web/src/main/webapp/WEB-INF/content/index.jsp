<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>资产管理中心主界面</title>
<!-- 导入jquery核心类库 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<!-- 导入easyui类库 -->
<link id="easyuiTheme" rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/default.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js"></script>
<!-- 导入ztree类库 -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/js/ztree/zTreeStyle.css"
	type="text/css" />
<script
	src="${pageContext.request.contextPath }/js/ztree/jquery.ztree.all-3.5.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath }/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">
	// 初始化ztree菜单
	$(function() {
		var setting = {
			data : {
				simpleData : { // 简单数据 
					enable : true
				}
			},
			callback : {
				onClick : onClick
			}
		};
		
		// 基本功能菜单加载		
		$.ajax({
			url : '/assets/menu/3',
			type : 'POST',
			dataType : 'text',
			success : function(data) {
				var zNodes = eval("(" + data + ")");
				$.fn.zTree.init($("#assetsMenu"), setting, zNodes);
			},
			error : function(msg) {
				alert('菜单加载异常!');
			}
		});
		
		// 基本功能菜单加载		
		$.ajax({
			url : '/assets/menu/2',
			type : 'POST',
			dataType : 'text',
			success : function(data) {
				var zNodes = eval("(" + data + ")");
				$.fn.zTree.init($("#baseMenu"), setting, zNodes);
			},
			error : function(msg) {
				alert('菜单加载异常!');
			}
		});
		
		// 系统管理菜单加载
		$.ajax({
			url : '/assets/menu/1',
			type : 'POST',
			dataType : 'json',
			success : function(data) {
				if(data!=null){
					$.fn.zTree.init($("#adminMenu"), setting, data);					
				}else{
					alert('菜单加载异常!');					
				}
			},
			error : function(msg) {
				alert('菜单加载异常!');
			}
		});
		
		// 页面加载后 右下角 弹出窗口
		/**************/
		window.setTimeout(function(){
			$.messager.show({
				title:"消息提示",
				msg:'欢迎登录，超级管理员！ <a href="javascript:void" onclick="top.showAbout();">联系管理员</a>',
				timeout:5000
			});
		},3000);
		/*************/
		
		$("#btnCancel").click(function(){
			$('#editPwdWindow').window('close');
		});
	});

	function onClick(event, treeId, treeNode, clickFlag) {
		// 判断树菜单节点是否含有 page属性
		if (treeNode.page!=undefined && treeNode.page!= "") {
			if ($("#tabs").tabs('exists', treeNode.name)) {// 判断tab是否存在
				$('#tabs').tabs('select', treeNode.name); // 切换tab
			} else {
				// 开启一个新的tab页面
				var content = '<div style="width:100%;height:100%;overflow:hidden;">'
						+ '<iframe src="'
						+ treeNode.page
						+ '" scrolling="auto" style="width:100%;height:100%;border:0;" ></iframe></div>';

				$('#tabs').tabs('add', {
					title : treeNode.name,
					content : content,
					closable : true
				});
			}
		}
	}

	/*******顶部特效 *******/
	/**
	 * 更换EasyUI主题的方法
	 * @param themeName
	 * 主题名称
	 */
	changeTheme = function(themeName) {
		var $easyuiTheme = $('#easyuiTheme');
		var url = $easyuiTheme.attr('href');
		var href = url.substring(0, url.indexOf('themes')) + 'themes/'
				+ themeName + '/easyui.css';
		$easyuiTheme.attr('href', href);
		var $iframe = $('iframe');
		if ($iframe.length > 0) {
			for ( var i = 0; i < $iframe.length; i++) {
				var ifr = $iframe[i];
				$(ifr).contents().find('#easyuiTheme').attr('href', href);
			}
		}
	};
	// 退出登录
	function logoutFun() {
		$.messager
		.confirm('系统提示','您确定要退出本次登录吗?',function(isConfirm) {
			if (isConfirm) {
				location.href = '${pageContext.request.contextPath }/userAction_logout.action';
			}
		});
	}
	// 修改密码
	function editPassword() {
		$('#editPwdWindow').window('open');
	}
	// 版权信息
	function showAbout(){
		$.messager.alert("资产管理信息 v1.0","管理员邮箱: 786209939@qq.com");
	}
</script>
</head>
<body class="easyui-layout"  >
	<div data-options="region:'north',border:false"
		style="height:80px;padding:10px;background:url('../images/header_bg.png') no-repeat right;">
		<div style="margin-left:50px">
			<img src="${pageContext.request.contextPath }/images/logo.png"
				border="0">
		</div>
		<div id="sessionInfoDiv"
			style="position: absolute;right: 5px;top:10px;">
			[<strong>超级管理员</strong>]，欢迎你！
		</div>
		<div style="position: absolute; right: 5px; bottom: 10px; ">
			<a href="javascript:void(0);" class="easyui-menubutton"
				data-options="menu:'#layout_north_pfMenu',iconCls:'icon-ok'">更换皮肤</a>
			<a href="javascript:void(0);" class="easyui-menubutton"
				data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-help'">控制面板</a>
		</div>
		<div id="layout_north_pfMenu" style="width: 120px; display: none;">
			<div onclick="changeTheme('default');">default</div>
			<div onclick="changeTheme('gray');">gray</div>
			<div onclick="changeTheme('black');">black</div>
			<div onclick="changeTheme('bootstrap');">bootstrap</div>
			<div onclick="changeTheme('metro');">metro</div>
		</div>
		<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
			<div onclick="editPassword();">修改密码</div>
			<div onclick="showAbout();">联系管理员</div>
			<div class="menu-sep"></div>
			<div onclick="logoutFun();">退出系统</div>
		</div>
	</div>
	<div data-options="region:'west',split:true,title:'菜单导航'"
		style="width:200px" >
		<div class="easyui-accordion" fit="true" border="false">
			<div title="资产管理" data-options="iconCls:'icon-mini-add'" style="overflow:auto">
				<ul id="assetsMenu" class="ztree"></ul>
			</div>
			<div title="基本功能" data-options="iconCls:'icon-mini-add'" style="overflow:auto">
				<ul id="baseMenu" class="ztree"></ul>
			</div>
			<div title="系统管理" data-options="iconCls:'icon-mini-add'" style="overflow:auto">  
				<ul id="adminMenu" class="ztree"></ul>
			</div>
		</div>
	</div>
	<div data-options="region:'center'">
		<div id="tabs" fit="true" class="easyui-tabs" border="false">
			<div title="消息中心" id="subWarp"
				style="width:100%;height:100%;overflow:hidden">
				<iframe src=""
					style="width:100%;height:100%;border:0;"></iframe>	
									
				<%--TODO这里显示公告栏、预警信息和代办事宜--%>
			</div>
		</div>
	</div>
	<div data-options="region:'south',border:false"
		style="height:50px;padding:10px;background:url('../images/foot_bg.png') no-repeat right;">
		<table style="width: 100%;">
			<tbody>
				<tr>
					<td style="width: 300px;">
						<div style="color: #999; font-size: 8pt;">
							五岁资产管理系统 | Powered by <a href="#">hzsys.com</a>
						</div>
					</td>
					<td style="width: *;" class="co1"><span id="online"
						style="background: url(${pageContext.request.contextPath }/images/online.png) no-repeat left;padding-left:18px;margin-left:3px;font-size:8pt;color:#005590;">在线人数:1</span>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
	
	<!--修改密码窗口-->
    <div id="editPwdWindow" class="easyui-window" title="修改密码" collapsible="false" minimizable="false" modal="true" closed="true" resizable="false"
        maximizable="false" icon="icon-save"  style="width: 300px; height: 160px; padding: 5px;
        background: #fafafa">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
                <form id="editPasswordForm">
	                <table cellpadding=3>
	                    <tr>
	                        <td>新密码：</td>
	                        <td><input id="txtNewPass" type="Password" class="txt01 easyui-validatebox" 
	                        	required="true" data-options="validType:'length[4,8]'"
	                        /></td>
	                    </tr>
	                    <tr>
	                        <td>确认密码：</td>
	                        <td><input id="txtRePass" type="Password" class="txt01 easyui-validatebox" 
	                        	required="true" data-options="validType:'length[4,8]'"
	                        /></td>
	                    </tr>
	                </table>
                </form>
            </div>
            <div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)" >确定</a> 
                <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)">取消</a>
            </div>
        </div>
    </div>
    <script type="text/javascript">
	  //为“确定”按钮绑定事件
		$("#btnEp").click(function(){
			//进行表单校验
			var v = $("#editPasswordForm").form("validate");//对应表单中的所有输入框进行校验
			if(v){//表单校验通过
				//判断两次输入是否一致
				var v1 = $("#txtNewPass").val();
				var v2 = $("#txtRePass").val();
				if(v1 == v2){
					//输入一致，发送ajax请求，修改当前用户的密码
					var url = "${pageContext.request.contextPath}/userAction_editPassword.action";
					$.post(url,{"password":v1},function(data){
						if(data == '1'){
							//修改密码成功
							$.messager.alert("提示信息","密码修改成功！","info");
						}else{
							//修改失败
							$.messager.alert("提示信息","密码修改失败！","warning");
						}
						//关闭修改密码的窗口 
						$("#editPwdWindow").window("close");
					});
				}else{
					//输入不一致，提示用户输入不一致
					$.messager.alert("提示信息","两次输入密码不一致！","warning");
				}
			}
		});
    </script>
</body>
</html>