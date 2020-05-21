class StrCmp{
public static void main(String as[]){
String s1="SSi";
String s2="SSi";
String s3="SSI";
String s4="Indore";
String s5=new String("SSi");
String s6=new String("SSi");

//referencewise checking......
//if(s1==s2)
//if(s1==s3)
//if(s1==s5)
if(s6==s5)
	System.out.println("Both r same.....");
else
	System.out.println("Both r different.....");


//content wise checking....
//if(s1.equals(s2))
//if(s1.equalsIgnoreCase(s3))
//if(s1.equalsIgnoreCase(s4))
//if(s1.equalsIgnoreCase(s5))
/*if(s6.equalsIgnoreCase(s5))
	System.out.println("Both r same.....");
else
	System.out.println("Both r different.....");
*/








}
}