<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
<p>${userTimeFile.getYears()} years is equivalent to each of the following: <br />
${userTimeFile.getDays()} days <br />
${userTimeFile.getHours()} hours <br />
${userTimeFile.getMinutes()} minutes <br />
${userTimeFile.getSeconds()} seconds <br />
</p>

</body>
</html>