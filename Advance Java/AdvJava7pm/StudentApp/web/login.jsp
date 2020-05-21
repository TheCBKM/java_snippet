<%
String roll="",pass="";
Cookie ck[]=request.getCookies();
if(ck!=null){
for(int i=0;i<ck.length;i++){
                Cookie c=ck[i];
                if(c.getName().equals("uid"))
                    roll=c.getValue();
                if(c.getName().equals("pass"))
                    pass=c.getValue();
                   }
}
%>
<html>
    <body>
        <h1>Login Form</h1><hr>
        <form action="CheckUser" method="Post">
            <pre>
User Id      : <input type="text" name="uid" value="<%=roll%>"/>
Password     : <input type="password" name="pass" value="<%=pass%>"/>
User Type    : <select name="utype">
<option>Admin</option>
<option>Student</option>
</select>
Save Details : <input type="checkbox" name="save" value="ON" />
               <input type="submit" value="Login"/>
            </pre>            
        </form>        
    </body>
</html>
