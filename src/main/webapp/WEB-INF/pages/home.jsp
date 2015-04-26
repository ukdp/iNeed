<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width" />
<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Login Form</title>
</head>

<body>
	<div style="color:blue;">UserName :</div>
	<div>${loginModel.userName}</div>

	<div style="color:blue;">Password :</div>
	<div>${loginModel.password}</div>

	<div style="color:red;">${loginModel.errorMessage}</div>
	<div style="color:green;">${loginModel.welcomeMessage}</div>


</body>
</html>
