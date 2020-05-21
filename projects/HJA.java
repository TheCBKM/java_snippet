import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
class HJA  {
Choice c1,c2;
Checkbox cb1,cb2;
Button b1,b2;
Label l1;
Frame f1;
TextField tf1;
void fetch(){
  f1=new Frame();
  cb1=new Checkbox("AM");
  cb2=new Checkbox("PM");
  c1= new Choice();
  c2= new Choice();
  l1=new Label("Enter the entry");
  tf1=new TextField(100);
  b1=new Button("Save");
  b2=new Button("Exit");
  f1.setSize(200,200);
  f1.setLocation(100,100);
  f1.setLayout(new GridLayout(4,2));
  c1.add("1-2");c1.add("2-3");c1.add("3-4");c1.add("4-5");c1.add("5-6");c1.add("6-7");c1.add("7-8");c1.add("8-9");c1.add("9-10");c1.add("10-11");c1.add("11-12");
  c1.add("12-1");
  c2.add("1-2");c2.add("2-3");c2.add("3-4");c2.add("4-5");c2.add("5-6");c2.add("6-7");c2.add("7-8");c2.add("8-9");c2.add("9-10");c2.add("10-11");c2.add("11-12");
  c2.add("12-1");
  f1.add(cb1);f1.add(cb2);f1.add(c1);f1.add(c2);f1.add(l1);f1.add(tf1);f1.add(b1);f1.add(b2);
    f1.setVisible(true);
}
void initComponent(){
  fetch();

}
public static void main(String as[])throws Exception{
new HJA().initComponent();
}
}
