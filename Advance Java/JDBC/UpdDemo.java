import java.sql.*;

class UpdDemo{
public static void main(String as[])throws ClassNotFoundException,SQLException{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:std");
String qry="update student set fees=fees-5000 where fees>80000";
Statement st=con.createStatement();
int n=st.executeUpdate(qry);
System.out.println(n+" rows updated.........");
con.close();
}
}