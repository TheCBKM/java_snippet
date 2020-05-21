class CMD{
public static void main(String as[]){
//String s1=as[0];
//String s2=as[1];
//System.out.println(s1+" and "+s2+" r good frnds......");

String name=as[0];
int age=Integer.parseInt(as[1]);
double hgt=Double.parseDouble(as[2]);
boolean veg=Boolean.parseBoolean(as[3]);
System.out.println("Hello : "+name);
System.out.println("U r "+age+" yrs old.");
System.out.println("U r height is : "+hgt+" feets");
System.out.println("U r vegiterian : "+veg);
}
}