class Student implements java.io.Serializable{
int roll;
String name;
double fees;
boolean status;
Student(int r,String nm,double fee,boolean st){
roll=r;	name=nm;		
fees=fee;	status=st;
}
void show(){
System.out.println("The details of Roll : "+roll);
System.out.println("---------------------------------");
System.out.println("Name of the Student is : "+name);
System.out.println("He/She Paid Fees Rs. "+fees);
System.out.println("His/Her Status is : "+status);
System.out.println("-----------------------------------");
}
}