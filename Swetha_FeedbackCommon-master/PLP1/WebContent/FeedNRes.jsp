<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Feedback And Responses</h1>
	<table border="2">
		<tr>
			<th>CustmerId
			<th>MerchantId
			<th>Feedback
			<th>Response <c:forEach items="${list}" var="feed">
					<tr>
						<td>${feed.cust_id}
						<td>${feed.merc_id}
						<td>${feed.feedback}
						<td>${feed.response}
				</c:forEach>
	</table>
</body>
</html>