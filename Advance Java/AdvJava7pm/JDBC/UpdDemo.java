import java.sql.*;

class UpdDemo{
public static void main(String as[]) throws ClassNotFoundException,SQLException{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:empdsn");
String qry="update emp set sal=sal+5000 where deptno=15";
Statement st=con.createStatement();
int n=st.executeUpdate(qry);
System.out.println(n+" rows Updated.....");
con.close();
}
}