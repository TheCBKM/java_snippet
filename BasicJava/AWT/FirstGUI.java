import java.awt.*;
class FirstGUI{
public static void main(String as[]){
//create the components........
Label l1=new Label();
l1.setText("Login");
Label l2=new Label("Password");
TextField t1=new TextField(10);
TextField t2=new TextField(10);
t2.setEchoChar('*');
Button b1=new Button();
b1.setLabel("Ok");
Button b2=new Button("Cancel");
//create the container........
Frame f1=new Frame();
f1.setSize(250,250);
f1.setLocation(50,50);
//FlowLayout fl=new FlowLayout();
//f1.setLayout(fl);
f1.setLayout(new GridLayout(3,2));
//f1.setLayout(null);
//Add Components to the container.....
/*f1.add(l1,"North");	    f1.add(t1,"Center");
f1.add(l2,"South");	    f1.add(t2);
f1.add(b1,"East");    f1.add(b2,"West");*/

f1.add(l1);	    f1.add(t1);
f1.add(l2);	    f1.add(t2);
f1.add(b1);    f1.add(b2);
f1.pack();
f1.setVisible(true);

}
}