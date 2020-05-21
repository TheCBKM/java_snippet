import java.awt.*;
import java.awt.event.*;

class col extends Frame implements AdjustmentListener,ActionListener{
Label l1,l2,l3;
Button b1;
Scrollbar sb1,sb2,sb3;
col(){initcomp();}
void initcomp(){
b1=new Button("Exit");
l1=new Label("Red");
l2=new Label("Green");
l3=new Label("Blue");
sb1=new Scrollbar();
sb2=new Scrollbar();
sb3=new Scrollbar();
sb1.setBlockIncrement(25);
sb1.setEnabled(true);
sb1.setMaximum(265);
sb1.setMinimum(0);

sb1.setUnitIncrement(5);
sb1.setBlockIncrement(25);
sb2.setEnabled(true);
sb2.setMaximum(265);
sb2.setMinimum(0);

sb2.setUnitIncrement(5);
sb2.setBlockIncrement(25);
sb3.setEnabled(true);
sb3.setMaximum(265);
sb3.setMinimum(0);
b1.setBackground(Color.black);
b1.setForeground(Color.white);

sb3.setUnitIncrement(5);
b1.addActionListener(this);
sb1.addAdjustmentListener(this);
sb2.addAdjustmentListener(this);
sb3.addAdjustmentListener(this);
setSize(500,500);
setLocation(500,500);
setLayout(new FlowLayout());
add(l1); add(sb1); add(l2); add(sb2); add(l3); add(sb3);
add(b1);
}
public void  actionPerformed(ActionEvent e){	

	System.exit(0);
}
public void  adjustmentValueChanged(AdjustmentEvent e){
int r=sb1.getValue();
int g=sb2.getValue();
int b=sb3.getValue();
Color cl=new Color(r,g,b);
b1.setForeground(cl);
this.setBackground(cl);
setTitle("Red : "+r+",Green : "+g+" and Blue : "+b);
}
public static void main(String a[]){
new col().setVisible(true);
}
}
