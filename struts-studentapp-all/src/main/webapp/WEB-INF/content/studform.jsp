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
<h2>Student form</h2>
<s:form action="rigister">
	<s:textfield key="student.name"></s:textfield>
	<s:textfield key="student.city"></s:textfield>
	<s:textfield key="student.age"></s:textfield>
	<s:textfield key="student.allowance"></s:textfield>
	<s:textfield key="student.course" list="{'java','spring','Angular'}" label="Course"></s:textfield>
	<s:textfield key="student.gender" list="{'Male','Female'}" label="Gender"></s:textfield>
	<s:textfield key="student.hobby" list="Hobbies" label="Hobbies"></s:textfield>
	<s:textfield key="student.email"></s:textfield>
	<s:submit value="Register"></s:submit>
</s:form>
</body>
</html>