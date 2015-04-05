<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width" />
<%@page contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Login Form</title>
</head>

<body>
	<div>
		<h1>Login to Web App</h1>
		
		<form:form id="login_form" method="POST" commandName="loginModel" action="/loginReq">
			<p>
				<form:input type="text" path="userName" />
			</p>
			<p>
				<form:input type="password" path="password" />
			</p>
			<%-- <p>
				<label> <form:input type="checkbox" name="remember_me"
						id="remember_me" path="rememberMe" /> Remember me on this
					computer
				</label>
			</p> --%>
			<p>
				<input type="submit" value="Login" />
			</p>
		</form:form>
	</div>

	<div>
		<p>
			Forgot your password? <a href="">Click here to reset it</a>.
		</p>
	</div>
</body>

</html>