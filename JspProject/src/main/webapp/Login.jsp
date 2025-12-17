<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body{

        }
    .box{background-color: rgb(141, 149, 160);
        height: 500px;
        width: 450px;
        border-radius: 5cap;
        border-color: black 2;
        border-width: 2px;
    }
    #btn{
        color:white;
        height: 20px;
        width: 20%;
        background-color: rgb(74, 155, 151);
    }
    </style>
</head>
<body>
<form action="login" method="post">
<center>
            <div class="box">
                <br>
                <br>
                <h1>Login</h1>
                <label for=""><b>Username:</b></label> 
                <input type="user" name="username" placeholder="enter username" required>   
                <br>
                <br>
                <label for=""><b>Password:</b></label>
                <input type="password" name="password" placeholder="enter password" required>       
                <br>
                <br>
                <button type="submit" >Login</button>
                <br>
                <br>
                <p>New user?<a href="./Registration.jsp"> Sign up</a></p>
            </div>
        </center>
    </form>
    
</body>
</html>