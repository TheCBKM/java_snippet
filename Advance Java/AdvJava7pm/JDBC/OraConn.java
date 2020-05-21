import java.sql.*;

class OraConn{
public static void main(String as[])throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oradb","scott","tiger");
ResultSet rs=con.createStatement().executeQuery("select * from dept");
System.out.println("Deptno\tDeptName\tLocation");
System.out.println("---------------------------------------------");
while(rs.next())
System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
con.close();
}
}