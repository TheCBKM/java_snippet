import java.sql.*;

class UpdResults{
public static void main(String as[])throws Exception{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:empdsn");
Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
ResultSet rs=st.executeQuery("select * from emp");
//delete a row
/*rs.absolute(3);
rs.deleteRow();
System.out.println("Record Deleted......");*/

//update a row
/*rs.absolute(5);
rs.updateString(3,"Executive");
rs.updateInt(4,25000);
rs.updateRow();
System.out.println("Record Update Successfully.....");*/

//insert a row
rs.moveToInsertRow();
rs.updateInt(1,1236);
rs.updateString(2,"Akshata");
rs.updateString(3,"Executive");
rs.updateInt(4,25000);
rs.updateInt(5,30);
rs.insertRow();
System.out.println("Record Insert Successfully.....");

con.close();
}
}