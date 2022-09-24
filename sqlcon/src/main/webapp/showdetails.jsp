<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page import="com.qasim.entity.user_details"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<user_details> list = new ArrayList<>();
list = (List) request.getAttribute("user_details_list");
for(int i =0; i< list.size();i++){
	out.println(list.get(i).toString());
	out.println("</br>");
	
}
%>
</body>
</html>
