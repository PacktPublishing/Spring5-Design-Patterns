 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <html>
	<head>
		<title>Bank Management System</title>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css" />" >
	</head>
	<body>
		<h1>${message} Account Details</h1>
		  <c:if test="${not empty account }">
		  	<table border="1">
		  		<tr>
		  			<td>Account Number</td>
		  			<td>Account Name</td>
		  			<td>Account Balance</td>
		  		</tr>
		  		<tr>
		  			<td>${account.id }</td>
		  			<td>${account.name }</td>
		  			<td>${account.balance }</td>
		  		</tr>
		  	</table>
		  </c:if>
	</body>
</html>