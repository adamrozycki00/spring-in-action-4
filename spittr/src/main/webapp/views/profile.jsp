<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page session="false" %>

<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="style.css" />">
</head>
<body>

<h1>Your Profile</h1>
<c:out value="${spitter.username}"/><br/>
<c:out value="${spitter.firstName}"/>
<c:out value="${spitter.lastName}"/>

</body>
</html>
