import java.sql.*;

class MySqlConn{
public static void main(String as[])throws Exception{
Class.forName("com.mysql.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys","root","root");
ResultSet rs=con.createStatement().executeQuery("select * from student");
System.out.println("Sno \tRoll");
System.out.println("------------------------------------");
while(rs.next())
System.out.println(rs.getString(1));
));
con.close();
}
}
