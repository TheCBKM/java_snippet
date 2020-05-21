import java.sql.*;
import java.lang.Class.*;
class DDLDemo{
public static void main(String as[])throws Exception{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:passwd");
String qry="create table dept(deptno number primary key,dname text)";
int n=con.createStatement().executeUpdate(qry);
System.out.println(n+" rows affected.....");
con.close();
}
}
