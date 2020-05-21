package pck1;

public class AccessDemo{
public int pbc=1000;
protected int pro=2000;
int def=3000;
private int pvt=5000;
public static void main(String as[]){
AccessDemo ad=new AccessDemo();
System.out.println("The public var is : "+ad.pbc);
System.out.println("The protected var is : "+ad.pro);
System.out.println("The default(Package) var is : "+ad.def);
System.out.println("The private var is : "+ad.pvt);
}
}