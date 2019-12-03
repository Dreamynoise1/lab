<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>注册页面</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.css">
    <link href="${pageContext.request.contextPath}/resources/css/login.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css" rel="stylesheet"/>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath}/user_regist" id="loginForm">
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
                <div class="col-xs-10 col-sm-4" >
                	<h3 style="font-family: 楷体; color: #454545; font-size:25px;">注册</h3>
                	<label></label><font style="color: red"><s:fielderror/></font> </label>
                	<div class="form-inline row">
          				<label class="control-label"><s:text name="regist.registTip"/><font style="color: red">*</font> </label>
          				<input type="text" name="name" class="form-control"/>
          				<label class="control-label col-sm-1"></label>
     				</div>
					<div class="form-inline row">
          				<label class="control-label"><s:text name="regist.nameTip"/><font style="color: red">*</font> </label>
          				<input type="text" name="loginName" class="form-control"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
                    <div class="form-inline row">
          				<label class="control-label">密码<font style="color: red">*</font> </label>
          				<input type="password" name="password" class="form-control m-b"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
          			<div class="form-inline row">
          				<label class="control-label">确认密码<font style="color: red">*</font> </label>
          				<input type="password" name="rePassword" class="form-control m-b"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
     				<div class="form-inline row">
          				<label class="control-label">年龄</label>
          				<input type="text" name="age" class="form-control"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
     				<div class="form-inline row" style="margin-top:15px">
          				<label class="control-label">性别</label>
          				<input type="radio" name="gender" value="1" checked="checked"/>先生
          				<input type="radio" name="gender" value="2"/>女士
     					<label class="control-label col-sm-1"></label>
     				</div>
                    <div class="form-inline row">
          				<label class="control-label">电话号码<font style="color: red">*</font> </label>
          				<input type="text" name="phone" class="form-control"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
                    <div class="form-inline row">
          				<label class="control-label">电子邮箱<font style="color: red">*</font> </label>
          				<input type="text" name="email" class="form-control"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
                    <div class="form-inline row">
          				<label class="control-label">生日日期<font style="color: red">*</font> </label>
          				<input type="text" name="birthday" class="form-control"/>
     					<label class="control-label col-sm-1"></label>
     				</div>
                    <div class="form-inline row">
          				<label class="control-label">个人简介<font style="color: red">*</font> </label>
          				<textarea name="profile" class="form-control" rows="3" cols="22"></textarea>
     					<label class="control-label col-sm-1"></label>
     				</div>
                    <button id="login" class="btn btn-primary btn-block" type="submit">注册</button>
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