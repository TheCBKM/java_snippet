<%@page import="org.hibernate.Session"%>
<%
int eno=Integer.parseInt(request.getParameter("eno"));
Session ss=hib.HibernateUtil.getSessionFactory().openSession();
//Query by ID(QBI)
hib.Emp e=(hib.Emp)ss.get(hib.Emp.class, eno);
%>
<html>
    <body>
        <h1>Employee Details are : </h1>
<h4>
Empno       : <%=e.getEmpno()%><br>        
Ename       : <%=e.getEname()%><br>        
Designation : <%=e.getJob()%><br>        
Salary      : <%=e.getSal()%><br>        
</h4>
</body>
</html>
