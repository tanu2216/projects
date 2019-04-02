<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="b" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cap Store</h1>
	<h2>Give Response</h2>
	<a href="index.jsp">Home</a>
	<b:form action="update" method="post" modelAttribute="my">
			
				
Customer Id<b:input path="cust_id" value="${temp.cust_id}" readonly="true" />
			<br>
Merchant Id<b:input path="merc_id" value="${temp.merc_id}" readonly="true" />
			<br>

Feedback<b:input path="feedback" value="${temp.feedback}" readonly="true" />
			<br>
Response<b:input path="response" />
			<br>
			<input type="submit" value="Update Query">

		
	</b:form>
</body>
</html>
