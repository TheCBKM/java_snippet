<%@page import="java.sql.*"%>
<%
Connection con=(Connection)application.getAttribute("mycon");
ResultSet rs=con.createStatement().executeQuery("select * from state");
%>
<html>
    <header>
        <script src="myjs.js"></script>
        <script>
            var request;
            function checkId(){
            request=new XMLHttpRequest();    
            request.onreadystatechange=getOutput;
            var v=document.getElementById("cid").value;
            request.open("get","CheckCustomerID?cid="+v, true);
            request.send(null);
        }
            
            function getOutput(){
                if(request.readyState==4 && request.status==200){
                    var res=request.responseText;
                    document.getElementById("output").innerHTML=res;
                }
                else
                    document.getElementById("output").innerHTML="Error.....";
            }
        </script>
        
    </header>
   
    <body>
        <h1>Customer registration Form</h1><hr>
        <form action="Regist" method="post">
            <pre> 
Customer Id   : <input type="text" name="cid" id="cid"/><input type="button" value="Check Id" onclick="checkId()" />
<div id="output"></div>
Customer Name : <input type="text" name="cnm"/>
E-mail Id     : <input type="text" name="mail"/>
Mobile No     : <input type="text" name="mob"/>
Address       : <input type="text" name="add"/>
State         : <select name="st" id="st" onclick="getCities()">
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
city          : <select name="ct" id="ct"/>
                <input type="submit" value="Save"/>
           
            </pre>
        </form>        
    </body>
</html>
