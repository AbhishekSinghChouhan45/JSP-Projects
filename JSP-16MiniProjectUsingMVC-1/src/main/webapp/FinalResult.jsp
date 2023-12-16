<%@page import="java.util.* , com.nt.service.*" %>
    <% 
    	List<StudentsData> s = (List)request.getAttribute("list"); 
    %>
<!DOCTYPE html>
<%@page import="com.nt.service.StudentsData"%>
<html>
<head>
<script type="javascript">
	function doPrint(){
		frames.focus();
		frames.Print();
</script>
    <title>Student Information</title>
    <style>
        body {
            background-color: #f2f2f2;
            font-family: Arial, sans-serif;
            text-align: center;
        }

        h1 {
            color: #333;
        }

        table {
            width: 80%;
            margin: 0 auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 10px 15px;
            text-align: center;
        }

        th {
            background-color: #333;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <h1>Student Information</h1>
    <table>
        <tr>
            <th>SNo</th>
            <th>SName</th>
            <th>Class</th>
            <th>Avg (Average)</th>
            <th>SResult</th>
        </tr>
         <%for(StudentsData ss : s){ %> <%-- For Loop started --%>
        <tr>
            <td><%=ss.getSno() %></td>
            <td><%=ss.getSname() %></td>
            <td><%=ss.getSclass() %></td>
            <td><%=ss.getSpercentage() %></td>
            <td><%=ss.getSresult()%></td>
        </tr>
  <% } %>
  	<a href="javaScript:doPrint()" >Print</a>
    </table>
    <h1 style="background-color: black;margin-top: 36%;color: white" ><small onclick="alert('Hey This side Abhishek')">&COPYAll rights 2003-2028 are reserved by devloper</small> </h1>
</body>
</html>
