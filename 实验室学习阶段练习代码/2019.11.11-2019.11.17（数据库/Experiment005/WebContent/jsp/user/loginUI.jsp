<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>登录页面</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/user_login" id="loginForm">
		<div class="signinpanel">
			<div class="row">
				<div class="col-xs-10 col-sm-8">
                    <div class="signin-info">
                        <div class="logopanel m-b" style="margin-left: -5%;">
                            <h1 style="font-family: 楷体; color: #454545; font-size: 45px;">
                                <img alt="" src="${pageContext.request.contextPath}/resources/images/chxy.png" style="width: 100px; height: 100px;"> &nbsp; 图书共享平台
                            </h1>
                        </div>
                    </div>
                </div>
                <div class="col-xs-10 col-sm-4">
                	<h3 style="font-family: 楷体; color: #454545; font-size:25px;">登录</h3>
                	<s:textfield name="loginName" class="form-control uname" placeholder="账号"></s:textfield>
                    <s:textfield name="password" class="form-control pword m-b" placeholder="密码"></s:textfield>
                    <img src="${pageContext.request.contextPath}/resources/images/code.png" onclick="">
                    <button id="login" class="btn btn-primary btn-block" type="submit">登录</button>
                    <p><a href="${pageContext.request.contextPath}/user_registUI">注册</a></p>
                    <p class="text-muted text-center col-red"><a id="msg" style="color:#FF0C05"><s:fielderror value="errorMsg"/></a></p>
                </div>
			</div>
			<div class="signup-footer">
                <div class="pull-left">
                    <!-- 科技学院@2017 -->
                    © 巢湖学院 @2018
                </div>
            </div>
		</div>
	</form>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
	    //处理登录逻辑之前，验证验证码是否正确
        /* $(function(){
            $("#login").click(function(){
                var code = $("#code").val();
                $.ajax({
                    url:"#",
                    type:"post",
                    data:{"code":code},
                    dataType:"json",
                    success:function(data){
                        if (data.success){
                            $("#loginForm").submit();
                        }else {
                           var msg = data.msg;
                            $('#msg').html(msg);
                            window.location.href;
                        }
                    }
                });
            }); */
            //回车键登录
            $("body").keydown(function(event) {
                if (event.keyCode == "13") {//keyCode=13是回车键
                    $("#login").click();
                }
            });
        });
    </script>
    
</body>
</html>