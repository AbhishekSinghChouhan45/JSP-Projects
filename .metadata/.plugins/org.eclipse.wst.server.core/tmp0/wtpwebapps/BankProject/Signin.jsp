
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>RBI Registration</title>
	<link rel="icon" href="RBI-Emblem-PNG.png" type="image/png">
    <style>
        body {
            background-image: url('https://images.hindustantimes.com/img/2021/07/24/1600x900/RBI_1627088344086_1627088360876.jpg'); /* Add your background image URL */
            background-size: cover;
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            color: white;
            background-color: #f4f4f4;
        }

        #registration-form {
            margin: 5% auto;
            background-color: rgba(0, 0, 0, 0.7);
            padding: 30px;
            border-radius: 10px;
            width: 400px;
            text-align: center;
            box-shadow: 0 0 20px rgba(255, 255, 255, 0.1);
        }

        #registration-form h2 {
            font-size: 30px;
            margin-bottom: 20px;
        }

        #registration-form input {
            font-size: 18px;
            border: none;
            border-bottom: 2px solid white;
            background: transparent;
            color: white;
            padding: 10px;
            margin: 10px 0;
            width: 100%;
            box-sizing: border-box;
        }

        #registration-form button {
            font-size: 18px;
            border: none;
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            margin-top: 20px;
            border-radius: 8px;
            cursor: pointer;
            margin-right: 60%;
        }

        #registration-form button:hover {
            background-color: #00134d;
        }

        #registration-form a {
            font-size: 16px;
            color: white;
            text-decoration: none;
            margin-top: 10px;
            display: inline-block;
        }

        #registration-form a:hover {
            text-decoration: underline;
            color: #4CAF50;
        }
        #registration-form select {
    		font-size: 18px;
            border: none;
            border-bottom: 2px solid white;
            background: transparent;
            color: white;
            padding: 10px;
            margin: 10px 0;
            width: 100%;
            box-sizing: border-box;
	}
	  #registration-form select option{
		  background-color: #333;
	  }
	  #msg{
	  	color: lightgreen;
		margin-top: 2%;
		margin-left: 25%;
		border: medium;
/* 		background: black; */
/* 		box-sizing: border-box; */
		box-shadow: 0 0 15px green;
	  }
    </style>
     <script>
        document.addEventListener('DOMContentLoaded', function () {
            var msgValue = '<%= request.getAttribute("msg") %>';
            if (msgValue === '1') {
                alert('Customer Details Registered Successfully');
                setTimeout(function () {
                    window.location.href = 'index.html';
                }, 1000);
            } else if (msgValue === '0') {
                alert('Customer Details Registered Unsuccessfully');
            }else if (msgValue === '3') {
                alert('Customer Already Registered');
            }
        });
    </script>
</head>
<body>

<div id="registration-form">
    <h2>RBI Registration</h2>
    <form id="rform" method="post" action="signin">
        <input type="text" name="name" placeholder="Name">
        <input type="text" name="username" placeholder="Username">
        <input type="password" name="password" placeholder="Password">
        <input type="date" name="dob" placeholder="DOB">
        <select name="type" style="width: 100%; padding: 10px; margin: 10px 0; box-sizing: border-box;" >
            <option value="saving">Saving</option>
            <option value="investing">Investing</option>
            <option value="personal">Personal</option>
        </select>
        <select name="gender" style="width: 100%; padding: 10px; margin: 10px 0; box-sizing: border-box;">
            <option value="male">Male</option>
            <option value="female">Female</option>
            <option value="other">Other</option>
        </select>
        <input type="tel" name="number" placeholder="Number">
        <input type="text" name="address" placeholder="Address" >
        <input type="number" name="balance" placeholder="Opening balance">
       <input type="file" name="identity_proof" placeholder="Identity Proof" accept="image/*" onchange="previewImage(event)">
		 <button type="submit">Register</button>
        <a href="#" onclick="document.getElementById('rform').reset(); return false;">Reset</a>
        
    </form>
    </div>
    
</body>
</html>
