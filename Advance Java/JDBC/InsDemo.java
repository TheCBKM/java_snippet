import java.sql.*;

class InsDemo{
public static void main(String as[]){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:std");
String qry="insert into student values(113,'Chanchal','MCA',6,56000)";
Statement st=con.createStatement();
st.executeUpdate(qry);
con.close();
System.out.println("Record Inserted Successfully....");
}catch(ClassNotFoundException e){
e.printStackTrace();
}catch(SQLException e){
System.out.println(e.getMessage());
}
}
}