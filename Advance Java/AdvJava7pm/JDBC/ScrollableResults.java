import java.sql.*;

class ScrollableResults{
public static void main(String as[])throws Exception{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:empdsn");
String qry="select * from emp";
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery(qry);
System.out.println("Empno\tEname\tJob\tSal\tDeptno");
System.out.println("---------------------------------------------------");
while(rs.next())
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
System.out.println("---------------------------------------------------");
rs.previous();
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
rs.relative(-5);
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
rs.absolute(3);
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
rs.beforeFirst();
rs.next();
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
rs.afterLast();
rs.previous();
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));

con.close();
}
}