<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<h1>All Accounts in Bank</h1><hr>
<c:if test="${not empty accounts }">
  	<table border="1">
  		<tr>
  			<td>Account Number</td>
  			<td>Name</td>
  			<td>Balance</td>
  		</tr>
  		<c:forEach var="account" items="${accounts}">
  			<tr>
	  			<td>${account.id }</td>
	  			<td>${account.name }</td>
	  			<td>${account.balance }</td>
	  		</tr>
  		</c:forEach>
  	</table>
  </c:if>