class C1{
void show(){System.out.println("Show from class C1");}
}

class C2 extends C1{
void show(){System.out.println("Show from class C2");}
}

class C3 extends C2{
void show(){System.out.println("Show from class C3");}
}

class Binding{
public static void main(String as[]){
C1 ob;   //early/static/compile time binding.......
//ob=new C1();  //late/dynamic/runtime binding.....
//ob=new C2();
ob=new C3();
ob.show(); //runtime polymorphism

C2 ob2;
//ob2=new C2();
//ob2=new C3();
ob2=new C1();

}
}







