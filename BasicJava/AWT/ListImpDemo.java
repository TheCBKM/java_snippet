import java.awt.*;
import java.awt.event.*;

class ListImpDemo extends Frame implements ActionListener{
TextField t1;
Button b1,b2,b3,b4;
ListImpDemo(){init();}

public void actionPerformed(ActionEvent e){
java.util.Date dt=new java.util.Date();
t1.setText(dt.toString());
}

class Inn implements ActionListener{
public void actionPerformed(ActionEvent e){
t1.setText("");
}
}



void init(){
t1=new TextField(25);
b1=new Button("Show Today");
b2=new Button("Clear");
b3=new Button("Exit");
b4=new Button("Change Color");
setSize(250,200);
setLocation(100,100);
setLayout(new FlowLayout());
add(t1);	add(b1); add(b2);  add(b3); add(b4);
b1.addActionListener(this);
b2.addActionListener(new Inn());
b3.addActionListener(new External());
b4.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
t1.setBackground(Color.blue);
t1.setForeground(Color.white);
}
});
}
public static void main(String as[]){
new ListImpDemo().setVisible(true);
}
}