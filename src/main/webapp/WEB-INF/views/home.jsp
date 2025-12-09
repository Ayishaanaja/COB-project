<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard - COBNet</title>
    <meta charset="UTF-8">
    <style>
        body {
            font-family: "Segoe UI", Arial, sans-serif;
            margin: 0;
            background-color: #f4f6f9;
            color: #333;
        }

        /* Header */
        header {
            background-color: #3498db;
            color: #fff;
            padding: 15px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        header h1 {
            margin: 0;
            font-size: 22px;
        }
        header .user-info {
            font-size: 14px;
        }

        /* Sidebar */
        nav {
            width: 220px;
            background-color: #2c3e50;
            position: fixed;
            top: 60px;
            bottom: 0;
            padding-top: 20px;
        }
        nav a {
            display: block;
            color: #ecf0f1;
            padding: 12px 20px;
            text-decoration: none;
            font-size: 15px;
        }
        nav a:hover {
            background-color: #34495e;
        }

        /* Main content */
        main {
            margin-left: 240px;
            padding: 30px;
        }
        .card {
            background: #fff;
            border-radius: 6px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.1);
            padding: 20px;
            margin-bottom: 20px;
        }
        .card h2 {
            margin-top: 0;
            font-size: 18px;
            color: #3498db;
        }
        .card p {
            font-size: 14px;
            color: #555;
        }

        /* Logout button */
        .logout {
            background-color: #e74c3c;
            color: #fff;
            border: none;
            padding: 8px 14px;
            cursor: pointer;
            border-radius: 4px;
        }
        .logout:hover {
            background-color: #c0392b;
        }
    </style>
</head>
<body>

<header>
    <h1>COBNet Admin Dashboard</h1>
    <div class="user-info">
        Logged in as <strong>Admin</strong> |
        <form action="/logout" method="post" style="display:inline;">
            <button class="logout" type="submit">Logout</button>
        </form>
    </div>
</header>

<nav>
    <a href="#">🏥 Patient Records</a>
    <a href="#">📑 Claims Management</a>
    <a href="#">⚖️ Benefits Coordination</a>
    <a href="#">📊 Reports & Analytics</a>
    <a href="#">👥 User Management</a>
</nav>

<main>
    <div class="card">
        <h2>Welcome to COBNet!</h2>
        <p>You have successfully logged in as an administrator. Use the navigation menu to manage patients, claims, and benefits coordination.</p>
    </div>

    <div class="card">
        <h2>Quick Actions</h2>
        <ul>
            <li>Review pending claims</li>
            <li>Generate monthly benefit coordination report</li>
            <li>Manage patient eligibility</li>
        </ul>
    </div>
</main>

</body>
</html>
