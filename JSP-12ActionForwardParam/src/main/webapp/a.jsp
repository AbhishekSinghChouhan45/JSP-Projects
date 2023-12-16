<h1 style="color: red;text-align: center">Here we are a.jsp</h1>
<% String val = "From a.jsp"; %>
<jsp:forward page="b.jsp">
	<jsp:param value="Random" name="r"/>
	<jsp:param value="<%=val %>" name="rr"/>
</jsp:forward>