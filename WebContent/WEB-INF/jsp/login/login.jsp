<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String errorInfo=null;
	if(request.getAttribute("res")==null){
		errorInfo="";
	}else{
		errorInfo=(String)request.getAttribute("res");
	}
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OTMS_订单及任务管理</title>
<SCRIPT src="<%=basePath%>js/login/jquery-1.9.1.min.js" type="text/javascript"></SCRIPT>
<SCRIPT src="<%=basePath%>js/login/login.js" type="text/javascript"></SCRIPT>
<SCRIPT src="<%=basePath%>js/login/MD5.js" type="text/javascript"></SCRIPT>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/login/login.css" />    

</head>
<input type = "hidden" id="project_name" value="<%=basePath%>">
<input type = "hidden" id="error_info" value="<%=errorInfo%>">
<BODY>
	<DIV class="top_div" style="border:0.1px solid white;">
		<DIV style="height:40px;width:500px;margin-top:60px;margin-left:50px;">
			<h1>OTMS   订单及任务管理系统</h1>
		</DIV>
	</DIV>
<DIV style="background: rgb(255, 255, 255); margin: -100px auto auto; border: 1px solid rgb(231, 231, 231); border-image: none; width: 400px; height: 200px; text-align: center;">
<DIV style="width: 165px; height: 96px; position: absolute;">
<DIV class="tou"></DIV>
<DIV class="initial_left_hand" id="left_hand"></DIV>
<DIV class="initial_right_hand" id="right_hand"></DIV></DIV>
<P style="padding: 30px 0px 10px; position: relative;"><SPAN 
class="u_logo"></SPAN>         <INPUT id="username" class="ipt" type="text"  value="" > 
    </P>
<P style="position: relative;"><SPAN class="p_logo"></SPAN>         
<INPUT class="ipt" id="password" type="password"  value="">   
  </P>
<DIV style="height: 50px; line-height: 50px; margin-top: 30px; border-top-color: rgb(231, 231, 231); border-top-width: 1px; border-top-style: solid;">
<P style="margin: 0px 35px 20px 45px;"><SPAN style="float: left;color:red;" id="span_error_info"><!--<A style="color: rgb(204, 204, 204);" 
href="#">忘记密码?</A> --></SPAN> 
           <SPAN style="float: right;"><!--<A style="color: rgb(204, 204, 204); margin-right: 10px;" 
href="#">注册</A>  --> 
              <A id="login_link" style="background: rgb(0, 142, 173); padding: 7px 10px; border-radius: 4px; border: 1px solid rgb(26, 117, 152); border-image: none; color: rgb(255, 255, 255); font-weight: bold;" 
href="#" onclick="login_link_button()">登录</A> 
           </SPAN>         </P></DIV></DIV>
		   <div style="text-align:center;">
<p><!--来源:<a href="http://www.mycodes.net/" target="_blank">源码之家  </a>--></p>
</div>
</BODY>
</html>