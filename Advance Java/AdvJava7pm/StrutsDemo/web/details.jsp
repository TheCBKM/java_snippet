<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="beans" %>
<html>
    <body>
        <h1><beans:message key="dept.name"/></h1>
        <h2>Branch-<beans:message key="br.name"/></h2><hr>
        <html:form action="/demo">
            <pre>
Income    : <html:text property="income"/>            
Age       : <html:text property="age"/>
Deduction : <html:text property="deduction"/>
            <html:submit value="Show Tax"/>
</pre>            
        </html:form>        
    </body>
<hr>    
<u>Details Submitted To :</u> <br>
<beans:message key="it.comm.name" arg0="Mr."/>, <br>
<beans:message key="desg"/><br>
Mob : <beans:message key="it.comm.mob"/>
</html>
