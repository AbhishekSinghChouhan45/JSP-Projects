<h1 style="color: red;text-align: center">Here we are in c.jsp</h1>
	<%!
		String p = null;
		String r = null;
		String s = null;
		String a = null;
	%>
		<h3 style="color: green;text-align: center">Here we are finding using only getAttribute()</h3>
	<%
		 p = (String)pageContext.getAttribute("attr1");
		 r = (String)pageContext.getAttribute("attr2");
		 s = (String)pageContext.getAttribute("attr3");
	     a = (String)pageContext.getAttribute("attr4");
	%> 
<h2 style="color: red;text-align: center">	<%= "Page scope attr value: "+p %> <br>
	<%= "Request scope attr value: "+r %> <br>
	<%= "Session scope attr value: "+s %><br>
	<%= "Application scope attr value: "+a %><br>
	</h2>
		<h3 style="color: green;text-align: center">Here we are finding using only getAttribute()+scopes</h3>
	<%
		 p = (String)pageContext.getAttribute("attr1",pageContext.PAGE_SCOPE);
		 r = (String)pageContext.getAttribute("attr2",pageContext.REQUEST_SCOPE);
		 s = (String)pageContext.getAttribute("attr3",pageContext.SESSION_SCOPE);
	     a = (String)pageContext.getAttribute("attr4",pageContext.APPLICATION_SCOPE);
	%>
	<h2 style="color: red;text-align: center"><%= "Page scope attr value: "+p %> <br>
	<%= "Request scope attr value: "+r %><br>
	<%= "Session scope attr value: "+s %><br>
	<%= "Application scope attr value: "+a %><br>
	</h2>
		<h3 style="color: green;text-align: center">Here we are finding using only FindAttribute()</h3>
	<%
		 p = (String)pageContext.findAttribute("attr1");
		 r = (String)pageContext.findAttribute("attr2");
		 s = (String)pageContext.findAttribute("attr3");
	     a = (String)pageContext.findAttribute("attr4");
	%>
	<h2 style="color: red;text-align: center"><%= "Page scope attr value: "+p %><br>
	<%= "Request scope attr value: "+r %><br>
	<%= "Session scope attr value: "+s %><br>
	<%= "Application scope attr value: "+a %><br>
	</h2>
	