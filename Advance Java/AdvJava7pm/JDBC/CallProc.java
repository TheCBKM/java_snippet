import java.sql.*;

class CallProc{
public static void main(String as[])throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oradb","Scott","tiger");
CallableStatement cs=con.prepareCall("{call add_dept(?,?,?)}");
cs.setInt(1,Integer.parseInt(as[0]));
cs.setString(2,as[1]);
cs.setString(3,as[2]);
cs.execute();
con.close();
System.out.println("Record Addedd.....");
}
}