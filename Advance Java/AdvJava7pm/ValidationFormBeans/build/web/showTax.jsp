<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="beans"%>
<html>
    <body>
          <h1><beans:message key="dept.name"/></h1>
        <h2>Branch-<beans:message key="br.name"/></h2><hr> 
        <h3>Tax Details</h3>
        <table border="4" width="4" cellspacing="3" cellpadding="3">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Amount</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Income</td>
                    <td><beans:write name="TaxBeans" property="income"/></td>
                </tr>
                <tr>
                    <td>Age</td>
                    <td><beans:write name="TaxBeans" property="age"/></td>
                </tr>
                <tr>
                    <td>Deduction</td>
                </tr>
                <tr>
                    <td>Tax Amt</td>
                    <td><beans:write name="TaxBeans" property="taxamt"/></td>
                </tr>
                <tr>
                    <td>Rebate</td>
                    <td><beans:write name="TaxBeans" property="rebate"/></td>
                </tr>
                <tr>
                    <td>Net Tax</td>
                    <td><beans:write name="TaxBeans" property="nettaxamt"/></td>
                </tr>
            </tbody>
        </table>
    </body>
<hr>    
For any enquiry Contact :  <br>
<beans:message key="it.comm.name" arg0="Shri"/>, <br>
<beans:message key="desg"/><br>
Mob : <beans:message key="it.comm.mob"/>


</html>
