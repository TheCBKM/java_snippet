<%@taglib uri="/WEB-INF/tlds/mytaglib" prefix="mytags" %>
<%@taglib uri="/WEB-INF/tlds/protaglib.tld" prefix="pro" %>
<%
String nm="Vinay";
%>
<html>
    <body>
        <mytags:welcome/>       
        <mytags:hello name="Richa" place="Delhi"/>
        <mytags:hello name="Kartik"/>
        <mytags:hello name="<%=nm%>"/>
        <%--        <mytags:hello place="Indore"/>
        <mytags:hello/>  --%>
    
        <pro:product pid="p1010"/>
        <pro:product pid="p3115"/>
    
    </body>
</html>


