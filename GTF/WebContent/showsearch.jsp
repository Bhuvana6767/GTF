<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Gear Technical Forum</h1><br/>
<h1>Answer the Query</h1>

<a href="index.jsp">Home</a>
<c:form modelAttribute="yy"  action="success" method="POST">
	<table border=2>
		<tr>
			<th>Query Id</th>
			<td><c:input path="queryId" value="${temp.queryId}"/></td>
		</tr>
			<tr>
			<th>Technology</th>
			<td><c:input path="technology" value="${temp.technology}"/></td>
			</tr>
			
			<tr>
			<th>Question</th>
			<td><c:input path="question" value="${temp.question}"/></td>
			</tr>
			
			<tr>
			<th>Question Raised by</th>
			<td><c:input path="questionBy" value="${temp.questionBy}"/></td>
			</tr>
			
			<tr>
			<th>Solution</th>
			<td><c:input path="solution" size="30"/></td>
			</tr>
			
			<tr>
			<th>Answer by</th>
			<td><div>
			<c:select path="answerBy">
			<c:option value="">Please Select</c:option>
			<c:options items="${answerBy}" />
			</c:select>
			
			</div></td>
			</tr>
			
			<tr>
					<td colspan="2" align="left">
					<input type="submit" value="Update Query" /></td>
				</tr>
			
		
	</table>
	</c:form>
</body>
</html>