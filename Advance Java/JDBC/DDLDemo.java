import java.sql.*;

class DDLDemo{
public static void main(String as[]){
try {
    try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
    } catch (InstantiationException | IllegalAccessException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
} catch (ClassNotFoundException e) {
    textArea.append("Where is your Oracle JDBC Driver?\n");
    e.printStackTrace();
    return;
}
textArea.append("JDBC ODBC Driver Registered!\n");
 
Connection myConn;
try {
    myConn = DriverManager.getConnection(dburl, "", "");
} catch (SQLException e) {
    textArea.append("Connection Failed! Check output console\n");
    e.printStackTrace();
    return;
}
 
if (myConn != null) {
    textArea.append("You made it, take control your database now!\n");
} else {
    textArea.append("Failed to make connection!\n");
}


String qry="create table course_mst(course text primary key,duration number)";
int n=myConn.createStatement().executeUpdate(qry);
myConn.close();
System.out.println(n+" rows affected.....");
}
}
