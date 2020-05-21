<jsp:useBean class="tax.TaxBeans" id="tbean" scope="session"/>
<html>
    <body>
     <h1>Income Tax Department,India</h1><hr>
     <h3>You don't need to pay tax,because your Salary is Just Rs. <jsp:getProperty name="tbean" property="income"/></h3>     
    </body>
</html>
