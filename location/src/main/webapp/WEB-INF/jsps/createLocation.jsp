<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	
	<form action="saveLoc" method="post">
	<pre>
		Id:   <input type="text" name="id" /> <br>
		Code: <input type="text" name="code" /> <br>
		Name: <input type="text" name="name" /> <br>
		email: <input type="text" name="email" /> <br>
		Type: Urban<input type="radio" name="type" value="URBAN"/>
			  Ruler<input type="radio" name="type" value="RULAR"/>
		<input type="submit" value="save">
		</pre>
	</form>
${msg}

<a href="displayLocations">View All</a>
<a href="showCreate"></a>

</body>
</html>