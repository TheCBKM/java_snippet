import java.sql.*;

class CallFunc{
public static void main(String as[])throws Exception{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:oradb","scott","tiger");
CallableStatement cs=con.prepareCall("{?=call gross_sal(?)}");
cs.registerOutParameter(1,Types.INTEGER);
cs.setInt(2,Integer.parseInt(as[0]));
cs.execute();
int n=cs.getInt(1);
System.out.println("The gross salary is : "+n);
con.close();
}
}









