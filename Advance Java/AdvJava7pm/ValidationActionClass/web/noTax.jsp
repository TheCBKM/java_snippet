<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="beans" %>
<html>
    <body>
        
          <h1><beans:message key="dept.name"/></h1>
        <h2>Branch-<beans:message key="br.name"/></h2><hr>
        <h3>
You Don't need to pay tax<br>
Your Salary is Rs.<beans:write name="TaxBeans" property="income"/>
        </h3>        
    </body>
</html>
