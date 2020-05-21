<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<%
Connection con=(Connection)application.getAttribute("mycon");
ResultSet rs=con.createStatement().executeQuery("select * from product_category");
%>
<html>
    <body>
        <h3><u>List of Product Categories</u></h3>        
<%
while(rs.next()){
    String pcid=rs.getString(1);
    String pcnm=rs.getString(2);
%>    
<a href="showProduct.jsp?pcid=<%=pcid%>"><%=pcnm%></a><br>    
<%
}
%>        
    </body>
<hr>
<a href="buyershome.jsp">Back</a>
</html>
<%@include file="footer.jsp" %>
