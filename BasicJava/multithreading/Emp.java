class Emp extends Thread{
int empno,sal;
String name;
Emp(int eno,String nm,int sal){
empno=eno;	name=nm;		this.sal=sal;
}
public void run(){
salCalc();
}
void salCalc(){
System.out.println("The empno of Emp : "+name+" is : "+empno);
System.out.println("The Salary of Emp : "+name+" is : "+sal);
System.out.println("The HRA of Emp : "+name+" is : "+(sal*35/100));
if(name.equalsIgnoreCase("Ashay")){
System.out.print("Show Ur ID : ");
int n=new java.util.Scanner(System.in).nextInt();
}
System.out.println("The DA of Emp : "+name+" is : "+(sal*25/100));
System.out.println("The PF of Emp : "+name+" is : "+(sal*15/100));
System.out.println("--------------------------------------------------------------");
}
public static void main(String ss[]){
Emp e1=new Emp(1234,"Jagdev",45000);
Emp e2=new Emp(1235,"Somesh",46000);
Emp e3=new Emp(1236,"Ashay",47000);
Emp e4=new Emp(1237,"Vipul",48000);

/*e1.salCalc();
e2.salCalc();
e3.salCalc();
e4.salCalc();*/

e1.start();
e2.start();
e3.start();
e4.start();



}
}

