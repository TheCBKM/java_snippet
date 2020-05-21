import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class Loodo extends Frame  implements ActionListener {
    Panel red,blue,green,yellow,home,br,rg,gy,yb;
    Red rgo[]=new Red[5];
    Blue bgo[]=new Blue[5];
    Yellow ygo[]=new Yellow[5];
    Green ggo[]=new Green[5];
    Button r[]=new Button[5];
    Button y[]=new Button[5];
    Button b[]=new Button[5];
    Button g[]=new Button[5];
    Button rr,gg,bb,yy,rol;
    TextField tf;
    Button p[]=new Button[73];
    Dialog d1;
    static int dice;
    Random rand = new Random();
    void createDialog() {
        rol= new Button("Roll");
        tf=new TextField(3);
        d1=new Dialog(this);
        d1.setTitle("DICE");
        d1.setSize(80,80);
        d1.setLocation(200,100);
        d1.setLayout(new FlowLayout());
        d1.add(rol);
        d1.add(tf);
        rol.addActionListener(this);
        d1.setVisible(true);
    }
    void houses() {
        red=new Panel();
        blue=new Panel();
        green=new Panel();
        yellow=new Panel();
        for(int i=1; i<5; i++) {
            rgo[i]=new Red();
            r[i]=new Button(i+"");
            r[i].setBackground(Color.red);
            ggo[i]=new Green();
            g[i]=new Button(i+"");
            g[i].setBackground(Color.green);
            bgo[i]=new Blue();
            b[i]=new Button(i+"");
            b[i].setBackground(Color.blue);
            ygo[i]=new Yellow();
            y[i]=new Button(i+"");
            y[i].setBackground(Color.yellow);
        }
        for(int j=1; j<73; j++) {
            p[j]=new Button(j+"");
            p[j].setBackground(Color.white);
        }
        red.add(r[1]);
        red.add(r[2]);
        red.add(r[3]);
        red.add(r[4]);
        blue.add(b[1]);
        blue.add(b[2]);
        blue.add(b[3]);
        blue.add(b[4]);
        yellow.add(y[1]);
        yellow.add(y[2]);
        yellow.add(y[3]);
        yellow.add(y[4]);
        green.add(g[1]);
        green.add(g[2]);
        green.add(g[3]);
        green.add(g[4]);
        red.setLayout(new GridLayout(2,2));
        yellow.setLayout(new GridLayout(2,2));
        blue.setLayout(new GridLayout(2,2));
        green.setLayout(new GridLayout(2,2));
    }
    void paths() {
        br=new Panel();
        rg=new Panel();
        gy=new Panel();
        yb=new Panel();
        for(int j=1; j<18; j++) {
            br.add(p[j]);
        }
        br.add(p[6]);br.add(p[7]); br.add(p[8]);
        br.add(p[5]);br.add(p[53]);br.add(p[9]);
        br.add(p[4]);br.add(p[54]);br.add(p[10]);
        br.add(p[3]);br.add(p[55]);br.add(p[11]);
        br.add(p[2]);br.add(p[56]);br.add(p[12]);
        br.add(p[1]);br.add(p[57]);br.add(p[13]);

        rg.add(p[14]);rg.add(p[15]);rg.add(p[16]);rg.add(p[17]);rg.add(p[18]);rg.add(p[19]);
        rg.add(p[62]);rg.add(p[61]);rg.add(p[60]);rg.add(p[59]);rg.add(p[58]);rg.add(p[20]);
        rg.add(p[26]);rg.add(p[25]);rg.add(p[24]);rg.add(p[23]);rg.add(p[22]);rg.add(p[21]);

        gy.add(p[39]); gy.add(p[67]);gy.add(p[27]);
        gy.add(p[38]);gy.add(p[66]); gy.add(p[28]);
        gy.add(p[37]);gy.add(p[65]); gy.add(p[29]);
        gy.add(p[36]);gy.add(p[64]); gy.add(p[30]);
        gy.add(p[35]);gy.add(p[63]); gy.add(p[31]);
        gy.add(p[34]);gy.add(p[33]); gy.add(p[32]);

        yb.add(p[47]);yb.add(p[48]);yb.add(p[49]);yb.add(p[50]);yb.add(p[51]);yb.add(p[52]);
        yb.add(p[46]); yb.add(p[68]);yb.add(p[69]);yb.add(p[70]);yb.add(p[71]);yb.add(p[72]);
        yb.add(p[45]);yb.add(p[44]);yb.add(p[43]);yb.add(p[42]);yb.add(p[41]);yb.add(p[40]);



            br.setLayout(new GridLayout(6,3));
            rg.setLayout(new GridLayout(3,6));
            gy.setLayout(new GridLayout(6,3));
            yb.setLayout(new GridLayout(3,6));


        br.setLayout(new GridLayout(6,3));
        rg.setLayout(new GridLayout(3,6));
        gy.setLayout(new GridLayout(6,3));
        yb.setLayout(new GridLayout(3,6));
    }
    void hom() {
        home =new Panel();
        rr=new Button("RED");
        bb=new Button("Blue");
        yy=new Button("YELLOW");
        gg=new Button("GREEN ");
        home.add(bb);
        home.add(rr);
        home.add(yy);
        home.add(gg);
        home.setLayout(new GridLayout(2,2));
    }
    void goBlue(){
      for(int i=1;i<5;i++){
        if(b[i].getBackground()==Color.white){
          b[i].setBackground(Color.blue);
          break;
        }
      }
    }
    void goRed(){
      for(int i=1;i<5;i++){
        if(r[i].getBackground()==Color.white){
          r[i].setBackground(Color.red);
          break;
        }
      }
    }
    void goGreen(){
      for(int i=1;i<5;i++){
        if(g[i].getBackground()==Color.white){
          g[i].setBackground(Color.green);
          break;
        }
      }
    }
    void goYellow(){
      for(int i=1;i<5;i++){
        if(y[i].getBackground()==Color.white){
          y[i].setBackground(Color.yellow);
          break;
        }
      }
    }
    void checkRed(int j,int z){
        int h=0,c=-1 ;
      for(int i=1;i<5;i++){if(rgo[i].pos==j){c++;}}
        for( int i=1;i<5;i++){
        if(rgo[i].pos==j){

        if(p[j+dice-z].getBackground()==Color.white){
          if(j>1&&j<8&&j+dice>=8){h=52-7;
          }
          p[j+dice-z+h].setBackground(Color.red);
          if(c!=0){p[j].setBackground(Color.red);}
          else p[j].setBackground(Color.white);
          rgo[i].pos=j+dice-z+h;
          break;
        }
        else if(p[j+dice-z].getBackground()==Color.red){
          if(dice!=0)
          for(int k=1;k<5;k++){
            if(rgo[k].pos==j+dice-z){;
              p[j+dice-z].setBackground(Color.red);
              if(c!=0){p[j].setBackground(Color.red);}
            else  p[j].setBackground(Color.white);
                  rgo[i].pos=j+dice-z;

            }
          }
        }
        else if(p[j+dice-z].getBackground()==Color.blue){
          for(int k=1;k<5;k++){
            if(bgo[k].pos==j+dice-z){;
              p[j+dice-z].setBackground(Color.red);
              if(c!=0){p[j].setBackground(Color.red);}
            else  p[j].setBackground(Color.white);
              bgo[k].pos=0;
              rgo[i].pos=j+dice-z;
              goBlue();
            }
          }
        }
        else if(p[j+dice-z].getBackground()==Color.green){
          for(int k=1;k<5;k++){
            if(ggo[k].pos==j+dice-z){
              p[j+dice-z].setBackground(Color.red);
              if(c!=0){p[j].setBackground(Color.red);}
              else
              p[j].setBackground(Color.white);
              ggo[k].pos=0;
              rgo[i].pos=j+dice-z;
              goGreen();
            }
          }
        }
        else if(p[j+dice-z].getBackground()==Color.yellow){
          for(int k=1;k<5;k++){
            if(ygo[k].pos==j+dice-z){
              p[j+dice-z].setBackground(Color.red);
              if(c!=0){p[j].setBackground(Color.red);}
              else
              p[j].setBackground(Color.white);
              bgo[k].pos=0;
              rgo[i].pos=j+dice-z;
              goYellow();
            }
          }
        }
      }

      }
    }
      void checkBlue(int j,int z){
          int h=0,c=-1 ;
        for(int i=1;i<5;i++){if(bgo[i].pos==j){c++;}};
        for(int i=1;i<5;i++){
          if(bgo[i].pos==j){
          if(p[j+dice-z].getBackground()==Color.white){
            if(j>40&&j<47&&j+dice>47){h=67-46;}
            p[j+dice-z+h].setBackground(Color.blue);
            if(c!=0){p[j].setBackground(Color.blue);}
            else p[j].setBackground(Color.white);
            bgo[i].pos=j+dice-z+h;
            break;
          }
          else if(p[j+dice-z].getBackground()==Color.blue){
            if(dice!=0)
            for(int k=1;k<5;k++){
              if(bgo[k].pos==j+dice-z){;
                p[j+dice-z].setBackground(Color.blue);
                if(c!=0){p[j].setBackground(Color.blue);}
              else  p[j].setBackground(Color.white);
                    bgo[i].pos=j+dice-z;

              }
            }
          }
          else if(p[j+dice-z].getBackground()==Color.red){
            for(int k=1;k<5;k++){
              if(rgo[k].pos==j+dice-z){
                p[j+dice-z].setBackground(Color.blue);
                p[j].setBackground(Color.white);
                rgo[k].pos=0;
                bgo[i].pos=j+dice-z;
                goRed();
              }
            }
          }
        else if(p[j+dice-z].getBackground()==Color.green){
            for(int k=1;k<5;k++){
              if(ggo[k].pos==j+dice-z){
                p[j+dice-z].setBackground(Color.blue);
                p[j].setBackground(Color.white);
                ggo[k].pos=0;
                bgo[i].pos=j+dice-z;
                goGreen();
              }
            }
          }
        else if(p[j+dice-z].getBackground()==Color.yellow){
            for(int k=1;k<5;k++){
              if(ygo[k].pos==j+dice-z){
                p[j+dice-z].setBackground(Color.blue);
                p[j].setBackground(Color.white);
                ygo[k].pos=0;
                bgo[i].pos=j+dice-z;
                goYellow();
              }
            }
          }
        }

        }
      }
      void checkYellow(int j,int z){
        int h=0,c=-1 ;
      for(int i=1;i<5;i++){if(ygo[i].pos==j){c++;}};
        for(int i=1;i<5;i++){
          if(ygo[i].pos==j){

          if(p[j+dice-z].getBackground()==Color.white){
            p[j+dice-z+h].setBackground(Color.yellow);
            if(c!=0){p[j].setBackground(Color.yellow);}
            else p[j].setBackground(Color.white);
            ygo[i].pos=j+dice-z+h;
            break;
            }

          else if(p[j+dice-z].getBackground()==Color.yellow){
            if(dice!=0)
            for(int k=1;k<5;k++){
              if(ygo[k].pos==j+dice-z){;
                p[j+dice-z].setBackground(Color.yellow);
                if(c!=0){p[j].setBackground(Color.yellow);}
              else  p[j].setBackground(Color.white);
                    ygo[i].pos=j+dice-z;

              }
            }
          }
        else  if(p[j+dice-z].getBackground()==Color.blue){
            for(int k=1;k<5;k++){
              if(bgo[k].pos==j+dice-z){
                p[j+dice-z].setBackground(Color.yellow);
                p[j].setBackground(Color.white);
                bgo[k].pos=0;
                ygo[i].pos=j+dice-z;
                goBlue();
              }
            }
          }
        else if(p[j+dice-z].getBackground()==Color.green){
            for(int k=1;k<5;k++){
              if(ggo[k].pos==j+dice-z){
                p[j+dice-z].setBackground(Color.yellow);
                p[j].setBackground(Color.white);
                ggo[k].pos=0;
                ygo[i].pos=j+dice-z;
                goGreen();
              }
            }
          }
          else if(p[j+dice-z].getBackground()==Color.red){
            for(int k=1;k<5;k++){
              if(rgo[k].pos==j+dice-z){
                p[j+dice-z].setBackground(Color.yellow);
                p[j].setBackground(Color.white);
                rgo[k].pos=0;
                ygo[i].pos=j+dice-z;
                goRed();
              }
            }
          }
        }

        }
      }
      void checkGreen(int j,int z){
          int h=0,c=-1 ;
        for(int i=1;i<5;i++){if(ggo[i].pos==j){c++;}};
          for(int i=1;i<5;i++){
            if(ggo[i].pos==j){

            if(p[j+dice-z].getBackground()==Color.white){
              if(j>14&&j<21&&j+dice>21){h=57-19;
              }
              p[j+dice-z+h].setBackground(Color.green);
              if(c!=0){p[j].setBackground(Color.green);}
              else p[j].setBackground(Color.white);
              ggo[i].pos=j+dice-z+h;
              break;

            }
            else if(p[j+dice-z].getBackground()==Color.green){
              if(dice!=0)
              for(int k=1;k<5;k++){
                if(ggo[k].pos==j+dice-z){;
                  p[j+dice-z].setBackground(Color.green);
                  if(c!=0){p[j].setBackground(Color.green);}
                else  p[j].setBackground(Color.white);
                      ggo[i].pos=j+dice-z;
                      goBlue();
                      goRed();
                      goYellow();
                }
              }
            }
            else if(p[j+dice-z].getBackground()==Color.blue){
              for(int k=1;k<5;k++){
                if(bgo[k].pos==j+dice-z){
                  p[j+dice-z].setBackground(Color.green);
                  p[j].setBackground(Color.white);
                  ggo[i].pos=j+dice-z;
                  bgo[k].pos=0;
                  goBlue();
                }
              }
            }
            else if(p[j+dice-z].getBackground()==Color.red){
              for(int k=1;k<5;k++){
                if(rgo[k].pos==j+dice-z){
                  p[j+dice-z].setBackground(Color.green);
                  p[j].setBackground(Color.white);
                  ggo[i].pos=j+dice-z;
                  rgo[k].pos=0;
                  goRed();
                }
              }
            }
            else if(p[j+dice-z].getBackground()==Color.yellow){
              for(int k=1;k<5;k++){
                if(ygo[k].pos==j+dice-z){
                  p[j+dice-z].setBackground(Color.green);
                  p[j].setBackground(Color.white);
                    bgo[k].pos=0;
                    ggo[i].pos=j+dice-z;
                  goYellow();
                }
              }
            }
          }

          }

      }
    public void actionPerformed(ActionEvent e) {
      int k=0;
        if(e.getSource()==rol) {
            dice=rand.nextInt(6)+1;
            tf.setText(dice+"");
        }
        for(int i=1; i<5; i++) {
            if(e.getSource()==r[i]) {
              if(rgo[i].pos==0){
                p[9].setBackground(Color.red);
                r[i].setBackground(Color.white);
                rgo[i].pos=9;
              }
            }
            else if(e.getSource()==b[i]) {
              if(bgo[i].pos==0){
                p[48].setBackground(Color.blue);
                b[i].setBackground(Color.white);
                bgo[i].pos=48;
              }
            }
            else if(e.getSource()==g[i]) {
              if(ggo[i].pos==0){
                p[22].setBackground(Color.green);
                g[i].setBackground(Color.white);
                ggo[i].pos=22;
              }
            }
            else if(e.getSource()==y[i]) {
              if(ygo[i].pos==0){
                p[35].setBackground(Color.yellow);
                y[i].setBackground(Color.white);
                ygo[i].pos=35;
              }
            }
        }
        for(int j=1; j<73; j++) {
            if(j+dice>52){k=52;}
            if(e.getSource()==p[j]) {
                if(p[j].getBackground()==Color.blue) {checkBlue(j,k) ; }
                else if(p[j].getBackground()==Color.red){checkRed(j,k);}
                else if(p[j].getBackground()==Color.yellow){checkYellow(j,k);}
                else if(p[j].getBackground()==Color.green){checkGreen(j,k);}
            }
        }
      }

    void  initcomp() {
        houses();
        paths();
        createDialog();
        hom();

        add(blue);
        add(br);
        add(red);
        add(yb);
        add(home);
        add(rg);
        add(yellow);
        add(gy);
        add(green);
        for(int i=1; i<5; i++) {
            r[i].addActionListener(this);
            b[i].addActionListener(this);
            y[i].addActionListener(this);
            g[i].addActionListener(this);
        }
        for(int j=1; j<72; j++) {
            p[j].addActionListener(this);
        }
    }
    Loodo() {
        initcomp();
        setSize(450,450);
        setLocation(100,100);
        setLayout(new GridLayout(3,3));

    }
    public static void main(String a[])throws Exception{
        new Loodo().setVisible(true);

    }
}
