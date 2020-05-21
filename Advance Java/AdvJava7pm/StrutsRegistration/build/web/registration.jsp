<%@taglib  uri="/WEB-INF/struts-html.tld" prefix="html"%>
<html>
    <body>
        <h1>Registration Form</h1><hr>
        <html:form action="/reg">
            <pre>
User Id  : <html:text property="uid"/>
Password : <html:password property="pass"/>
User Age : <html:text property="age"/>
Mobile No: <html:text property="mob"/>
Email Id : <html:text property="mail"/>
           <html:submit value="Save"/>
            </pre>            
</html:form>
    </body>
<hr>    
<html:errors/>
</html>
