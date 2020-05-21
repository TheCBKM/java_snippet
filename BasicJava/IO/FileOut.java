import java.io.*;
class FileOut{
public static void main(String as[]) throws Exception{
//create the data
String s="Hello,How r u";
//String s="bye bye";
//convert data into bytes....
byte bt[]=s.getBytes();
//create the outputStream
FileOutputStream fout=new FileOutputStream("hello.txt",true);
//write data to the stream
fout.write(bt);
fout.close();
System.out.println("File Created.....");
}
}