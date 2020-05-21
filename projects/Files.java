import java.awt.*;
  import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
import java.util.StringTokenizer;

class Files extends Frame implements ActionListener,ItemListener {

    Label l1,l2;
    Button b1,b2,b3,b4;
    TextArea ta1;
    TextField tf1;
    Choice c1;

    Files () {
        initcomp();
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            try {

                FileOutputStream fout=new FileOutputStream(tf1.getText(),true);
                String s=ta1.getText();
                byte bt[]=s.getBytes();
                fout.write(bt);
                fout.close();

                FileOutputStream fout1=new FileOutputStream("Files.txt",true);
                String s1=(tf1.getText()+" ");
                byte bt1[]=s1.getBytes();
                fout1.write(bt1);
                fout1.close();
                getFiles();
            } catch(IOException i) {}
            //catch(FileNotFoundException f){}
        }
        if (e.getSource()==b2) {
            try {

                FileInputStream fin=new FileInputStream(tf1.getText());
                int n=fin.available();
                char[] c = new char[100];
                for(int i=0; i<=n; i++)
                    c[i]=(char)fin.read();
                fin.close();
                String s1 = String.valueOf(c);
                ta1.setText(s1.substring(0,n));
            } catch(IOException e1) {}

        }
        if (e.getSource()==b4) {
            ta1.setText("");
            tf1.setText("");
        }
        if (e.getSource()==b3) {
            System.exit(0);
        }
    }
    public void itemStateChanged(ItemEvent i) {
        tf1.setText(c1.getSelectedItem());

    }
    void getFiles() {
        try {
            FileInputStream fin=new FileInputStream("Files.txt");
            int n=fin.available();
            char[] c = new char[100];
            for(int i=0; i<=n; i++)
                c[i]=(char)fin.read();
            fin.close();
            String s1 = String.valueOf(c);
              StringTokenizer st=new StringTokenizer(s1.substring(0,n)," ");
            while(st.hasMoreTokens())
                c1.add(st.nextToken());
        } catch(IOException e1) {}
    }


    void initcomp() {
        l1=new Label("Text of file : ");
        b1=new Button("Save");
        l2=new Label("Enter file Name : ");
        b2=new Button("Open");
        b3=new Button("Exit ");
        b4=new Button("Clear All");
        c1=new Choice();
        c1.setSize(20,20);
        ta1=new TextArea(10,20);
        tf1=new TextField(15);
        add(l1);
        add(ta1);
        add(l2);
        add(tf1);
        add(c1);
        add(b1);
        add(b2);
        add(b4);
        add(b3);
        setSize(600,250);
        setLocation(100,100);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        tf1.addActionListener(this);
        c1.addItemListener(this);
        getFiles();
    }
    public static void main(String a[]) throws Exception{
        new Files().setVisible(true);
    }
}
