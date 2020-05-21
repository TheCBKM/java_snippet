class Student{
int roll;
String name;
static String faculty="Anurag";
static void welcome(){
System.out.println("Welcome.........");
}

void set(int r,String nm){
roll=r;
name=nm;
}
void show(){
System.out.println("The details of Roll : "+roll);
System.out.println("The Name of the Student is  : "+name);
System.out.println("The name of the Faculty is : "+faculty);
System.out.println("-------------------------------------\n");
}
public static void main(String as[]){
Student s1=new Student();
Student s2=new Student();

s1.welcome();
s1.set(111,"Shivani");
s2.set(112,"Kapil");

s1.show();
s2.show();


//s1.faculty="Vikas";
//s2.show();

}
}