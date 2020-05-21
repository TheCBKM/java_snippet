import java.io.*;

class FileInput{
public static void main(String sa[])throws Exception{
FileInputStream fin=new FileInputStream("hello.txt");
/*int i;
i=fin.read();
while(i!=-1){
System.out.print((char)i);
i=fin.read();
}*/
/*int i;
while((i=fin.read())!=-1)
	System.out.print((char)i);*/
int n=fin.available();
for(int i=0;i<=n;i++)
	System.out.print((char)fin.read());

fin.close();
}
}