<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<c:forEach var="s" items="${requestScope.list}">
    姓名${s.stu_name}
    年龄${s.stu_age}
</c:forEach>
</body>
</html>
