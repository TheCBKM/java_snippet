import java.io.*;
class FileWrt{
public static void main(String as[]) throws Exception{
//create the data
String s="Hello,How r u";
//create the outputStream
FileWriter fout=new FileWriter("hello2.txt");
//write data to the stream
fout.write(s);
fout.close();
System.out.println("File Created.....");
}
}