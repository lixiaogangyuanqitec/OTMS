<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>OTMS订单及任务管理系统</title>
	<link href="<%=basePath%>css/main/main.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>jquery-easyui-1.4.2/themes/default/easyui.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>jquery-easyui-1.4.2/themes/icon.css" />
    <link rel="stylesheet" type="text/css" href="<%=basePath%>jquery-easyui-1.4.2/themes/color.css" />
    <script type="text/javascript" src="<%=basePath%>jquery-easyui-1.4.2/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>jquery-easyui-1.4.2/jquery.easyui.js"></script>
	<script type="text/javascript" src='<%=basePath%>js/main/main.js'> </script>
</head>
<body class="easyui-layout" style="overflow-y: hidden"  scroll="no">
<input type = "hidden" id="project_name" value="<%=basePath%>">
<noscript>
<div style=" position:absolute; z-index:100000; height:2046px;top:0px;left:0px; width:100%; background:white; text-align:center;">
    <img src="<%=basePath%>images/main/noscript.gif" alt='抱歉，请开启脚本支持！' />
</div></noscript>
    <div region="north" split="true" border="false" style="overflow: hidden; height: 30px;
        background: url(<%=basePath%>images/main/layout-browser-hd-bg.gif) #7f99be repeat-x center 50%;
        line-height: 20px;color: #fff; font-family: Verdana, 微软雅黑,黑体">
        <span style="float:right; padding-right:20px;" class="head">PPP<a href="#" id="editpass">修改密码</a> <a href="#" id="loginOut" onclick="loginout_link()">安全退出</a></span>
        <span style="padding-left:10px; font-size: 16px; "><img src="<%=basePath%>images/main/blocks.gif" width="20" height="20" align="absmiddle" /> OTMS  订单及任务管理系统</span>
    </div>
    <div region="south" split="true" style="height: 30px; background: #D2E0F2; ">
        <div class="footer">Copyright © 2015 www.yuanqitec.com All Rights Reserved. 青岛元启智能机器人科技有限公司 版权所有 </div>
    </div>
    <div region="west" split="true" title="导航菜单" style="width:180px;" id="west">
	<div class="easyui-accordion" fit="true" border="false">
		<!--  导航内容 -->
	</div>

    </div>
    <div id="mainPanle" region="center" style="background: #eee; overflow-y:hidden">
        <div id="tabs" class="easyui-tabs"  fit="true" border="false" >
			<div title="欢迎使用" style="overflow:hidden;" id="home">
				<img alt="" src="<%=basePath%>images/main/welcome.jpg">
			</div>
		</div>
    </div>
    
    
    


</body>
</html>