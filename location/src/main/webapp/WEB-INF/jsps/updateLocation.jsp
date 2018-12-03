<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	
	<form action="updateLoc" method="post">
	<pre>
		Id:   <input type="text" name="id" value="${location.id}" readonly="true"/> <br>
		Code: <input type="text" name="code" value="${location.code}"/> <br>
		Name: <input type="text" name="name" value="${location.name }"/> <br>
		email: <input type="text" name="email" value="${location.email }"/> <br>
		Type: Urban<input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/>
			  Ruler<input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/>
		<input type="submit" value="save">
	</pre>
	</form>
</body>
</html>