<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>后台管理页面</title>
  </head>
  
  <body>
  	<h1>后台管理系统</h1>
  	<br/>
  	<center>当前用户：[<s:property value="#session.user.name"/>]  
  	<s:a action="user_logout">注销</s:a></center>
  	<s:debug></s:debug>
  </body>
</html>
