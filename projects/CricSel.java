import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

class CricSel extends Frame implements ActionListener,ItemListener {
    public static int i=0;
    Label l3;
    TextField tf1,l1,l2;
    Button b1,b2,b3,b4,b5;
    Choice c,c1,c2;
    Dialog d1;
    CricSel() {
        initcomp();
    }
    void initcomp() {
        l1=new TextField("Player 1");
        l2=new TextField("Player 2");
        c=new Choice();
        c1=new Choice();
        c2=new Choice();
        b1=new Button("Rest All");
        b2=new Button("Add Name");
        b3=new Button("Exit");
        add(c);
        add(l1);
        add(c1);
        add(l2);
        add(c2);
        add(b1);
        add(b2);
        add(b3);
        setSize(150,200);
        setLayout(new FlowLayout());
        setLocation(500,400);
        c.addItemListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        addList();
        createDialog();
    }
    void createDialog() {
        d1=new Dialog(this);
        d1.setSize(350,80);
        d1.setLocation(200,100);
        d1.setLayout(new FlowLayout());
        tf1=new TextField(15);
        b4=new Button("Add Name");
        b5=new Button("Cancel");
        d1.add(tf1);
        d1.add(b4);
        d1.add(b5);
        b4.addActionListener(this);
        b5.addActionListener(this);
    }

    void addList() {
        c.removeAll();
        c1.removeAll();
        c2.removeAll();
        try {
            FileInputStream fin=new FileInputStream("CricSel.txt");
            int n=fin.available();
            char[] c2 = new char[800];
            for(int i=0; i<=n; i++)
                c2[i]=(char)fin.read();
            fin.close();
            String s1 = String.valueOf(c2);
            StringTokenizer st=new StringTokenizer(s1.substring(0,n),";");
            while(st.hasMoreTokens())
                c.add(st.nextToken());
        } catch(IOException e2) {}
    }
    public void actionPerformed(ActionEvent u) {
        if(u.getSource()==b1) {
            c.removeAll();
            c1.removeAll();
            c2.removeAll();
            addList();
        }
        else if(u.getSource()==b2) {
            d1.setVisible(true);
        }
        else if(u.getSource()==b3) {
            System.exit(0);
        }
        else if(u.getSource()==b4) {
            try {
                FileOutputStream fout1=new FileOutputStream("CricSel.txt",true);
                String s1=(";"+tf1.getText());
                byte bt1[]=s1.getBytes();
                fout1.write(bt1);
                fout1.close();
                d1.dispose();
                addList();
            } catch(IOException i) {}
        }
        else if(u.getSource()==b5) {
            d1.dispose();
        }
    }
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==c) {
            if(i%2==0) {
                c1.add(c.getSelectedItem());
                i++;
                c.remove(c.getSelectedItem());
            }
            else if(i%2!=0) {
                c2.add(c.getSelectedItem());
                i++;
                c.remove(c.getSelectedItem());
            }
        }
    }

    public static void main(String a[])throws Exception{
        new CricSel().setVisible(true);



    }

}
