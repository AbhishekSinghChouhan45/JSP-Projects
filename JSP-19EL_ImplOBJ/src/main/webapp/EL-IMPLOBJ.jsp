<%@page isELIgnored="false" %>
<h1 style="color: red;text-align: center">EL_Implicit Obj</h1>
	<% 
		pageContext.setAttribute("attr1","Val 1 of pageScope",pageContext.PAGE_SCOPE);
		pageContext.setAttribute("attr2","Val 2 of requestScope",pageContext.REQUEST_SCOPE);
		pageContext.setAttribute("attr3","Val 3 of sessionScope",pageContext.SESSION_SCOPE);
		pageContext.setAttribute("attr4","Val 4 of applicationScope",pageContext.APPLICATION_SCOPE);
	%>
	<jsp:forward page="Test.jsp"></jsp:forward>