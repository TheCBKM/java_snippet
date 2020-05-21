import java.awt.*;
import java.awt.event.*;
class Tictack extends Frame implements ActionListener {
    static int i=0,t=0;
    static int[] arr=new int[9];
    static String[] board=new String[9];
    static String var;
    Dialog d1,d2;
    TextField l1;
    Button be,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,bp1,bp2;
    void rese() {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        b1.setBackground(null);
        b2.setBackground(null);
        b3.setBackground(null);
        b4.setBackground(null);
        b5.setBackground(null);
        b6.setBackground(null);
        b7.setBackground(null);
        b8.setBackground(null);
        b9.setBackground(null);
        b1.setLabel(" ");
        b2.setLabel(" ");
        b3.setLabel(" ");
        b4.setLabel(" ");
        b5.setLabel(" ");
        b6.setLabel(" ");
        b7.setLabel(" ");
        b8.setLabel(" ");
        b9.setLabel(" ");
        for(int j=0; j<9; j++) {
            arr[j]=2;
        }
        i=0;
        for( int j=0; j<9; j++) {
            board[j]=null;
        }


    }
    void startDialog() {
        d2=new Dialog(this);
        d2.setSize(350,80);
        d2.setLocation(200,100);
        d2.setLayout(new FlowLayout());
        bp1=new Button("Player 1 Vs Pc");
        bp2=new Button("Player 1 Vs Player 2");
        d2.add(bp1);
        d2.add(bp2);
        bp1.addActionListener(this);
        bp2.addActionListener(this);
    }
    void createDialog() {
        d1=new Dialog(this);
        d1.setSize(350,80);
        d1.setLocation(200,100);
        d1.setLayout(new FlowLayout());
        b10=new Button("Replay");
        be=new Button("Exit");
        d1.add(l1);
        d1.add(b10);
        d1.add(be);
        b10.addActionListener(this);
        be.addActionListener(this);
    }
    Tictack() {
        startDialog();
        initcomp();
        d2.setVisible(true);

    }
    void buttons() {
        b1=new Button(" ");
        b2=new Button(" ");
        b3=new Button(" ");
        b4=new Button(" ");
        b5=new Button(" ");
        b6=new Button(" ");
        b7=new Button(" ");
        b8=new Button(" ");
        b9=new Button(" ");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
    }
    void initcomp() {

        l1=new TextField(20);
        buttons();
        rese();
        setSize(250,250);
        setTitle("Tictack Toe");
        setLocation(200,200);
        setLayout(new GridLayout(3,3));
        createDialog();
        //  rese();
    }
    void won( ) {
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }
    void winning( String player) {

        if(board[0] == player && board[1] == player && board[2] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b1.setBackground(Color.red);
            b2.setBackground(Color.red);
            b3.setBackground(Color.red);
        }
        else if(board[3] == player && board[4] == player && board[5] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b4.setBackground(Color.red);
            b5.setBackground(Color.red);
            b6.setBackground(Color.red);
        }
        else if(board[6] == player && board[7] == player && board[8] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b7.setBackground(Color.red);
            b8.setBackground(Color.red);
            b9.setBackground(Color.red);
        }
        else if(board[0] == player && board[3] == player && board[6] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b1.setBackground(Color.red);
            b4.setBackground(Color.red);
            b7.setBackground(Color.red);
        }
        else if(board[1] == player && board[4] == player && board[7] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b2.setBackground(Color.red);
            b5.setBackground(Color.red);
            b8.setBackground(Color.red);
        }
        else if(board[2] == player && board[5] == player && board[8] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b3.setBackground(Color.red);
            b6.setBackground(Color.red);
            b9.setBackground(Color.red);
        }
        else if(board[0] == player && board[4] == player && board[8] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b1.setBackground(Color.red);
            b5.setBackground(Color.red);
            b9.setBackground(Color.red);
        }
        else if(board[2] == player && board[4] == player && board[6] == player) {
            won();
            d1.setVisible(true);
            l1.setText(" "+player+" Won the match");
            b3.setBackground(Color.red);
            b5.setBackground(Color.red);
            b7.setBackground(Color.red);
        }

    }
    void seriesCheck() {
        for (int i=0; i<9; i++) {
            if (i==0||i==3||i==6) {
                if( p[i]==p[i+1]==(0/1))
                    p[i+2]==0 ;
            }
            if(i==0 || i==1 || i==2) {
                if( p[i]==p[i+3]==(0/1)) {
                    p[i+6]==0 ;
                }
            }
            if(i==0) {
                if( p[i]==p[i+4]==(0/1)) {
                    p[i+8]==0 ;
                }
            }
            If(i==3) {
                If( p[i]==p[i+2]==(0/1)) {
                    p[i+4]==0 ;
                }
            }
        }
    }
void firstMove(){

}
    public void actionPerformed(ActionEvent e) {
        int k=0;
        for(int j=0; j<9; j++) {
            if(arr[j]==1) {
                k++;
            }
        }
        if(k==8) {
            d1.setVisible(true);
            l1.setText("The Match is tie " );
        }

        String var;

        if(i%2==0) {
            var="X";
            i++;
        }
        else {
            var="O";
            i++;
        }
        if(e.getSource()==b1) {
            if(arr[0]==2) {
                b1.setLabel(var);
                arr[0]=1;
                board[0]=var;
                winning(var);
            }
            else {
                i--;
            }
        }
        if(e.getSource()==b2) {
            if(arr[1]==2) {
                b2.setLabel(var);
                arr[1]=1;
                board[1]=var;
                winning(var);

            } else {
                i--;
            }
        }
        if(e.getSource()==b3) {
            if(arr[2]==2) {
                b3.setLabel(var);
                arr[2]=1;
                board[2]=var;
                winning(var);

            } else {
                i--;
            }
        }

        if(e.getSource()==b4) {
            if(arr[3]==2) {
                b4.setLabel(var);
                arr[3]=1;
                board[3]=var;
                winning(var);


            } else {
                i--;
            }
        }
        if(e.getSource()==b5) {
            if(arr[4]==2) {
                b5.setLabel(var);
                arr[4]=1;
                board[4]=var;
                winning(var);
            } else {
                i--;
            }
        }
        if(e.getSource()==b6) {
            if(arr[5]==2) {
                b6.setLabel(var);
                arr[5]=1;
                board[5]=var;
                winning(var);

            } else {
                i--;
            }
        }
        if(e.getSource()==b7) {
            if(arr[6]==2) {
                b7.setLabel(var);
                arr[6]=1;
                board[6]=var;
                winning(var);

            } else {
                i--;
            }
        }
        if(e.getSource()==b8) {
            if(arr[7]==2) {
                b8.setLabel(var);
                arr[7]=1;
                board[7]=var;
                winning(var);

            } else {
                i--;
            }
        }
        if(e.getSource()==b9) {
            if(arr[8]==2) {
                b9.setLabel(var);
                arr[8]=1;
                board[8]=var;
                winning(var);

            } else {
                i--;
            }
        }
        if(e.getSource()==b10) {
            rese();
            d2.setVisible(true);
            d1.dispose();

        }
        if(e.getSource()==be) {
            System.exit(0);
            d1.dispose();
        }
        if(e.getSource()==bp1) {
            this.setVisible(true);
            initcomp();
            t=1;
            d2.dispose();
        }
        if(e.getSource()==bp2) {
            t=2;
            this.setVisible(true);
            d2.dispose();
        }
    }
    public static void main(String h[]) {
        new Tictack();
    }
}
