<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/17
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <a href="/account/findAll.do" >测试</a>

<form action="/account/save" method="post">
    姓名：<input type="text" name="username"/>
    余额：<input type="text" name="money"/>
    <input type="submit" value="存钱">
</form>
</body>
</html>
