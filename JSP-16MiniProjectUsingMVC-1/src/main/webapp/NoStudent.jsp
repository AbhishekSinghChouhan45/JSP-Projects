<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Error Page</title>
    <style>
        body {
            background-image: url('your-background-image.jpg');
            background-size: cover;
            background-position: center;
            height: 100vh;
            margin: 0;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        .error-container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 10px;
            text-align: center;
        }

        h1 {
            font-size: 36px;
            color: #333;
        }

        p {
            font-size: 24px;
            color: #666;
        }

        a {
            text-decoration: none;
            color: #007BFF;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <h1>No student data found</h1>
        <p>Sorry, we couldn't find any information for the requested student.</p>
        <a href="index.html">Go back to the homepage</a>
    </div>
</body>
</html>
