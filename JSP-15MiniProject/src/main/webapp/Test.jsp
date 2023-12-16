<h1 style="color: red;text-align: center">Here we are in Test.jsp</h1>
	<!-- 	Creating Object of Employee class -->
	<jsp:useBean id="emp" class="com.nt.service.Employee" scope="page"></jsp:useBean>
<!-- 	Setting Data for Employee object-->
	<jsp:setProperty property="*" name="emp"/>
	
<!-- 	Creating Object of Receipt class-->
<jsp:useBean id="r" class="com.nt.service.Receipt" scope="page"></jsp:useBean>
<!-- 		Accessing getReceipt() Methods of receipt class -->
	<jsp:scriptlet>
		System.out.println("Hash code of emp in Test: "+emp.hashCode());
			r.getReceipt(emp);
	</jsp:scriptlet>
<!-- 	Accessing Employee class getter methods and displaying the result  -->
		<h1>
		<b>Employee No: </b><jsp:expression>emp.getEno()</jsp:expression><br>
		<b>Employee Name: </b><jsp:expression>emp.getEname()</jsp:expression><br>
		<b>Employee Address: </b><jsp:expression>emp.getEadd()</jsp:expression><br>
		<b>Employee Salary: </b><jsp:expression>emp.getSalary()</jsp:expression><br>
		<b>Employee Gross Salary: </b><jsp:expression>emp.getGsalary()</jsp:expression><br>
		<b>Employee Net Salary: </b><jsp:expression>emp.getNsalary()</jsp:expression><br>
			
		</h1>