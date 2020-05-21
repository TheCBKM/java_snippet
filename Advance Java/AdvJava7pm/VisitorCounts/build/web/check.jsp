<%
int n=(Integer)this.getServletContext().getAttribute("visitor");
%>
<html>
    <body>
        <h1>Hello u r <%=n%> visitor of this site....</h1>
        <a href="Logout">Logout</a>        
    </body>
</html>
