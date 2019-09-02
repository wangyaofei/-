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
			<form id="addForm" class="layui-form" action="${pageContext.request.contextPath }/StudentUpdateServlet" method="post">
					<label style="font-size:30px;">&nbsp; &nbsp; &nbsp; 学生修改--> </label>
					<br /> <br /> <br /> <br />
				<div class="layui-form-item">
					<label class="layui-form-label">学号</label>
					<div class="layui-input-inline shortInput">
						<input readonly  unselectable="on"  type="text" name="stuid" required autocomplete="off" class="layui-input" value="${student.stuid }">
					</div>
					<i class="iconfont icon-huaban bt">不可更改</i>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-inline shortInput">
						<input type="text" name="stuname" required autocomplete="off" class="layui-input" value="${student.stuname }">
					</div>
					<i class="iconfont icon-huaban bt"></i>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">密码</label>
					<div class="layui-input-inline shortInput">
						<input type="password" name="stupsw" required autocomplete="off" class="layui-input" value="${student.stupsw }">
					</div>
					<i class="iconfont icon-huaban bt"></i>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">性别</label>
					<div class="layui-input-inline shortInput">
						<input type="text" name="stusex" autocomplete="off" class="layui-input" value="${student.stusex }">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">邮箱</label>
					<div class="layui-input-inline shortInput">
						<input type="text" name="stuemail" autocomplete="off" class="layui-input" value="${student.stuemail }">
					</div>
				</div>
				
				<div class="layui-form-item">
					<label class="layui-form-label">指导教师</label>
	                <div class="layui-input-inline shortInput" >
	                    <select id="tchOption" name="tchid">
	                        <option value="null">暂无</option>
	                    	<c:forEach items="${allTeacher }" var="teachers">
	                    		<option value="${teachers.tchid }">${teachers.tchname }</option>
	                    	</c:forEach>
	                    </select>
	                </div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">所在班级</label>
	                <div class="layui-input-inline shortInput" >
	                    <select id="clsOption" name="clsid">
	                    	<option value="null">暂无</option>
	                    	<c:forEach items="${allClass }" var="classes">
	                    		<option value="${classes.clsid }">${classes.clsname }</option>
	                    	</c:forEach>
	                    </select>
	                </div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">所在组</label>
	                <div class="layui-input-inline shortInput" >
	                    <select id="grpOption" name="grpid">
	                    	<option value="null">暂无</option>
	                    	<c:forEach items="${allGroup }" var="groups">
	                    		<option value="${groups.grpid }">${groups.grpname }</option>
	                    	</c:forEach>
	                    </select>
	                </div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">所选项目</label>
	                <div class="layui-input-inline shortInput" >
	                    <select id="proOption" name="proid">
	                    	<option value="null">暂无</option>
	                    	<c:forEach items="${allProject }" var="projects">
	                    		<option value="${projects.proid }">${projects.proname }</option>
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
				if(${student.tchid} != null)
					$("#tchOption option[value=${student.tchid}]").prop("selected",true);
			});
			</script>
			
			<script>
			$(function() {
				if(${student.clsid} != null)
					$("#clsOption option[value=${student.clsid}]").prop("selected",true);
			});
			</script>
			
			<script>
			$(function() {
				if(${student.grpid} != null)
					$("#grpOption option[value=${student.grpid}]").prop("selected",true);
			});
			</script>
			<script>
			$(function() {
				if(${student.proid} != null)
					$("#proOption option[value=${student.proid}]").prop("selected",true);
			});
			</script>
			
		</div>
	</body>

</html>