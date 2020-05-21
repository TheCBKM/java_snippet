<html>
    <body>
        <h1>Compose a Mail</h1><hr>
        <form action="TestMail" method="Post">
            <pre>
Mail To  : <input type="mail" name="to"/>
CC       : <input type="mail" name="cc"/>
From     : <input type="mail" name="from"/>
Password : <input type="password" name="pass"/>
Subject  : <input type="text" name="sub"/>
Content  : <textarea name="cnt" rows="4" cols="20">
</textarea>
            <input type="submit" value="Send Mail"/>
            </pre>
        </form>        
    </body>
</html>
