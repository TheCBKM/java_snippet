class Conversion{
static boolean bl=true;
static char ch='A';
static byte bt=80;
static int i=260;
static double d=40.62;
public static void main(String as[]){
System.out.println("The value of  boolean is :  "+bl);
System.out.println("The value of  char is :  "+ch);
System.out.println("The value of  byte is :  "+bt);
System.out.println("The value of  int is :  "+i);
System.out.println("The value of  double is :  "+d);
System.out.println("----------------------------------------------------");

//d=i; //implicit conversion
//System.out.println("now,the value of  double is :  "+d);
//i=(int)d;  //explicit conversion.....
//System.out.println("The value of  int is :  "+i);
//i=ch;
//System.out.println("The value of  int is :  "+i);
//ch=(char)i;
//System.out.println("The value of  char is :  "+ch);

//bt=(byte)i;
//System.out.println("The value of  byte is :  "+bt);

i=(int)bl;





}
}