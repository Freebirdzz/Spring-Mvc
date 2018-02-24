<%--
  Created by IntelliJ IDEA.
  User: kevin
  Date: 2018/2/12
  Time: 上午11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h1>Main index page.</h1>

    <a href="<%=request.getContextPath()%>/home/one">click me</a>
    <br>
<a href="<%=request.getContextPath()%>/device/test">访问设备检测</a>
<br>
    <a href="<%=request.getContextPath()%>/home/check">valid校验</a>
<br>
    <a href="<%=request.getContextPath()%>/home/filter">测试一个filter的处理</a>

</body>
</html>
