<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>用户登录</h1>
<form action="${pageContext.request.contextPath }/LoginServlet" method="get">

  username <input type="text" plaseholder="请输入用户名..." name="username"> <br/>
  password <input type="text" plaseholder="请输入密码..." name="password"> <br/>
  <input type="checkbox" name="remember_me" id="remember_me" /> <label for="remember_me">remember me</label>
  <input type="submit" value="登录">

</form>
</body>
</html>