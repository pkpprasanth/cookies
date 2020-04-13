<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookie</title>
</head>
<body>
<h1>Cookie from browser</h1>
<br>
<%          
            Cookie[] ck=request.getCookies();
            out.print("Username "+ck[0].getValue());
			String password=(String)session.getAttribute("Password");  
 			out.print("Password "+password);
%>

</body>
</html>