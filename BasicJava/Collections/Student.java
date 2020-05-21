class Student{
int roll;
String name;
Student(int r,String nm){roll=r;	name=nm;	 }
public String toString(){
return roll+"-"+name;
}
void show(){
System.out.println("The Roll no is : "+roll);
System.out.println("The Name   is : "+name);
}
public static void main(String as[]){
Student s1=new Student(111,"Ajay");
Student s2=new Student(112,"jay");
System.out.println(s1);
System.out.println(s2);
}
}