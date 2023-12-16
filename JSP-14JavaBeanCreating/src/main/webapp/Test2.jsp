	<h1 style="color: red;text-align: center">Here we are in Test2.jsp</h1>
		<jsp:useBean id="st" class="com.nt.student.Student" scope="session"></jsp:useBean>
		<jsp:getProperty name="st" property="sno" />
		<jsp:getProperty name="st" property="sname" />
		<jsp:getProperty name="st" property="sadd"/>
		<jsp:getProperty name="st" property="m1"/>
		<jsp:getProperty name="st" property="m2"/>
		<jsp:getProperty name="st" property="m3"/>
		
	<h1 style="color: Green;text-align: center">Properties Readed Successfully</h1>
		