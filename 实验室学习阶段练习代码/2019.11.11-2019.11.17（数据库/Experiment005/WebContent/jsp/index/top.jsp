<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>首页</title>
</head>
<body>
	<table width="1076" height="163" border="1">
		<tr>
			<td width="160" height="26"><a href="init.action">首页</a></td>
			<td width="362"><a href="user_MyLibrary.action">我的图书馆</a></td>
			<td width="295"><a href="悦读专区.html">悦读专区</a></td>
			<td width="231">
				<a href="${pageContext.request.contextPath}/IndexTest">测试权限</a>
			</td>
		</tr>
		<tr>
			<td height="87" colspan="4">二手交易网</td>
		</tr>
		<tr>
			<td height="40" colspan="4">
				<div align="right">
					<a href="${pageContext.request.contextPath}/user_loginUI">登陆</a> 
					<a href="${pageContext.request.contextPath}/user_registUI">注册</a>
				</div>
			</td>
		</tr>
	</table>
</body>
</html>
