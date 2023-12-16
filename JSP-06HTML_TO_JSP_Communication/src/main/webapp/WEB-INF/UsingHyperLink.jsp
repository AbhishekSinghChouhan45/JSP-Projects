<%@ page import="java.sql.*" %>
<h1 style="color: red; text-align: center">HTML to JSP page communication</h1>
<%! private Connection con = null;
		private PreparedStatement ps1,ps2;
		// JspInit Method()
		public void jspInit(){
			//Servlet Config obj for getting connection values from xml
			ServletConfig cg = getServletConfig();
			try{
			String url = cg.getInitParameter("url");
			String username = cg.getInitParameter("username");
			String password = cg.getInitParameter("password");
			con = DriverManager.getConnection(url,username,password);
			ps1 = con.prepareStatement("SELECT * FROM Student");
			ps2 = con.prepareStatement("INSERT INTO Student(name,class,percentage)VALUES(?,?,?)");
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
%>
		<%
			String p = request.getParameter("s1");
				if(p.equals("check")){ 
				ResultSet rs = ps1.executeQuery();
				%>
						<table border="2" align="center" style="background-color: wheat;">
								<tr>
										<th>Name</th>
										<th>Class</th>
										<th>Percentage</th>
								</tr>
				<%		while(rs.next()!=false){
						%>
								<tr>
										<td><%=rs.getString(2)%></td>
										<td><%=rs.getInt(3) %></td>
										<td><%=rs.getFloat(4)%></td>
								</tr>			
					<% }//while end %>
						</table>
				<% } // if end
				else{
					String name = request.getParameter("name");
					int Class = Integer.parseInt(request.getParameter("class"));
					float percentage =  Float.parseFloat(request.getParameter("percentage"));
					ps2.setString(1,name);
					ps2.setInt(2, Class);
					ps2.setFloat(3,percentage);
					int count = ps2.executeUpdate();
					if(count>0){
					%>
							<h2 style="color: green;text-align: center">Student Registered Successfully</h2>
					<%}
					else{ %>
							<h2 style="color: red; text-align: center">Student Registration Failed</h2>
				<% }
					} %>
		
