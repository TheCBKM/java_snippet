<jsp:useBean class="tax.TaxBeans" id="tbeans"/>
<%--  tax.TaxBeans tbeans=new tax.TaxBeans();--%>
<%--First Approach
<%
int i=Integer.parseInt(request.getParameter("i"));
int a=Integer.parseInt(request.getParameter("a"));
int ded=Integer.parseInt(request.getParameter("ded"));
%>
<jsp:setProperty name="tbeans" property="income" value="<%=i%>"/>
<jsp:setProperty name="tbeans" property="age" value="<%=a%>"/>
<jsp:setProperty name="tbeans" property="deduction" value="<%=ded%>"/>
--%>
<%--Second Approach 
<jsp:setProperty name="tbeans" property="income" param="income"/>
<jsp:setProperty name="tbeans" property="age" param="age"/>
<jsp:setProperty name="tbeans" property="deduction" param="deduction"/>
--%>
<%--Third Approach--%>
<jsp:setProperty name="tbeans" property="*"/>



<html>
    <body>
         <h1>Income Tax Department,India</h1><hr>
<h3><u>Tax Details</u></h3>         
<table border="5" width="4" cellspacing="5" cellpadding="8">
    <thead>
        <tr>
            <th>Description</th>
            <th>Amount(Rs.)</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Income</td>
            <td><jsp:getProperty name="tbeans" property="income"/></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><jsp:getProperty name="tbeans" property="age"/></td>
        </tr>
        <tr>
            <td>Tax Amount</td>
            <td><jsp:getProperty name="tbeans" property="taxamt"/></td>
        </tr>
        <tr>
            <td>Rebate</td>
            <td><jsp:getProperty name="tbeans" property="rebate"/></td>
        </tr>
        <tr>
            <td>Net Tax</td>
            <td><jsp:getProperty name="tbeans" property="nettaxamt"/></td>
        </tr>
    </tbody>
</table>
    </body>
</html>
