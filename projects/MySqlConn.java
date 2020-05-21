import java.sql.*;

class MySqlConn{
public static void main(String as[])throws Exception{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys?autoReconnect=true&useSSL=true","root","root");
ResultSet rs=con.createStatement().executeQuery("select * from student" );
System.out.println("Roll\tname\tgrade");
System.out.println("------------------------------------");
while(rs.next())
System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
con.close();
}
}
