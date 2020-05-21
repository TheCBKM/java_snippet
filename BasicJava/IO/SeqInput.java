import java.io.*;

class SeqInput{
public static void main(String po[])throws Exception{
FileInputStream fin1=new FileInputStream("FileOut.java");
FileInputStream fin2=new FileInputStream("FileInput.java");
FileOutputStream fout=new FileOutputStream("Codes.doc");
SequenceInputStream sin=new SequenceInputStream(fin2,fin1);
int i;
while((i=sin.read())!=-1)
	fout.write(i);		
fin1.close();
fin2.close();
sin.close();
fout.close();
System.out.println("done....");
}
}