class A{
void welcome(){System.out.println("Welcome......");}
}

class B{
void hello(){System.out.println("Hello,How r u");}
public static void main(String as[]){
B ob1=new B();
ob1.hello();
}
}

class C{
void bye(){System.out.println("Bye bye ........");}
public static void main(String as[]){
B ob1=new B();
ob1.hello();
C ob2=new C();
ob2.bye();
}
}