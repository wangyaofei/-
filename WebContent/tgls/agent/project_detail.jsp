<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1">
		<!-- Google Chrome Frame也可以让IE用上Chrome的引擎: -->
		<meta name="renderer" content="webkit">
		<!--国产浏览器高速模式-->
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="author" content="yaofeiwang" />
		<!-- 作者 -->
		<meta name="revised" content="yaofeiwang.v3, 2019/05/01" />
		<!-- 定义页面的最新版本 -->
		<meta name="description" content="后台教师管理" />
		<!-- 网站简介 -->
		<meta name="keywords" content="后台教师管理" />
		<title>项目式教学</title>

		<!-- 公共样式 开始 -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/base.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/iconfont.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/framework/jquery-1.11.3.min.js"></script>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/layui/css/layui.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/layui/layui.js"></script>
		<!-- 滚动条插件 -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/jquery.mCustomScrollbar.css">
		<script src="${pageContext.request.contextPath }/framework/jquery-ui-1.10.4.min.js"></script>
		<script src="${pageContext.request.contextPath }/framework/jquery.mousewheel.min.js"></script>
		<script src="${pageContext.request.contextPath }/framework/jquery.mCustomScrollbar.min.js"></script>
		<script src="${pageContext.request.contextPath }/framework/cframe.js"></script><!-- 仅供所有子页面使用 -->
		<!-- 公共样式 结束 -->

	</head>

	<body>
		<br /><h1 align="center" style="font-size:24px"><b>项目详情</b></h1> <br />
		<h1 style="font-size:15px"><b>&nbsp;&nbsp;项目编号：</b></h1><br />
		<h2>&nbsp;&nbsp;${mProject.proid }</h2> <br />
		<h1 style="font-size:15px"><b>&nbsp;&nbsp;项目名称：</b></h1><br />
		<h2>&nbsp;&nbsp;${mProject.proname }</h2> <br />
		<h1 style="font-size:15px"><b>&nbsp;&nbsp;项目信息：</b></h1><br />
		<h2>&nbsp;&nbsp;${mProject.proinfo }</h2> <br />
		<h1 style="font-size:15px"><b>&nbsp;&nbsp;项目评级：</b></h1><br />
		<h2>&nbsp;&nbsp;${mProject.prodegree }</h2> <br />
	</body>
</html>