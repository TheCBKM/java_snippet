<jsp:useBean class="tax.TaxBeans" id="tbean" scope="request"/> 
<html>
    <body>
     <h1>Income Tax Department,India</h1><hr>
     <h3><u>Tax Details Are : </u></h3>     
     <table border="4" width="4" cellspacing="4" cellpadding="4">
         <thead>
             <tr>
                 <th>Description</th>
                 <th>Amount(Rs.)</th>
             </tr>
         </thead>
         <tbody>
             <tr>
                 <td>Income</td>
                 <td><jsp:getProperty name="tbean" property="income"/></td>
             </tr>
             <tr>
                 <td>Age</td>
                 <td><jsp:getProperty name="tbean" property="age"/></td>
             </tr>
             <tr>
                 <td>Tax Amt</td>
                 <td><jsp:getProperty name="tbean" property="taxamt"/></td>
             </tr>
             <tr>
                 <td>Rebate</td>
                 <td><jsp:getProperty name="tbean" property="rebate"/></td>
             </tr>
             <tr>
                 <td>Net tax</td>
                 <td><jsp:getProperty name="tbean" property="nettaxamt"/></td>
             </tr>
         </tbody>
     </table>
    </body>
</html>
