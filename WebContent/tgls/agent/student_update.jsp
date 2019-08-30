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
		<meta name="description" content="yaofeiwang" />
		<!-- 网站简介 -->
		<meta name="keywords" content="yaofeiwang" />
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
		
		<style>
			.layui-form{
				margin-right: 30%;
			}
		</style>

	</head>

	<body>
		<div class="cBody">
			<form id="addForm" class="layui-form" action="${pageContext.request.contextPath }/ClassUpdateServlet" method="post">
					<label style="font-size:30px;">&nbsp; &nbsp; &nbsp; 班级修改--> </label>
					<br /> <br /> <br /> <br />
				<div class="layui-form-item">
					<label class="layui-form-label">班号</label>
					<div class="layui-input-inline shortInput">
						<input type="text" name="clsid" required autocomplete="off" class="layui-input" value="${mClass.clsid }">
					</div>
					<i class="iconfont icon-huaban bt"></i>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">班级名称</label>
					<div class="layui-input-inline shortInput">
						<input type="text" name="clsname" required autocomplete="off" class="layui-input" value="${mClass.clsname }">
					</div>
					<i class="iconfont icon-huaban bt"></i>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">指导教师</label>
	                <div class="layui-input-inline shortInput" >
	                    <select  id="tchOption"  name="tchid">
	                    	<c:forEach items="${allTeacher }" var="teachers">
	                    		<option value="${teachers.tchid }">${teachers.tchname }</option>
	                    	</c:forEach>
	                    </select>
	                </div>
				</div>
				
				<div class="layui-form-item">
					<div class="layui-input-block">
						<button class="layui-btn" lay-submit lay-filter="submitBut" id="add">立即修改</button>
					</div>
				</div>
			</form>
			
			<!-- 三级省市 插件 -->
    		<script src="../../framework/area.js"></script>
			<script src="../../framework/province.js"></script>
			<script>
				//默认城市为：宁夏 - 银川
		        var defaults = {
		            s1: 'provid',
		            s2: 'cityid',
		            s3: 'areaid',
		            v1: 510000,
		            v2: 510100,
		            v3: null
		        };
			</script>
			
 			<!--  
			<script>
			$("#add").click(function() {
				$("#addForm").submit();
			});
			</script>
 			-->
 			
			<script>
			$(function() {
				
				$("#tchOption option[value=${mClass.tchid}]").prop("selected",true);
				
			});
				
			</script>
 			
 			
 			
		</div>
	</body>

</html>