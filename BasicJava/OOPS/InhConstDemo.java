class X{
//X(){System.out.println("X is invoked.....");}
X(String name){System.out.println("Hello : "+name);}
}

class Y extends X{
//Y(){System.out.println("Y is invoked.....");}
Y(int n){
super("SSi");
System.out.println("The value is : "+n);}
}

class Z extends Y{
Z(){
super(25);
System.out.println("Z is invoked.....");}
}

class InhConstDemo{
public static void main(String as[]){
Z ob=new Z();

}
}