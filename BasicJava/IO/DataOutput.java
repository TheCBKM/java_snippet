import java.io.*;

class DataOutput{
public static void main(String po[])throws Exception{
int empno=1122;
double sal=65000,comm=5395.22;
boolean onroll=true;

FileOutputStream fout=new FileOutputStream("data.txt");
DataOutputStream dout=new DataOutputStream(fout);
dout.writeInt(empno);
dout.writeDouble(sal);
dout.writeDouble(comm);
dout.writeBoolean(onroll);
dout.close();
fout.close();
System.out.println("done....");
}
}