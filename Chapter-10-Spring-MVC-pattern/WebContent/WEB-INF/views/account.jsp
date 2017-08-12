 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <form action="open-account" method="post">
  Account Number:<br>
  <input type="text" name="id"><br>
  Name:<br>
  <input type="text" name="name"><br>
  Balance:<br>
  <input type="text" name="balance"><br>
  <br>
  <input type="submit" value="Open Account">
  <hr>
  <c:if test="${not empty account }">
  	<table border="1">
  		<tr>
  			<td>Account Number</td>
  			<td>Name</td>
  			<td>Balance</td>
  		</tr>
  		<tr>
  			<td>${account.id }</td>
  			<td>${account.name }</td>
  			<td>${account.balance }</td>
  		</tr>
  	</table>
  </c:if>
</form> 