<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
my first jsp

<h1>用户登录</h1>
<form action="http://localhost:8080/CPPmanage/LoginServlet" method="get">

  username <input type="text" plaseholder="请输入用户名..." name="username"> <br/>
  password <input type="text" plaseholder="请输入密码..." name="password"> <br/>

<input type="submit" value="登录">



</form>
</body>
</html>