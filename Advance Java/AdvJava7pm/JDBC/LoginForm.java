import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class LoginForm extends Frame implements ActionListener{
Label l1,l2,l3;
TextField t1,t2,t3;
Button b1,b2,b3;
LoginForm(){initComponents();}
void initComponents(){
l1=new Label("Name");	l2=new Label("Roll no:-");
l3=new Label("Grade:-");
t1=new TextField(15);	t2=new TextField(15);
t3=new TextField(15);
b1=new Button("Ok");	b2=new Button("Cancel");
setSize(250,250);
setLocation(100,100);
setLayout(new GridLayout(4,2));
add(l1);	add(t1);	add(l2);	add(t2);		add(l3);   add(t3);		add(b1);	add(b2)	;	
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys?autoReconnect=true&useSSL=false","root","root");
String qry="insert into student values(?,?,?)";
PreparedStatement ps=con.prepareStatement(qry);
ps.setString(2,t1.getText());
ps.setInt(1,Integer.parseInt(t2.getText()));
ps.setString(3,t3.getText());
ps.executeUpdate();
con.close();
}
catch(ClassNotFoundException f){f.printStackTrace();}
catch(SQLException f){f.printStackTrace();}
}
if(e.getSource()==b2){System.exit(0);}

}
public static void main(String as[])throws Exception{
new LoginForm().setVisible(true);
}
}
