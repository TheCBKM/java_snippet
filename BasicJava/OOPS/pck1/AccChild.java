package pck1;
class AccChild extends AccessDemo{
public static void main(String as[]){
AccChild ad=new AccChild();
System.out.println("The public var is : "+ad.pbc);
System.out.println("The protected var is : "+ad.pro);
System.out.println("The default(Package) var is : "+ad.def);
//System.out.println("The private var is : "+ad.pvt);
}
}