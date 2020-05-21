import java.io.*;

class DeSerial{
public static void main(String as[])throws Exception{
FileInputStream fin=new FileInputStream("StdData.txt");
ObjectInputStream objin=new ObjectInputStream(fin);
Student st1=(Student)objin.readObject();
Student st2=(Student)objin.readObject();
Student st3=(Student)objin.readObject();
Student st4=(Student)objin.readObject();
Student st5=(Student)objin.readObject();
st1.show();
st2.show();
st3.show();
st4.show();
st5.show();
objin.close();
fin.close();
}
}