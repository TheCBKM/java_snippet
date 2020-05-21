import java.util.HashMap;
class StdMap{
public static void main(String as[]){
Student s1=new Student(11,"Prakhar");
Student s2=new Student(12,"Akshat");
Student s3=new Student(13,"Pawas");
Student s4=new Student(14,"Priya");
Student s5=new Student(15,"Shivani");
Student s6=new Student(16,"Soumya");
Student s7=new Student(17,"Mohit");
Student s8=new Student(18,"Aashay");
HashMap<Integer,Student> smap=new HashMap<Integer,Student>();
smap.put(11,s1);  smap.put(12,s2);  smap.put(13,s3);  smap.put(14,s4);
smap.put(15,s5);   smap.put(16,s6);  smap.put(17,s7); smap.put(18,s8);

System.out.print("Enter the Roll No : ");
int n=new java.util.Scanner(System.in).nextInt();

if(smap.containsKey(n)){
		Student s=(Student)smap.get(n);
		s.show();
	}
else
	System.out.println("\nRoll No Not Found.....");



}
}
