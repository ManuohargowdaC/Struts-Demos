<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${student}
Name:${student.name}<br>
city:${student.city}<br>
Age:${student.age}<br>
Course:${student.course}<br>
Hobby:${student.hobby}<br>
Gender:${student.gender}<br>
Email:${student.email}<br>
Allowance:${student.allowance}<br>

</body>
</html>