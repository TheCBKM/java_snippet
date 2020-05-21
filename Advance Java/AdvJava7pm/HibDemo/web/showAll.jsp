<%@page import="org.hibernate.criterion.Example"%>
<%@page import="org.hibernate.criterion.Order"%>
<%@page import="org.hibernate.criterion.Restrictions"%>
<%@page import="org.hibernate.Criteria"%>
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%
org.hibernate.Session ss=hib.HibernateUtil.getSessionFactory().openSession();
//Hibernate Query Language(HQL)
//Query qr=ss.createQuery("from hib.Emp where deptno=10");
//List list=qr.list();

//Query By Criteria(QBC)
Criteria cr=ss.createCriteria(hib.Emp.class);
//cr.add(Restrictions.eq("deptno", 10));
//cr.add(Restrictions.ne("deptno", 10));
//cr.add(Restrictions.gt("sal", 25000));
//cr.add(Restrictions.lt("sal", 50000));
//cr.add(Restrictions.between("sal", 20000, 50000));
//cr.add(Restrictions.like("ename", "%jay%"));
//cr.add(Restrictions.and((Restrictions.eq("deptno", 20)), (Restrictions.gt("sal", 25000))));
//cr.add(Restrictions.or((Restrictions.eq("deptno", 20)), (Restrictions.gt("sal", 25000))));
//cr.addOrder(Order.asc("ename"));
//cr.addOrder(Order.desc("ename"));
//List list=cr.list();

//Query by Example(QBE)
hib.Emp e1=new hib.Emp();
e1.setDeptno(20);
e1.setJob("prog");
Example ex=Example.create(e1);
cr.add(ex);
List list=cr.list();
%>
<html>
    <body>
        <h1>List of Employees</h1><hr>
        <table border="6" width="4" cellspacing="5" cellpadding="5">
            <thead>
                <tr>
                    <th>Emp Code</th>
                    <th>Name</th>
                    <th>Designation</th>
                    <th>Salary</th>
                    <th>DeptNo</th>
                </tr>
            </thead>
            <tbody>
<%
for(int i=0;i<list.size();i++){
    hib.Emp e=(hib.Emp)list.get(i);
    int eno=e.getEmpno();
    String nm=e.getEname();
    String job=e.getJob();
    int sal=e.getSal();
    int dno=e.getDeptno();
%>
                <tr>
                    <td><%=eno%></td>
                    <td><%=nm%></td>
                    <td><%=job%></td>
                    <td><%=sal%></td>
                    <td><%=dno%></td>
                </tr>
<%
}
%>
            </tbody>
        </table>
    </body>
</html>
