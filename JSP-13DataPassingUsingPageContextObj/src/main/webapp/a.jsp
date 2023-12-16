<h1>Here we are in a.jsp</h1>
<%
		pageContext.setAttribute("attr1","value1");
		pageContext.setAttribute("attr2","value2",pageContext.REQUEST_SCOPE);
		pageContext.setAttribute("attr3","value3",pageContext.SESSION_SCOPE);
		pageContext.setAttribute("attr4","value4",pageContext.APPLICATION_SCOPE);

%>
		<jsp:forward page="b.jsp"></jsp:forward>>