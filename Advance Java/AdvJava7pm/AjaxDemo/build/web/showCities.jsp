<%@page import="java.sql.*"%>
<%
Connection con=(Connection)application.getAttribute("mycon");
ResultSet rs=con.createStatement().executeQuery("select * from state");
%>
<html>
    <head> <script src="myjs.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        Select the State : <select name="st" id="st" onclick="getCities()">
<%
while(rs.next()){
    String stid=rs.getString(1);
    String stnm=rs.getString(2);
%>            
<option value="<%=stid%>"><%=stnm%></option>
<%
}
%>
        </select>        
<hr>
<h2><u>List of Cities</u></h2>
<div id="ct"></div>
    </body>
</html>
