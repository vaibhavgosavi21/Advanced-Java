<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Navbar Page</title>

<style>
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
}

.navbar {
    background-color: #333;
    padding: 1rem 2rem;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.navbar-brand {
    color: white;
    font-size: 1.5rem;
    font-weight: bold;
    text-decoration: none;
}

.navbar-nav {
    display: flex;
    list-style: none;
    gap: 2rem;
}

.nav-link {
    color: white;
    text-decoration: none;
    padding: 0.5rem 1rem;
    border-radius: 4px;
    transition: background-color 0.3s;
}

.nav-link:hover,
.nav-link.active {
    background-color: #555;
}
</style>
</head>

<body>
    <nav class="navbar">
        <a class="navbar-brand" href="#">Main</a>
        <ul class="navbar-nav">
            <li><a class="nav-link active" href="Home.jsp">Home</a></li>
            <li><a class="nav-link" href="About.jsp">About</a></li>
            <li><a class="nav-link" href="contact.jsp">Contact</a></li>
        </ul>
    </nav>
</body>
</html>
