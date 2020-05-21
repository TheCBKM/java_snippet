import java.io.*;

class FileDemo{
public static void main(String as[])throws Exception{
File f1=new File(as[0]);
if(f1.exists()){
	if(f1.isDirectory()){
		System.out.println("Its a Folder that contains : \n");
		String name[]=f1.list();
		for(String nm:name)
			System.out.println("\t"+nm);
	}
else{
	System.out.println("The name of the File is : "+f1.getName());
	System.out.println("The Path of the File is : "+f1.getPath());
	System.out.println("The Actual Path of the File is : "+f1.getAbsolutePath());
	System.out.println("The Length of the File is : "+f1.length()+" bytes.");
	long n=f1.lastModified();
	java.util.Date dt=new java.util.Date(n);
	System.out.println("The file was updated on : "+n);
	System.out.println("The file was updated on : "+dt.toString());
	}
	}
else{
	System.out.println("File Not Found......");
}
}
}