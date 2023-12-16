<h1 style="color: red;text-align: center">Here we are using Action include tag </h1>
<h2 style="color: brown;text-align: center"><%= "Todays date is: " %></h2>
<jsp:include page="Test2.jsp"></jsp:include>
<!-- 	In action include the code will completelty don't come to the service method of source comp. In parsing phase of jes class. The another jes class will created for dest comp  -->
<!-- 	and only output will come to source comp like servlet rd.include() method of servlet  -->
	
<!-- 	for more check the paint brush content of 6 Oct  -->
	