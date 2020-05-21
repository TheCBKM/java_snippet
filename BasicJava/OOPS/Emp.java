class Emp{
int empno;
String ename;
int mob;
Address ads;
Emp(int eno,String nm,int mob,Address adr)
{empno=eno;     ename=nm;	this.mob=mob;    ads=adr; }
void show(){
System.out.println("The Empno of Emp  is : "+empno);
System.out.println("The name of Emp  is : "+ename);
System.out.println("The Mob No of Emp  is : "+mob);
System.out.println("The Address of Emp  is : "+ads.sector+"-"+ads.hno+","+ads.colony+"\n\t\t\t"+ads.city);
System.out.println("-----------------------------------------------");
}
public static void main(String as[]){
int n=1235;
String nm="Kanika";
int m=556677;
Address ad1=new Address(355,'A',"New Palasia","Indore");
Emp e2=new Emp(n,nm,m,ad1);

Emp e1=new Emp(1234,"Ashish",995544,new Address(495,'C',"New Palasia","Indore"));	
e1.show();
e2.show();
}
}