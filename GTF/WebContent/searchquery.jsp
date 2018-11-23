<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="b" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Gear Technical Forum</h1>
	<b:form action="querysearch" method="post" modelAttribute="yy">
		<table>
			<tr>
				<td>Query id:</td>
				<td><b:input path="queryId" /></td>
				<td><input type="submit" value="Search" /></td>
		</table>
	</b:form>
</body>
</html>