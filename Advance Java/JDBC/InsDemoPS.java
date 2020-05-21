import java.sql.*;

class InsDemoPS{
public static void main(String as[]){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:std");
int roll=Integer.parseInt(as[0]);
String name=as[1],course=as[2];
int sem=Integer.parseInt(as[3]);
int fee=Integer.parseInt(as[4]);
//Simple query through Statement object
//String qry="insert into student values("+roll+",'"+name+"','"+course+"',"+sem+","+fee+")";
//Statement st=con.createStatement();
//st.executeUpdate(qry);

//Parameterized query through PreparedStatement object
String qry="insert into student values(?,?,?,5,?)";
PreparedStatement ps=con.prepareStatement(qry);
ps.setInt(1,roll);
ps.setString(2,name);
ps.setString(3,course);
//ps.setInt(4,sem);
ps.setInt(4,fee);
ps.executeUpdate();


con.close();
System.out.println("Record Inserted Successfully....");
}catch(ClassNotFoundException e){
e.printStackTrace();
}catch(SQLException e){
System.out.println(e.getMessage());
}
}
}