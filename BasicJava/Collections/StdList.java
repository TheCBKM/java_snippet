import java.util.ArrayList;
class StdList{
public static void main(String as[]){
Student s1=new Student(11,"Prakhar");
Student s2=new Student(12,"Akshat");
Student s3=new Student(13,"Pawas");
Student s4=new Student(14,"Priya");
Student s5=new Student(15,"Shivani");
Student s6=new Student(16,"Soumya");
Student s7=new Student(17,"Mohit");
Student s8=new Student(18,"Aashay");
ArrayList<Student> slist=new ArrayList<Student>();
slist.add(s1);  slist.add(s2);  slist.add(s3);  slist.add(s4);
slist.add(s5);  slist.add(s6);  slist.add(s7);  slist.add(s8);
//slist.add(new Test());
//System.out.println("The Student list  is : "+slist);
System.out.print("Enter your Roll No : ");
int n=new java.util.Scanner(System.in).nextInt();

/*Object obj[]=slist.toArray();
for(Object ob:obj){
	Student s=(Student)ob;	
	if(s.roll==n){
		s.show();
		break;
		}
	
}*/

/*java.util.Iterator it=slist.iterator();
while(it.hasNext()){
	Student s=(Student)it.next();
	if(s.roll==n){
		s.show();
		break;
		}
	

}*/

for(int i=0;i<slist.size();i++){

	Student s=(Student)slist.get(i);
		if(s.roll==n){
		s.show();
		break;
		}

}

}
}
