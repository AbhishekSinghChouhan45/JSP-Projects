<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stark Insdustries</title>
    <jsp:include page="header.html"></jsp:include>
    <style>
        body {
            background-color: #f4f4f4;
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }

        .header {
            background-color: black;
            color: gold;
            padding: 10px;
            text-align: center;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            
        }

        .button {
            display: inline;
            padding: 10px 20px;
            background-color: #007BFF;
            color: #fff;
            text-decoration: none;
            border-radius: 5px;
            margin: 10px;
        }

        .button:hover {
            background-color: #0056b3;
        }
        .footer{
        	background-color: black;
        	margin-top: 35%;
        }
    </style>
</head>
<body>
<!--     <div class="header"> -->
<!--         <h1>Welcome to My Mail App</h1> -->
<!--     </div> -->
    <div class="container" >
        <a href="#" class="button">Inbox</a>
        <a href="#" class="button">Compose Mail</a>
        <a href="#" class="button">Sent Mail</a>
        <a href="#" class="button">Trash</a>
        <a href="#" class="button">Home</a>
        <a href="#" class="button" onclick="alert('Hey')">About Me</a>
    </div>
    <div class="footer">
    <jsp:include page="footer.html"></jsp:include>
    </div>
</body>
</html>
