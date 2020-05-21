<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<%
String pid=request.getParameter("pid");
Connection con=(Connection)application.getAttribute("mycon");
PreparedStatement ps=con.prepareStatement("select * from products where pid=?");
ps.setString(1, pid);
ResultSet rs=ps.executeQuery();
rs.next();
%>
<html>
    <body>
        <h3><u>Product Specification</u></h3>
        <table border="3" width="3" cellspacing="3" cellpadding="3">
            <thead>
                <tr>
                    <th>Product Name</th>
                    <th>Specification</th>
                    <th>Price</th>
                    <th>Discount(%)</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td>
                    <td><%=rs.getString(4)%></td>
                    <td><%=rs.getString(5)%></td>
                </tr>
            </tbody>
        </table>
<hr>                
<a href="AddCart?pid=<%=pid%>">Add to Cart</a><br>
<a href="showProCat.jsp">view Product Categories</a><br>
<a href="buyershome.jsp">Home</a>
    </body>
</html>
<%@include file="footer.jsp" %>