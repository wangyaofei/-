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
		<div class="cBody">
			<div class="console">
				<form class="layui-form" action="">
					<div class="layui-form-item">
						<div class="layui-input-inline">
							<input type="text" name="name" required lay-verify="required" placeholder="输入项目编号" autocomplete="off" class="layui-input">
						</div>
						<button class="layui-btn" lay-submit lay-filter="formDemo">检索</button>
						<a href="${pageContext.request.contextPath }/tgls/agent/project_add.jsp" class="layui-btn">新增</a>
					</div>
				</form>

				<script>
					layui.use('form', function() {
						var form = layui.form;
				
						//监听提交
						form.on('submit(formDemo)', function(data) {
							layer.msg(JSON.stringify(data.field));
							return false;
						});
					});
				</script>
			</div>
			
			<table class="layui-table">
				<thead>
					<tr>
						<th>序号</th>
						<th>项目编号</th>
						<th>项目名称</th>
						<th>项目评级</th>
						<th>操作</th>
					</tr>
				</thead>
				
				<tbody>
				
					<c:forEach items="${allProject }" var="projects" varStatus="status">
						<tr>
						<td>${status.index + 1 }</td>
						<td>${projects.proid }</td>
						<td>${projects.proname }</td>
						<td>${projects.prodegree }</td>
						<td>
							<a href="${pageContext.request.contextPath }/ProjectDelServlet?id=${projects.proid}"><button class="layui-btn layui-btn-xs">删除</button></a>
							<a href="${pageContext.request.contextPath }/ProjectUpdateUIServlet?id=${projects.proid}"><button  class="layui-btn layui-btn-xs">修改</button></a>
							<a href="${pageContext.request.contextPath }/ProjectDetailServlet?id=${projects.proid}"><button  class="layui-btn layui-btn-xs">详情</button></a>
						</td>
						</tr>
					</c:forEach>

				</tbody>
			</table>
			
			<!-- layUI 分页模块 -->
			<div id="pages"></div>
			<script>
				layui.use(['laypage', 'layer'], function() {
					var laypage = layui.laypage,
						layer = layui.layer;
				
					//总页数大于页码总数
					laypage.render({
					    elem: 'pages'
					    ,count: 21					    ,layout: ['count', 'prev', 'page', 'next', 'limit', 'skip']
					    ,jump: function(obj){
					      console.log(obj)
					    }
					});
				});
				
			</script>
		</div>
	</body>
</html>