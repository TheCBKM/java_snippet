import java.awt.*;
import java.awt.event.*;
import java.io.*;

class File extends Frame implements ActionListener,ItemListener {


    Button b1,b2,b3,b4;
    TextArea ta1;
    TextField tf1;
    Choice c1;

    File () {
        initcomp();
    }
    public void actionPerformed(ActionEvent e) {
  if (e.getSource()==b1){
    try {

      FileOutputStream fout=new FileOutputStream(tf1.getText(),true);
      String s=ta1.getText();
      byte bt[]=s.getBytes();
      fout.write(bt);
      fout.close();
    }catch(IOException i){}
    //catch(FileNotFoundException f){}
  }
  if (e.getSource()==b2){
    try{

      FileInputStream fin=new FileInputStream(tf1.getText());
      int n=fin.available();
    char[] c = new char[100];
      for(int i=0;i<=n;i++)
      c[i]=(char)fin.read();
    String s1 = String.valueOf(c);
      ta1.setText(s1.substring(0,n));
    }catch(IOException e1){}
    //catch(FileNotFoundException f1){}
  }
  if (e.getSource()==b4){
    ta1.setText("");
    tf1.setText("");
  }
  if (e.getSource()==b3){
    System.exit(0);
  }
    }
    public void itemStateChanged(){
      File f1=new File("Files.txt");
      if(f1.isFile()){
        String name[]=f1.list();
          for(String nm:name)
          c1.add(nm);
      }


    }
    void initcomp() {

        b1=new Button("Save");
        b2=new Button("Open");
        b3=new Button("Exit ");
        b4=new Button("Clear All");
        c1=new Choice("Select Files available");
        ta1=new TextArea(10,20);
        tf1=new TextField(15);
          add(ta1);
        add(tf1);
        add(b1);
        add(b2);
        add(b4);
        add(b3);
       setSize(500,250);
        setLocation(100,100);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        tf1.addActionListener(this);
        c1.addItemListener(this);
    }
    public static void main(String a[]) throws Exception{
        new File().setVisible(true);
    }
}
