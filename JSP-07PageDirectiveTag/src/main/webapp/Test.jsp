<!-- 	In page tag there is multiple attributes like.. -->
<!-- 		1. language="java" -->
<!-- 		2. autoFlush="true" -->
<!-- 		3. buffer="8kb" -->
<!-- 		4. contentType="text/html; charset=ISO-8859-1" -->
<!-- 		5. errorPage="page name" -->
<!-- 		6. extends="here super class name" -->
<!-- 		7. import=" " -->
<!-- 		8. isErrorPage="false" -->
<!-- 		9. pageEncoding="ISO-8859-1" -->
<!-- 	    10. session="true" and etc... -->
<%@ page  import="java.time.LocalDateTime" errorPage="ErrorPage.jsp"%>	
	<h1 style="color: red; text-align: center">Start of jsp Page</h1>
 <%! private static LocalDateTime ldt; %>
 <% ldt = null; %>
 	<h1 style="text-align: center"><%= ldt.getHour()%> </h1>	
	<h1 style="color: red; text-align: center">End of jsp Page</h1>
 
<!--  For More Details Check the notes of oct 3rd  -->