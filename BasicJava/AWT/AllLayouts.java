import java.awt.*;

class AllLayouts extends Frame{
Label l1,l2;
TextField t1,t2;
Button b1,b2,b3;
Panel p1,p2;
AllLayouts(){init();}
void init(){
l1=new Label("Name");	l2=new Label("Address");
t1=new TextField(15);	t2=new TextField(15);
b1=new Button("Save"); 	 b2=new Button("Discard");  
b3=new Button("Exit");

p1=new Panel();
p1.setLayout(new GridLayout(2,2));
p1.setBackground(Color.yellow);
p1.add(l1); p1.add(t1);   p1.add(l2); p1.add(t2);


p2=new Panel();
p2.setBackground(Color.red);
p2.setLayout(new FlowLayout());
p2.add(b1);	p2.add(b2);	p2.add(b3);

setSize(250,250);
setLocation(100,100);
setBackground(Color.blue);
add(p1,"North");	add(p2,"South");
}
public static void main(String as[]){
new AllLayouts().setVisible(true);
}
}