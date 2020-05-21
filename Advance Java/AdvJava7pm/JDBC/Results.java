import java.sql.*;

class Results{
public static void main(String as[])throws Exception{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:empdsn");

/*String qry="select * from emp";
ResultSet rs=con.createStatement().executeQuery(qry);*/
String qry="select * from emp where deptno=?";
PreparedStatement ps=con.prepareStatement(qry);
ps.setInt(1,Integer.parseInt(as[0]));
ResultSet rs=ps.executeQuery();

while(rs.next())
System.out.println(rs.getString("empno")+"\t"+rs.getString("ename")+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));

con.close();
}
}