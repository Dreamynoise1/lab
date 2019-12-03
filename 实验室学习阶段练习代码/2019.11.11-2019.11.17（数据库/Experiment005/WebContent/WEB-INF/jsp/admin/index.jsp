<%@ page language="java" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>后台管理页面</title>
  </head>
	  	<frameset rows="60,*,60" >
  			<frame src="home_top.action" ></frame>	
  			<frameset cols="240,*">
  				<frame src="home_left.action" />
  				<frame src="home_right.action" name="rightFrame"/>
  			</frameset>
  			<frame src="home_bottom.action"></frame>
 		 </frameset>
</html>
