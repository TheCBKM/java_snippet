import java.io.*;

class Serial{
public static void main(String as[])throws Exception{
Student s1=new Student(1111,"Akhil",54000.25,true);
Student s2=new Student(1112,"Kshitij",45000.25,true);
Student s3=new Student(1113,"Sejal",54000.25,true);
Student s4=new Student(1114,"Kanika",54000.25,true);
Student s5=new Student(1115,"Kapil",54000.25,true);

FileOutputStream fout=new FileOutputStream("StdData.txt");
ObjectOutputStream objout=new ObjectOutputStream(fout);

objout.writeObject(s1);
objout.writeObject(s2);
objout.writeObject(s3);
objout.writeObject(s4);
objout.writeObject(s5);

objout.close();
fout.close();
System.out.println("Done.....");

}
}