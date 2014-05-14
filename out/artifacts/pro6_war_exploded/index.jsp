<%--
  Created by IntelliJ IDEA.
  User: el1ven
  Date: 14-5-14
  Time: 上午8:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  <h2>首页</h2><hr/><br/>
  <form action="convert.action" method="post">
      请输入要创建的人员信息(格式为10001,张三）：<br/>
      <input type="text" name="person"/>
      <br/>
      <input type="submit" value="提交"/>
  </form>

  </body>
</html>
