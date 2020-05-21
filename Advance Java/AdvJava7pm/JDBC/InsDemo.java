import java.sql.*;

class InsDemo{
public static void main(String as[]){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:empdsn");
String qry="insert into emp values(1236,'Prachi','Prog',30000,10)";
Statement st=con.createStatement();
st.executeUpdate(qry);
con.close();
System.out.println("Record Added successfully........");
}catch(ClassNotFoundException e){e.printStackTrace();}
catch(SQLException e){e.printStackTrace();}
}
}