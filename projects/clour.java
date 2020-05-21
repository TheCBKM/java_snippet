import java.awt.*;
import java.awt.event.*;

class col extends Frame implements AdjustmentListener{
Lable l1,l2,l3;
ScrolrBar sb1,sb2,sb3;
col(){initcomp();}
void initcomp(){
l1=new Label("Red");
l2=new Label("Green");
l3=new Label("Blue");
sb1=new Scrollbar();
sb2=new Scrollbar();
sb3=new Scrollbar();
sb1.setBlockIncrement(25);
sb1.setEnabled(true);
sb1.setMaximum(256);
sb1.setMinimum(0);
sb1.setOrientation("Vertical");
sb1.setUnitIncrement(5);
sb1.setBlockIncrement(25);
sb2.setEnabled(true);
sb2.setMaximum(256);
sb2.setMinimum(0);
sb2.setOrientation("Vertical");
sb2.setUnitIncrement(5);
sb2.setBlockIncrement(25);
sb3.setEnabled(true);
sb3.setMaximum(256);
sb3.setMinimum(0);
sb3.setOrientation("Vertical");
sb3.setUnitIncrement(5);
sb1.addAdjustmentListener(this);
sb2.addAdjustmentListener(this);
sb3.addAdjustmentListener(this);
}
void adjustmentValueChanged(AdjustmentEvent e){
int r=sb2.getValue();
int g=sb2.getValue();
int b=sb3.getValue();
Color cl=new Color(r,g,b);
this.setBackground(cl);
setTitle("Red : "+r+",Green : "+g+" and Blue : "+b);
}
public ststic void main(String a[]){
new col().setVisible(true);
}
}
