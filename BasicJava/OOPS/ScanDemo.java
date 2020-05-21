import java.util.Scanner;
//import java.util.*;

class ScanDemo{
public static void main(String as[]){
//java.util.Scanner sc=new java.util.Scanner(System.in);
Scanner sc=new Scanner(System.in);
System.out.print("Enter your name : ");
String name=sc.next();
System.out.print("Enter your age : ");
int age=sc.nextInt();
System.out.print("Enter your Height : ");
double ht=sc.nextDouble();
System.out.print("R u veg.. : ");
boolean veg=sc.nextBoolean();
System.out.println("\nHello : "+name);
System.out.println("Age : "+age);
System.out.println("Height : "+ht);
System.out.println("Veg... : "+veg);
}
}