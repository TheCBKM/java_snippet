<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Connection"%>
<%@include file="header.jsp" %>
<%
Connection con=(Connection)application.getAttribute("mycon");
ArrayList list=(ArrayList)session.getAttribute("cart");
String qry="";
if(list!=null){
qry="select * from products where pid in('";
for(int i=0;i<list.size();i++){
            String p=(String)list.get(i);
            qry=qry+p+"','";
}
qry=qry.substring(0, qry.length()-2)+")";
//out.println(qry);
}
ResultSet rs=con.createStatement().executeQuery(qry);

%>
<html>
    <body>
        <h3>Here is your cart.....</h3>
        <form action="RemoveMarkedProducts">
        <table style="width: 90%;" border="5" width="4" cellspacing="4" cellpadding="4">
            <thead>
                <tr>
                    <th>Product Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Discount(%)</th>
                    <th>Discount(Rs)</th>
                    <th>Net Price</th>
                    <th>Remove</th>
                    <th>Mark</th>
                </tr>
            </thead>
            <tbody>
<%
int tp=0,tdp=0,tnp=0;
while(rs.next()){
    String pid=rs.getString(1);
    String pnm=rs.getString(2);
    String pdesc=rs.getString(3);
    int price=rs.getInt(4);
    int dsper=rs.getInt(5);
    int dsrs=price*dsper/100;
    int net=price-dsrs;
    tp=tp+price;
    tdp=tdp+dsrs;
    tnp=tnp+net;
%>
                <tr>
                    <td><%=pnm%></td>
                    <td><%=pdesc%></td>
                    <td><%=price%></td>
                    <td><%=dsper%></td>
                    <td><%=dsrs%></td>
                    <td><%=net%></td>
                    <td align="center"><a href="EditCart?pid=<%=pid%>">X</a></td>
                    <td align="center"><input type="checkbox" name="chk" value="<%=pid%>" /></td>
                </tr>
<%
}
%>                
<tr>
    <td colspan="2" align="center"><b>Total</td>
    <td><b><%=tp%></td><td align="center"><b>0</td>
    <td><b><%=tdp%></td><td><b><%=tnp%></td>
    <td colspan="2"><input type="submit" value="Remove Marked"/></td>
</tr>
            </tbody>
        </table>
    </form>
    </body>
</html>
<%@include file="footer.jsp" %>