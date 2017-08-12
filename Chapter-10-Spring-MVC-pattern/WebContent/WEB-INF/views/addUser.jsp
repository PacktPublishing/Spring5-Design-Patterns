 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <form action="create" method="post">
  First name:<br>
  <input type="text" name="firstname"><br>
  Last name:<br>
  <input type="text" name="lastname"><br>
  Address:<br>
  <input type="text" name="address"><br>
  <br>
  <input type="submit">
  
  <c:if test="${not empty user }">
  	<table border="1">
  		<tr>
  			<td>First name</td>
  			<td>Last name</td>
  			<td>Address</td>
  		</tr>
  		<tr>
  			<td>${user.firstname }</td>
  			<td>${user.lastname }</td>
  			<td>${user.address }</td>
  		</tr>
  	</table>
  </c:if>
</form> 