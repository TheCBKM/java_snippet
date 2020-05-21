package pck2;
import pck1.*;

class AccNonChild{
public static void main(String as[]){
AccessDemo ad=new AccessDemo();
System.out.println("The public var is : "+ad.pbc);
//System.out.println("The protected var is : "+ad.pro);
//System.out.println("The default(Package) var is : "+ad.def);
//System.out.println("The private var is : "+ad.pvt);
}
}