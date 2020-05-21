import java.sql.*;

class ResultMD1{
public static void main(String as[])throws Exception{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/postit","root","root");
ResultSet rs=con.createStatement().executeQuery("select * from ");
ResultSetMetaData rmd=rs.getMetaData();
int n=rmd.getColumnCount();
for(int p=1;p<=n;p++)
System.out.print(rmd.getColumnName(p)+"\t");
System.out.println("\n-----------------------------------------------------");
while(rs.next()){
	for(int i=1;i<=n;i++)
		System.out.print(rs.getString(i)+"\t");
System.out.println();
}
con.close();
}
}
