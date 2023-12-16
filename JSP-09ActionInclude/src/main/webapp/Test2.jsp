<%@ page import="java.time.*" %>
<h1 style="color: green;text-align: center">Here we are in test2</h1>
<%! private LocalDateTime dt; %>
<% dt = LocalDateTime.now(); %>
<h2 style="color: brown;text-align: center"><%= dt %></h2>