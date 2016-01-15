<%-- 
    Document   : login
    Created on : Dec 3, 2015, 2:51:40 PM
    Author     : apprentice
--%>
<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact List</title>
    </head>
    <body>
        <div>
        <h2>Sign in to the Contact List App</h2>
        <c:if test="${param.login_error == 1}">
            <h3>Wrong id or password</h3>
        </c:if>

    <form method="post" class="signin" action="j_spring_security_check">
        <fieldset>
            <table ceellspacing="0">
                <tr>
                    <th>
                        <label for="username">Username</label>
                    </th>
                    <td>
                        <input id="username_or_email"
                               name="j_username"
                               type="text" />
                    </td>
                </tr>
                <tr>
                    <th>
                        <label for="password">Password</label>
                    </th>
                </tr>
                <td>
                    <input id="password"
                           name="j_password"
                           type="password"
                </td>
                <tr>
                    <th></th>
                    <td>
                        <input name="commit" type="submit"
                    </td>
                </tr>
            </table>
        </fieldset>
    </form>
        </div>
    </body>
</html>
