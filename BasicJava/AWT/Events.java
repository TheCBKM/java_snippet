import java.awt.*;
import java.awt.event.*;

class Events extends Frame implements ActionListener,FocusListener,ItemListener,KeyListener,MouseMotionListener{
TextField t1,t2;
Button b1,b2,b3,b4;
Choice ch1;
Checkbox cbx1;
Events(){initComponents();}

class MyAdpt extends MouseAdapter{
public void mouseEntered(MouseEvent e){
b4.setLabel("Show");
}
public void mouseExited(MouseEvent e){
b4.setLabel("Hide");
}
}




public void actionPerformed(ActionEvent e){
if(e.getSource()==b1)
	t2.setText(t1.getText());
else if(e.getSource()==b2)
	{t1.setText("");     t2.setText("");}
else if(e.getSource()==b3)
	System.exit(0);
}
public void focusGained(FocusEvent e){
t2.setBackground(Color.blue);
t2.setForeground(Color.white);
}
public void focusLost(FocusEvent e){
t2.setBackground(Color.white);
t2.setForeground(Color.black);
}
public void itemStateChanged(ItemEvent e){
if(e.getSource()==cbx1){
	boolean bl=cbx1.getState();
	ch1.setEnabled(bl);
}
else{
int n=ch1.getSelectedIndex();
switch(n){
case 0 : setBackground(Color.red); break;
case 1 : setBackground(Color.green); break;
case 2 : setBackground(Color.blue); break;
case 3 : setBackground(Color.white); break;
}
}
}
public void keyPressed(KeyEvent e){
if(e.getKeyCode()==KeyEvent.VK_F3)
t1.setText(t1.getText().toUpperCase());
t1.setForeground(Color.blue);
}
public void keyReleased(KeyEvent e){
if(e.getKeyCode()==KeyEvent.VK_F3)
t1.setText(t1.getText().toLowerCase());
t1.setForeground(Color.black);
}
public void keyTyped(KeyEvent e){
char ch=e.getKeyChar();
if(ch=='x' || ch=='X')
	System.exit(0);
}
public void mouseMoved(MouseEvent e){
int x=e.getX();
int y=e.getY();
setTitle("U r @ : "+x+" and "+y);
}
public void mouseDragged(MouseEvent e){
int x=e.getX();
int y=e.getY();
b2.setLocation(x,y);
}


void initComponents(){
t1=new TextField(12);	t2=new TextField(12);
b1=new Button("Copy"); b2=new Button("Clear"); b3=new Button("Exit");
b4=new Button("Change");
ch1=new Choice();	cbx1=new Checkbox("Allow to change the color");
ch1.setEnabled(false);
ch1.add("Red"); ch1.add("Green");   ch1.add("Blue"); ch1.add("White");
setSize(280,250);
setLocation(100,150);
setLayout(new FlowLayout());
add(cbx1); add(ch1);  add(t1);	add(t2);	add(b1);	add(b2);	add(b3); 
add(b4);  
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
t2.addFocusListener(this);
ch1.addItemListener(this);
cbx1.addItemListener(this);
t1.addKeyListener(this);
b2.addMouseMotionListener(this);
this.addMouseMotionListener(this);
b4.addMouseListener(new MyAdpt());
}
public static void main(String as[]){
new Events().setVisible(true);
}
}