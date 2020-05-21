import java.io.*;
class BufferedOut{
public static void main(String as[]) throws Exception{
String s="Hello,How r u";
byte bt[]=s.getBytes();
FileOutputStream fout=new FileOutputStream("my.txt",true);
BufferedOutputStream bout=new BufferedOutputStream(fout);

bout.write(bt);
bout.flush();
fout.close();
bout.close();
System.out.println("File Created.....");
}
}