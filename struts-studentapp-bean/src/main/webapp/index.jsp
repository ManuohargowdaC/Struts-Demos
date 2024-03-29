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
<s:form action="show">
	<s:textfield name="student.studentName" label="Student Name"></s:textfield><br>
	<s:textfield name="student.studentusn" label="Student USN"></s:textfield>	
	<s:textfield name="student.department" label="Department"></s:textfield>	
	<s:textfield name="student.marks" label="Marks"></s:textfield>	
	<s:submit value="submit"></s:submit>
</s:form>
</body>
</html>