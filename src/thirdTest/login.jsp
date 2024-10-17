<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login Form</h2>
    <form method="post" action="login.jsp">
        <label for="inputField">Введите ваш ID (число):</label>
        <input type="text" id="inputField" name="userId"/>
        <button type="submit" id="loginButton">ВОЙТИ</button>
    </form>

    <%
        String userId = request.getParameter("userId");
        if (userId != null) {
            try {
                Integer.parseInt(userId);
                out.println("<p id='successMessage'>Вход выполнен успешно!</p>");
            } catch (NumberFormatException e) {
                out.println("<p id='errorMessage' style='color:red;'>Неверный формат ввода. Пожалуйста, введите число.</p>");
            }
        }
    %>
</body>
</html>
