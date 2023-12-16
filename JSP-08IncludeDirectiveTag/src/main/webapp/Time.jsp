<%@ page import="java.time.LocalDateTime,java.io.*"%>
<h1 style="color:green;text-align: center" >Time.jsp</h1>
<%! private static LocalDateTime ldt;  %>
<% ldt = LocalDateTime.now();  %>
<h4 style="color: brown;text-align: center"><%= ldt  %> </h4>
<h4 style="color: brown;text-align: center">Date </h4>
<%@ include file="Date.jsp" %>
<h1 style="color:green;text-align: center" >End of Time.jsp</h1>
