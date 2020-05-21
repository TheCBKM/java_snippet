<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>
<%
String username=(String)session.getAttribute("username");
int n=0;
ArrayList list=(ArrayList)session.getAttribute("cart");
if(list!=null)
    n=list.size();
%>
<html>
    <body>
        <h3>Hello <%=username%>!!!!</h3>
    <marquee>U have <%=n%> items in your cart......</marquee>        
                <pre>
<a href="registration.jsp">Manage Details</a>
<a href="showProCat.jsp">View Product Categories</a>
<a href="">View Products</a>
<a href="showCart.jsp">View & Manager the Cart</a>
<a href="">Manage Bank Accounts</a>
<a href="">Delivery Track</a>
<a href="">Make Payments</a>
<a href="Logout">Logout</a>
        </pre>        

    </body>
</html>
<%@include file="footer.jsp" %>