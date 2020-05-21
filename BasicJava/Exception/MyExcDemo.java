class MyExcDemo{
public static void main(String as[]){
int sal=0,comm=0,total=0;
sal=Integer.parseInt(as[0]);
try{
comm=Integer.parseInt(as[1]);
if(comm>(sal*40/100)){
	throw new ExceedCommException();
}
total=sal+comm;
}catch(ExceedCommException e){
//System.out.println("Invalid Comm.....");
System.out.println(e.getMessage());
total=sal;
}
System.out.println("The gross income is : "+total);
System.out.println("All is Well");
}
}