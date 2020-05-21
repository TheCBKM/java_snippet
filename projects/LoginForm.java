import java.awt.*;
import java.sql.*;
import java.awt.event.*;
class LoginForm  implements ActionListener{
  Frame f1,f2,f3;
  Label l1,l2,l3;
  TextField t1,t2,t3;
  Button b1,b2,b3,b4,b5,b6;
LoginForm(){initComponents();}
void initComponents(){
option();
f1.setVisible(true);
entryRec();
}
void option(){
  f1=new Frame();
  b4=new Button("Fetch a record");	b5=new Button("Add a record"); b6=new Button("Exit");
  f1.setSize(300,100);
  f1.setLocation(100,100);
  f1.setLayout(new GridLayout(1,3));
  f1.add(b4);
  f1.add(b5);
  f1.add(b6);
  b4.addActionListener(this);
  b6.addActionListener(this);
  b5.addActionListener(this);
}
void entryRec(){
  f2=new Frame();
  l1=new Label("Name");	l2=new Label("Roll no:-");
  l3=new Label("Grade:-");
  t1=new TextField(15);	t2=new TextField(15);
  t3=new TextField(15);
  b1=new Button("Ok");	b2=new Button("Cancel");
  f2.setSize(250,250);
  f2.setLocation(100,100);
  f2.setLayout(new GridLayout(4,2));
  f2.add(l1);	f2.add(t1);	f2.add(l2);	f2.add(t2);		f2.add(l3);   f2.add(t3);		f2.add(b1);	f2.add(b2)	;
  b1.addActionListener(this);
  b2.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
if(e.getSource()==b1){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/sys?autoReconnect=true&useSSL=true","root","root");
String qry="insert into student values(?,?,?)";
PreparedStatement ps=con.prepareStatement(qry);
ps.setString(2,t1.getText());
ps.setInt(1,Integer.parseInt(t2.getText()));
ps.setString(3,t3.getText());
ps.executeUpdate();
con.close();
f1.setVisible(true);
f2.setVisible(false);
}
catch(ClassNotFoundException f){f.printStackTrace();}
catch(SQLException f){f.printStackTrace();}
}
if(e.getSource()==b2){
  f1.setVisible(true);
f2.setVisible(false);}
if(e.getSource()==b4){
  f2.setVisible(true);
  f1.setVisible(false);
}
if(e.getSource()==b6){
  System.exit(0);
}

}
public static void main(String as[])throws Exception{
new LoginForm();
}
}
