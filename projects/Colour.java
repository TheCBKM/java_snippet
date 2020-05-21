import java.util.awt.*;
class Clour extends Frame implements ItemListener{
Checkbox cb1,cb2,cb3;
Button b1;
Clour(){inticomponents();}
public void inticomponents(){
b1=new button("Exit");
cb1= new Chekbox("Red");
cb2= new Chekbox("Blue");
cb3= new Chekbox("Green");
setSize(250,250);
setLocation(100,100);
setLayout(new FlowLayout());
add(cb1);add(cb1);add(cb1);
addItemListener(this);

}
public void itemStateChanged(ItemEvent e) {
if(cb1.getState){setBackgroung("red");}
if(cb2.getState){setBackgroung("blue");}
if(cb3.getState){setBackgroung("green");}
}
public static void main(String a[]){
new Clour().setVisibility(true);
}
}
