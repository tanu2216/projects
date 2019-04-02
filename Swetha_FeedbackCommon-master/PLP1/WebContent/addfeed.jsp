<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Enter Your Feedback</h1>
	<f:form modelAttribute="feed" action="save" method="post">
		<table>
			<tr>
				<td>Customer Id</td>
				<td><f:input path="cust_id" size="30" placeholder="Customer ID" />
			</tr>
			<tr>
				<td>Merchant Id</td>
				<td><f:input path="merc_id" size="30" placeholder="Merchant ID" />
			</tr>
			<tr>
				<td>Feedback</td>
				<td><f:input path="feedback" size="100" placeholder="Feedback" />
			</tr>
			<tr>
				<td colspan=2><input type="submit" value="Add Feedback" /></td>
			</tr>

		</table>

	</f:form>
</body>
</html>