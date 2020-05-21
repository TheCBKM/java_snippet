import java.awt.*;
class LoginForm extends Frame implements ActionListener{
Label l1,l2;
TextField t1,t2;
Button b1,b2,b3;
LoginForm(){initComponents();}
void initComponents(){
l1=new Label("Login");	l2=new Label("Password");
t1=new TextField(15);	t2=new TextField(15);
b1=new Button("Ok");	b2=new Button("Cancel");
t2.setEchoChar('*');

setSize(250,250);
setLocation(100,100);
setLayout(new FlowLayout());
add(l1);	add(t1);	add(l2);	add(t2);	add(b1);	add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public static void main(String as[]){
new LoginForm().setVisible(true);
}
}
