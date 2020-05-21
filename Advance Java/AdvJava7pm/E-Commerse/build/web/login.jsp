<%@include  file="header.jsp" %>
<html>
    <body>
        <h3>Login Page</h3>
        <form action="CheckUser" method="Post">
            <pre>
User ID : <input type="text" name="uid"/>
Password: <input type="password" name="pass"/>
          <input type="submit" value="Login Now"/>

<a href="registration.jsp">New User Register Here</a>
            </pre>            
        </form>        
    </body>
</html>
<%@include file="footer.jsp" %>
