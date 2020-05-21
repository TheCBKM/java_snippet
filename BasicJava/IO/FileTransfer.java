import java.io.*;
class FileTransfer{
public static void main(String as[])throws Exception{
FileInputStream fin=new FileInputStream("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg");
FileOutputStream fout=new FileOutputStream("penguins.jpg");

int i;
while((i=fin.read())!=-1){
	System.out.println((char)i);
	fout.write(i);
}
System.out.println("Done....");
fout.close();
fin.close();
}
}