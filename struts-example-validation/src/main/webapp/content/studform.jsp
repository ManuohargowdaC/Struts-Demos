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
<s:form action="studrigister">
	<s:textfield key="student.name"></s:textfield>
	<s:textfield key="student.city"></s:textfield>
	<s:textfield key="student.age"></s:textfield>
	<s:textfield key="student.allowance"></s:textfield>
	<s:textfield key="student.course"></s:textfield>
	<s:textfield key="student.gender"></s:textfield>
	<s:textfield key="student.hobby"></s:textfield>
	<s:textfield key="student.email"></s:textfield>

	<%-- <s:textfield name="student.name" label="Name"></s:textfield>
	<s:textfield name="student.city" label="City"></s:textfield>
	<s:textfield name="student.age" label="Age"></s:textfield>
	<s:textfield name="student.allowance" label="Allowance"></s:textfield>
	<s:select name="student.course" list="{'java','spring','Angular'}" label="Course"></s:select>
	<s:radio name="student.radio" list="{'Male','Female'}" label="Gender"></s:radio>
	<s:checkboxlist name="student.hobby" list="Hobbies" label="Hobbies"></s:checkboxlist>
	<s:textfield name="student.email" label="Email"></s:textfield> --%>
	<s:submit value="Register"></s:submit>
</s:form>
</body>
</html>