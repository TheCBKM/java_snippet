class BankAc{
int acno,balance;
String name,actype;
BankAc(String act,int acn,String nm,int bal){
actype=act;	acno=acn;		name=nm;		balance=bal;
}
//synchronized void withdraw(int amt){
void withdraw(int amt){
if(amt<balance){
System.out.println("U can withdraw Rs"+amt+" from A/C : "+acno);
balance=balance-amt;
System.out.println("Now,after trans balance is Rs."+balance+" in A/C : "+acno);
}
else{
System.out.println("*****U can't withdraw Rs"+amt+" from A/C : "+acno);
System.out.println("**The Insufficient fund is Rs."+balance+" in ur A/C : "+acno);
}
}
}