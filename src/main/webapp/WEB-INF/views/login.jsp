<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login - COBNet</title>
    <style>
        /* Loader overlay */
        #loader {
            position: fixed;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            background: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            z-index: 9999;
        }

        .spinner {
            border: 8px solid #f3f3f3;
            border-top: 8px solid #3498db;
            border-radius: 50%;
            width: 70px;
            height: 70px;
            animation: spin 1s linear infinite;
        }

        @keyframes spin {
            100% { transform: rotate(360deg); }
        }

        /* Hide login form initially */
        #loginForm {
            display: none;
            margin: 100px auto;
            width: 300px;
            padding: 20px;
            border: 1px solid #ddd;
            background: #fff;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        input[type=text], input[type=password] {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            border: 1px solid #ccc;
        }

        button {
            width: 100%;
            padding: 10px;
            background: #3498db;
            color: #fff;
            border: none;
            cursor: pointer;
        }

        button:hover {
            background: #2980b9;
        }
    </style>
</head>
<body>

<!-- Loader -->
<div id="loader">
    <div class="spinner"></div>
</div>

<!-- Login Form -->
<div id="loginForm">
    <h2>Login</h2>
	<form action="/patient/authenticate" method="post">
        <input type="text" name="username" placeholder="Enter Username" required>
        <input type="password" name="password" placeholder="Enter Password" required>
        <button type="submit">Login</button>
    </form>
</div>
<c:if test="${not empty error}">
   <p style="color:red;">${error}</p>
</c:if>


<script>
    // Hide loader after 2 seconds and show login form
    window.onload = function() {
        setTimeout(function(){
            document.getElementById("loader").style.display = "none";
            document.getElementById("loginForm").style.display = "block";
        }, 2000); // 2 seconds delay
    };
</script>

</body>
</html>
