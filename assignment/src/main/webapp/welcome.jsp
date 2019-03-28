<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        
    <title>Create an account</title>
    <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
  <div class="container">
    <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} <div class="float-right"> <a onclick="document.forms['logoutForm'].submit()"><u>Logout</u></a> </div></h2>
        <br>
        <br>
        <h3>Total number of users are : ${users.size()}</h3>
        <br>
        <h3>List Of Users:</h3>
        <br>
        <table style="width:100%">
        	<tr>
    			<th><c:out value="Id" /></td>
      			<th><c:out value="Name" /></td>
    		</tr>
  			<c:forEach items="${users}" var="user">
    		<tr>
    			<td><c:out value="${user.id}" /></td>
      			<td><c:out value="${user.userName}" /></td>
    		</tr>
  			</c:forEach>
		</table>
        
        
    </c:if>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
  <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
</body>
</html>