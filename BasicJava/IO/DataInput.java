import java.io.*;

class DataInput{
public static void main(String as[])throws Exception{
FileInputStream fin=new FileInputStream("data.txt");
DataInputStream din=new DataInputStream(fin);

int eno=din.readInt();
double s=din.readDouble();
double c=din.readDouble();
boolean onroll=din.readBoolean();

System.out.println("The empno is : "+eno);
System.out.println("The Salary is  : "+s);
System.out.println("The Comm is : "+c);
System.out.println("The Status is  : "+onroll);
din.close();
fin.close();
}
}