class StrDemo{
public static void main(String as[]){
String s1="Hello How r u,How do u do";
//String s1=new String("Hello How r u");
//char name[]={'J','a','g','d','e','v'};
//String s1=new String(name,3,3);
//byte bt[]={97,98,99,100,120};
//String s1=new String(bt);
//String s1="Jagdev";
System.out.println("The string is : "+s1);
//System.out.println("The string is : "+s1.trim());
/*byte b[]=s1.getBytes();
for(byte bt:b)
	System.out.print(bt+" ");*/
//System.out.println("The length of string is : "+s1.length());
//System.out.println("Is  string is blank? "+s1.isEmpty());
//System.out.println("The string is in uppercase: "+s1.toUpperCase());
//System.out.println("The string is in lowercase: "+s1.toLowerCase());
//System.out.println("The 5th char of the string is : "+s1.charAt(4));
//System.out.println("The ASCII of 5th char of the string is : "+s1.codePointAt(4));
//System.out.println("Is Str is start with Hello : "+s1.startsWith("Hello"));
//System.out.println("Is Str is ends with Hello : "+s1.endsWith("Hello"));
//System.out.println("1st How is @ : "+s1.indexOf("How"));
//System.out.println("last How is @ : "+s1.lastIndexOf("How"));

//System.out.println("Replace How with Who : "+s1.replace("How","Who"));
//System.out.println("Replace How with Who : "+s1.replaceFirst("How","Who"));
//System.out.println("Substring is : "+s1.substring(6));
//System.out.println("Substring is : "+s1.substring(6,20));

String s[]=s1.split("How");
for(String p:s)
	System.out.println(p);




}
}