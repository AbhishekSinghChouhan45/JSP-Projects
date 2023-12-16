/**Here Expression tag used for method call,arthmetic operations ,logical operations and intialization in expression tag we do not
	write out.println() method explicitly servlet compiler automaticly writes out.println() and our expression tag satement will go to this println 
	method automatically 
	*/
<h1 style="color: red; text-align: center">This is JSP Page of  Expression Tag Content</h1>
<% int a = 10;
	  int b = 20;
%>
<%=
		"Value of a:"+ a				
%> <br>
<%= "Value of b:"+ b %><br>
<%= "Addition of a + b:"+ (a+b) %><br>