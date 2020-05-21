class ExcepDemo{
public static void main(String as[]){
int a=0,b=0,ans=0;
try{
a=Integer.parseInt(as[0]);
b=Integer.parseInt(as[1]);
ans=a/b;
}catch(ArrayIndexOutOfBoundsException e){
//System.out.println("U need to pass atleast 2 numbers.....");
//System.out.println(e.getMessage());
//e.printStackTrace();
System.out.println("Re-Enter 2 numbers : ");
a=new java.util.Scanner(System.in).nextInt();
b=new java.util.Scanner(System.in).nextInt();
ans=a/b;
}catch(ArithmeticException e){
System.out.println(e.getMessage());
}catch(Exception e){
System.out.println("Handled by Parent Class......");
}finally{
System.out.println("It must be execute...");
}
System.out.println("Answer is : "+ans);
System.out.println("All is well");
}
}