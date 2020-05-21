<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stds","root","root");
ResultSet rs=con.createStatement().executeQuery("select pid,pname,price from product");        
%>
<html>
    <body>
        <h1>Product List</h1><hr>
        <table border="5" width="5" cellspacing="5" cellpadding="6">
            <thead>
                <tr>
                    <th>Product Id</th>
                    <th>Product Name</th>
                    <th>Price</th>
                    <th>Image</th>
                </tr>
            </thead>
            <tbody>
<%
while(rs.next()){
 int pid=rs.getInt(1);   
  String pnm=rs.getString(2);
  int price=rs.getInt(3);
%>
                <tr>
                    <td><%=pid%></td>
                    <td><%=pnm%></td>
                    <td><%=price%></td>
                    <td><img height="100" width="100" src="ShowImage?pid=<%=pid%>"/></td>
                </tr>
<%
}
%>
            </tbody>
        </table>

    </body>
</html>
