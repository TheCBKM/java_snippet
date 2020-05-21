class ATMCard extends Thread{
int a;
BankAc acc;
public void run(){
if(acc.actype.equalsIgnoreCase("OD"))
	acc.withdraw(9000);
else{
	synchronized(acc){
		acc.withdraw(9000);
	}

}

}
public static void main(String as[]){
BankAc ac1=new BankAc("SB",111,"Ajay",10000);
BankAc ac2=new BankAc("SB",112,"Vikas",15000);
BankAc ac3=new BankAc("SB",113,"Ashish",20000);
BankAc ac4=new BankAc("SB",114,"Vina",30000);
BankAc ac5=new BankAc("OD",115,"InfoSolutions",10000);

ATMCard c1=new ATMCard();
ATMCard c2=new ATMCard();
ATMCard c3=new ATMCard();
ATMCard c4=new ATMCard();
ATMCard c5=new ATMCard();
ATMCard c6=new ATMCard();

c1.a=10;
c2.a=20;
c1.acc=ac1;
c2.acc=ac1;
c3.acc=ac3;
c4.acc=ac4;
c5.acc=ac5;
c6.acc=ac5;


c1.start();
c2.start();
c3.start();
c4.start();
c5.start();
c6.start();


}
}
