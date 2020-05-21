class ObjAry{
public static void main(String as[]){

java.util.Scanner sc=new java.util.Scanner(System.in);
Student s[]=new Student[5];
System.out.println("Enter the roll and name of 5 students : ");
for(int i=0;i<5;i++)
	{
	s[i]=new Student();
	s[i].set(sc.nextInt(),sc.next());
	}
for(int j=0;j<5;j++)
	s[j].show();
}
}