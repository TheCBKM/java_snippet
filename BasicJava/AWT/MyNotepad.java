import java.awt.*;
import java.awt.event.*;

class MyNotepad extends Frame implements ActionListener{
TextArea ta;
MenuBar mb;
Menu m1,m2,m3,m4;
MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8;
Dialog d1;
Label l1;
Choice ch1;
Checkbox cbx1,cbx2;
Button b1;
MyNotepad(){init();}

public void actionPerformed(ActionEvent e){
if(e.getSource()==mi1)
	d1.setVisible(true);
else if(e.getSource()==mi2)
	System.exit(0);
else if(e.getSource()==mi3)
	ta.setBackground(Color.red);
else if(e.getSource()==mi4)
	ta.setBackground(Color.green);
else if(e.getSource()==mi5)
	ta.setBackground(Color.blue);
else if(e.getSource()==mi6)
	ta.setBackground(Color.yellow);
else if(e.getSource()==mi7)
	ta.setForeground(Color.black);
else if(e.getSource()==mi8)
	ta.setForeground(Color.white);
else if(e.getSource()==b1){
	int style=0,size;
	size=Integer.parseInt(ch1.getSelectedItem());
	if(cbx1.getState()==true && cbx2.getState()==true)
		style=Font.BOLD+Font.ITALIC;
	else if(cbx1.getState()==true && cbx2.getState()==false)
		style=Font.BOLD;
	else if(cbx1.getState()==false && cbx2.getState()==true)
		style=Font.ITALIC;
	Font ft=new Font("Times New Roman",style,size);
	ta.setFont(ft);
	d1.dispose();
	}
	

}

void init(){
setSize(500,500);
setLocation(50,50);
ta=new TextArea("Welcome to my own notepad.....");
add(ta);
createMenu();
createDialog();
}

void createMenu(){
mb=new MenuBar();
m1=new Menu("Format");
m2=new Menu("Set Color");
m3=new Menu("Back Ground Color");
m4=new Menu("Font Color");
mi1=new MenuItem("Font");
mi2=new MenuItem("Exit");
mi3=new MenuItem("Red");
mi4=new MenuItem("Green");
mi5=new MenuItem("Blue");
mi6=new MenuItem("Yellow");
mi7=new MenuItem("Black");
mi8=new MenuItem("White");

m3.add(mi3); m3.add(mi4); m3.add(mi5); m3.add(mi6);
m4.add(mi7); m4.add(mi8);

m2.add(m3);   m2.addSeparator(); m2.add(m4);
m1.add(mi1);	m1.addSeparator();   m1.add(mi2);

mb.add(m1); 
mb.add(m2);
setMenuBar(mb);
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
mi4.addActionListener(this);
mi5.addActionListener(this);
mi6.addActionListener(this);
mi7.addActionListener(this);
mi8.addActionListener(this);
}

void createDialog(){
d1=new Dialog(this);
d1.setSize(350,80);
d1.setLocation(200,100);
d1.setLayout(new FlowLayout());

l1=new Label("Font Size : ");
ch1=new Choice();
for(int i=10;i<=100;i+=2)
	ch1.add(i+"");
cbx1=new Checkbox("Bold");
cbx2=new Checkbox("Italic");
b1=new Button("Apply");
d1.add(l1);	d1.add(ch1);  d1.add(cbx1);
d1.add(cbx2);  d1.add(b1);
b1.addActionListener(this);
}

public static void main(String as[]){
new MyNotepad().setVisible(true);
}
}
