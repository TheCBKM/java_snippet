class UpdStrDemo{
public static void main(String s[]){
//StringBuffer s1=new StringBuffer("Hello");
StringBuilder s1=new StringBuilder("Hello");
System.out.println("The String is : "+s1);
//System.out.println("The length of String is : "+s1.length());
//System.out.println("The capacity of String is : "+s1.capacity());
s1.append(" Students");
System.out.println("The String is : "+s1);
s1.insert(5," Java");
System.out.println("The String is : "+s1);
s1.replace(5,10," SSi");
System.out.println("The String is : "+s1);
s1.delete(5,9);
System.out.println("The String is : "+s1);
s1.reverse();
System.out.println("The String is : "+s1);
}
}