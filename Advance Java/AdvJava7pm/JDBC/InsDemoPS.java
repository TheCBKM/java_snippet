import java.sql.*;

class InsDemoPS{
public static void main(String as[]){
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:empdsn");
int eno=Integer.parseInt(as[0]);
String enm=as[1];
String desg=as[2];
int sal=Integer.parseInt(as[3]);
int dno=Integer.parseInt(as[4]);

/*String qry="insert into emp values("+eno+",'"+enm+"','"+desg+"',"+sal+","+dno+")";
Statement st=con.createStatement();
st.executeUpdate(qry);*/

String qry="insert into emp values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qry);
ps.setInt(1,eno);
ps.setString(2,enm);
ps.setString(3,desg);
ps.setInt(4,sal);
ps.setInt(5,dno);
ps.executeUpdate();

con.close();
System.out.println("Record Added successfully........");
}catch(ClassNotFoundException e){e.printStackTrace();}
catch(SQLException e){e.printStackTrace();}
}
}