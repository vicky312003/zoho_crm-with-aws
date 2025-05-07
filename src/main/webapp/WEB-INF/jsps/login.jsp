<!-- /WEB-INF/jsps/login.jsp -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    
    <form action="/login" method="post">
        <label for="username">Email:</label>
        <input type="text" id="username" name="username" required/><br/><br/>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required/><br/><br/>
        
        <button type="submit">Login</button>
    </form>
    
    <div>
        <span c:if="${param.error}">Invalid email or password.</span>
    </div>
</body>
</html>
