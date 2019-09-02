<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<meta name="description" content="管理员后台" />
		<!-- 网站简介 -->
		<meta name="keywords" content="管理员页面" />
		<title>项目式教学</title>

		<!-- 公共样式 开始 -->
		<link rel="shortcut icon" href="images/favicon.ico"/>
		<link rel="bookmark" href="images/favicon.ico"/>
		<link rel="stylesheet" type="text/css" href="css/base.css">
		<link rel="stylesheet" type="text/css" href="css/iconfont.css">
		<script type="text/javascript" src="framework/jquery-1.11.3.min.js" ></script>
		<link rel="stylesheet" type="text/css" href="layui/css/layui.css">
	    <!--[if lt IE 9]>
	      	<script src="framework/html5shiv.min.js"></script>
	      	<script src="framework/respond.min.js"></script>
	    <![endif]-->
		<script type="text/javascript" src="layui/layui.js"></script>
		<!-- 滚动条插件 -->
		<link rel="stylesheet" type="text/css" href="css/jquery.mCustomScrollbar.css">
		<script src="framework/jquery-ui-1.10.4.min.js"></script>
		<script src="framework/jquery.mousewheel.min.js"></script>
		<script src="framework/jquery.mCustomScrollbar.min.js"></script>
		<script src="framework/cframe.js"></script><!-- 仅供所有子页面使用 -->
		<!-- 公共样式 结束 -->
		
		<link rel="stylesheet" type="text/css" href="css/frameStyle.css">
		<script type="text/javascript" src="framework/frame.js" ></script>
		
	</head>

	<body>
		<!-- 左侧菜单 - 开始 -->
		<div class="frameMenu">
		    <div class="logo">
		        <img src="images/logo.png"/>
		        <div class="logoText">
		            <h1>程序设计基础二</h1>
		            <p>项目式教学</p>
		        </div>
		    </div>
		    <div class="menu">
		        <ul>
		        	<li>
		                <a class="menuFA" href="javascript:void(0)" onclick="menuCAClick('${pageContext.request.contextPath }/ClassListServlet',this)"><i class="iconfont icon-liuliangyunpingtaitubiao03 left"></i>班级管理</a>
		            </li>

		        	<li>
		                <a class="menuFA" href="javascript:void(0)"><i class="iconfont icon-zhishi left"></i>人员管理<i class="iconfont icon-dajiantouyou right"></i></a>
		                <dl>
		                	<dt><a href="javascript:void(0)" onclick="menuCAClick('${pageContext.request.contextPath }/TeacherListServlet',this)">教师管理</a></dt>
		                	<dt><a href="javascript:void(0)" onclick="menuCAClick('${pageContext.request.contextPath }/StudentListServlet',this)">学生管理</a></dt>
		                </dl>
		            </li>
		        </ul>
		    </div>
		</div>
		<!-- 左侧菜单 - 结束 -->
		
		<div class="main">
			<!-- 头部栏 - 开始 -->
			<div class="frameTop">
				<img class="jt" src="images/top_jt.png"/>
				<div class="topMenu">
					<ul>
						<li><a href="javascript:void(0)" onclick="menuCAClick('tgls/modify_password.html',this)"><i class="iconfont icon-yonghu1"></i><span>${admin.admname }</span></a></li>
						<li><a href="javascript:void(0)" onclick="menuCAClick('tgls/modify_password.html',this)"><i class="iconfont icon-xiugaimima"></i>修改密码</a></li>
						<li><a href="login.jsp"><i class="iconfont icon-084tuichu"></i>注销</a></li>
					</ul>
				</div>
			</div>
			<!-- 头部栏 - 结束 -->
			
			<!-- 核心区域 - 开始 -->
			<div class="frameMain">
				<div class="title" id="frameMainTitle">
					<span><i class="iconfont icon-xianshiqi"></i>后台首页</span>
				</div>
				<div class="con">
					<iframe id="mainIframe" src="tgls/agent/backpage.jsp" scrolling="no"></iframe>
				</div>
			</div>
			<!-- 核心区域 - 结束 -->
		</div>
	</body>

</html>