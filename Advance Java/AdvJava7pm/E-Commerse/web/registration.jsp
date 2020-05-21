<%@include file="header.jsp" %>
<html>
    <header><script src="myjs.js"></script></header>
    <body>
        <h3>User Registration Form</h3>
        <form action="Register" method="Post">
            <pre>
User ID   : <input type="text" name="uid" id="uid"/><input type="button" value="Search" onclick="getDetails()"/>
User Name : <input type="text" name="unm" id="unm"/>
Address   : <input type="text" name="add" id="add"/>
Mobile no : <input type="text" name="mob" id="mob"/>
Password  : <input type="password" name="pass" id="pass"/>
User Type : <select  name="utype" id="utype">
<option>Buyer</option>
<option>Seller</option>
</select>
<input type="submit" name="b1" value="Save"/><input type="submit" name="b1" value="Update"/><input type="submit" name="b1" value="Delete"/>
            </pre>            
        </form>        
    </body>
</html>
<%@include file="footer.jsp" %>