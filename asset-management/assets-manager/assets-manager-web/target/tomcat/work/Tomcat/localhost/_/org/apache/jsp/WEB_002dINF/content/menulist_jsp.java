/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-07-16 13:40:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menulist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>菜单管理</title>\r\n");
      out.write("<!-- 导入jquery核心类库 -->\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.8.3.js\"></script>\r\n");
      out.write("<!-- 导入easyui类库 -->\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/portal.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/default.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.portal.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/ext/jquery.cookie.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/outOfBounds.js\"\r\n");
      out.write("\ttype=\"text/javascript\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t// 工具栏\r\n");
      out.write("\tvar toolbar = [ {\r\n");
      out.write("\t\tid : 'button-view',\r\n");
      out.write("\t\ttext : '编辑',\r\n");
      out.write("\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\thandler : doEdit\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-add',\r\n");
      out.write("\t\ttext : '新增',\r\n");
      out.write("\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\thandler : doAdd\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tid : 'button-delete',\r\n");
      out.write("\t\ttext : '删除',\r\n");
      out.write("\t\ticonCls : 'icon-cancel',\r\n");
      out.write("\t\thandler : doDelete\r\n");
      out.write("\t} ];\r\n");
      out.write("\t//定义冻结列\r\n");
      out.write("\tvar frozenColumns = [ [ {\r\n");
      out.write("\t\tfield : 'id',\r\n");
      out.write("\t\tcheckbox : true,\t\t\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'resourceId',\r\n");
      out.write("\t\ttitle : '菜单编号',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t} ] ];\r\n");
      out.write("\r\n");
      out.write("\t// 定义标题栏\r\n");
      out.write("\tvar columns = [ [ {\r\n");
      out.write("\t\tfield : 'zhCnName',\r\n");
      out.write("\t\ttitle : '菜单名称',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'resourceType',\r\n");
      out.write("\t\ttitle : '菜单类别',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'value',\r\n");
      out.write("\t\ttitle : '跳转URL',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'parentId',\r\n");
      out.write("\t\ttitle : '父级菜单编号',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'status',\r\n");
      out.write("\t\ttitle : '状态',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t}, {\r\n");
      out.write("\t\tfield : 'remark',\r\n");
      out.write("\t\ttitle : '备注',\r\n");
      out.write("\t\twidth : 160,\r\n");
      out.write("\t\talign : 'center'\r\n");
      out.write("\t} ] ];\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t// 初始化 datagrid\r\n");
      out.write("\t\t// 创建grid\r\n");
      out.write("\t\t$('#grid').datagrid({\r\n");
      out.write("\t\t\ticonCls : 'icon-forward',\r\n");
      out.write("\t\t\tfit : true,\r\n");
      out.write("\t\t\tborder : false,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\ttoolbar : toolbar,\r\n");
      out.write("\t\t\turl : \"/assets/menu/list\",\r\n");
      out.write("\t\t\tmethod : 'get',\r\n");
      out.write("\t\t\tpageList : [ 3, 5, 10 ],\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tfrozenColumns : frozenColumns,\r\n");
      out.write("\t\t\tcolumns : columns,\r\n");
      out.write("\t\t\tonClickRow : onClickRow,\r\n");
      out.write("\t\t\tonDblClickRow : doDblClickRow\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$(\"body\").css({\r\n");
      out.write("\t\t\tvisibility : \"visible\"\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// 添加取派员窗口\r\n");
      out.write("\t\t$('#addMenuWindow').window({\r\n");
      out.write("\t\t\ttitle : '添加菜单',\r\n");
      out.write("\t\t\twidth : 480,\r\n");
      out.write("\t\t\tmodal : true,//遮罩效果\r\n");
      out.write("\t\t\tshadow : true,//阴影效果\r\n");
      out.write("\t\t\tclosed : true,//关闭状态\r\n");
      out.write("\t\t\theight : 450,\r\n");
      out.write("\t\t\ttop : ($(window).height() - 450) * 0.5,\r\n");
      out.write("\t\t\tleft : ($(window).width() - 480) * 0.5,\r\n");
      out.write("\t\t\tresizable : false\r\n");
      out.write("\t\t//是否可以调整大小\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t// 修改取派员窗口\r\n");
      out.write("\t\t$('#editMenuWindow').window({\r\n");
      out.write("\t\t\ttitle : '修改菜单',\r\n");
      out.write("\t\t\twidth : 480,\r\n");
      out.write("\t\t\tmodal : true,//遮罩效果\r\n");
      out.write("\t\t\tshadow : true,//阴影效果\r\n");
      out.write("\t\t\tclosed : true,//关闭状态\r\n");
      out.write("\t\t\theight : 450,\r\n");
      out.write("\t\t\ttop : ($(window).height() - 450) * 0.5,\r\n");
      out.write("\t\t\tleft : ($(window).width() - 480) * 0.5,\r\n");
      out.write("\t\t\tresizable : false\r\n");
      out.write("\t\t//是否可以调整大小\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t//双击\r\n");
      out.write("\tfunction doDblClickRow(rowIndex, rowData) {\r\n");
      out.write("\t\tvar items = $('#grid').datagrid('selectRow', rowIndex);\r\n");
      out.write("\t\tdoEdit();\r\n");
      out.write("\t}\r\n");
      out.write("\t// 单击\r\n");
      out.write("\tfunction onClickRow(rowIndex) {\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction doAdd() {\r\n");
      out.write("\t\t//location.href = \"addMenuWindow\";\r\n");
      out.write("\t\t$('#addMenuWindow').window(\"open\");\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction doEdit() {\r\n");
      out.write("\t\t$('#editMenuWindow').window(\"open\");\r\n");
      out.write("\t\tvar item = $('#grid').datagrid('getSelected');\r\n");
      out.write("\t\tconsole.info(item);\r\n");
      out.write("\t\t//window.location.href = \"edit.html\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction doDelete() {\r\n");
      out.write("\t\talert(\"删除用户\");\r\n");
      out.write("\t\tvar ids = [];\r\n");
      out.write("\t\tvar items = $('#grid').datagrid('getSelections');\r\n");
      out.write("\t\tfor (var i = 0; i < items.length; i++) {\r\n");
      out.write("\t\t\tids.push(items[i].id);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tconsole.info(ids.join(\",\"));\r\n");
      out.write("\r\n");
      out.write("\t\t$('#grid').datagrid('reload');\r\n");
      out.write("\t\t$('#grid').datagrid('uncheckAll');\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" style=\"visibility: hidden;\">\r\n");
      out.write("\t<div region=\"center\" border=\"false\">\r\n");
      out.write("\t\t<table id=\"grid\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"添加菜单\" id=\"addMenuWindow\"\r\n");
      out.write("\t\tcollapsible=\"false\" minimizable=\"false\" maximizable=\"false\"\r\n");
      out.write("\t\tstyle=\"top: 40px; left: 200px\">\r\n");
      out.write("\t\t<div region=\"north\" split=\"false\" border=\"false\">\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"save\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\tplain=\"true\">保存</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow: auto; padding: 5px;\"\r\n");
      out.write("\t\t\tborder=\"false\">\r\n");
      out.write("\t\t\t<form id=\"addMenuForm\" action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"90%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">菜单信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<!-- TODO 这里完善收派员添加 table -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单编号：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单名称：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单类别：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">跳转URL：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">父级菜单编号：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单状态：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"16%\">备注：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"84%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-textbox\" style=\"width: 100%; height: 22px\" /></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 修改窗口 -->\r\n");
      out.write("\t<div class=\"easyui-window\" title=\"修改菜单\" id=\"editMenuWindow\"\r\n");
      out.write("\t\tcollapsible=\"false\" minimizable=\"false\" maximizable=\"false\"\r\n");
      out.write("\t\tstyle=\"top: 20px; left: 200px\">\r\n");
      out.write("\t\t<div region=\"north\" style=\"height: 40px; overflow: hidden;\"\r\n");
      out.write("\t\t\tsplit=\"false\" border=\"false\">\r\n");
      out.write("\t\t\t<div class=\"datagrid-toolbar\">\r\n");
      out.write("\t\t\t\t<a id=\"edit\" icon=\"icon-save\" href=\"#\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\tplain=\"true\">保存</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div region=\"center\" style=\"overflow: auto; padding: 5px;\"\r\n");
      out.write("\t\t\tborder=\"false\">\r\n");
      out.write("\t\t\t<form id=\"editMenuForm\" action=\"\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"id\">\r\n");
      out.write("\t\t\t\t<table class=\"table-edit\" width=\"90%\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t<tr class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t<td colspan=\"2\">菜单信息</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<!-- TODO 这里完善收派员添加 table -->\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单编号：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-text\" required=\"true\" readonly=\"readonly\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单名称：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单类别：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">跳转URL：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">父级菜单编号：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"30%\">菜单状态：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"60%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-validatebox\" required=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\tstyle=\"width: 80%; height: 22px\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"16%\">备注：</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"84%\"><input type=\"text\" name=\"name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"easyui-textbox\" style=\"width: 100%; height: 22px\" /></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t//绑定事件\r\n");
      out.write("\t\t\t\t\t\t$(\"#save\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t//校验表单输入项\r\n");
      out.write("\t\t\t\t\t\t\tvar v = $(\"#addMenuForm\").form(\"validate\");\r\n");
      out.write("\t\t\t\t\t\t\tif(v){\r\n");
      out.write("\t\t\t\t\t\t\t\t//校验通过，提交表单\r\n");
      out.write("\t\t\t\t\t\t\t\t//$(\"#addStaffForm\").submit();\r\n");
      out.write("\t\t\t\t\t\t\t\talert(\"baocun\");\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script> \r\n");
      out.write("<!-- <script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t\t$(function(){\r\n");
      out.write("\t\t\t\t\t\t//绑定事件\r\n");
      out.write("\t\t\t\t\t\t$(\"#edit\").click(function(){\r\n");
      out.write("\t\t\t\t\t\t\t//校验表单输入项\r\n");
      out.write("\t\t\t\t\t\t\tvar v = $(\"#editStaffForm\").form(\"validate\");\r\n");
      out.write("\t\t\t\t\t\t\tif(v){\r\n");
      out.write("\t\t\t\t\t\t\t\t//校验通过，提交表单\r\n");
      out.write("\t\t\t\t\t\t\t\t$(\"#editStaffForm\").submit();\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t</script> -->\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
