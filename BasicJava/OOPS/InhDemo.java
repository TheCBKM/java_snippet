class Base{
void showBase(){System.out.println("Show Base Class....");}
}

class Child1 extends Base{
void showChild1(){System.out.println("Show Child1 Class....");}
}

class Child2 extends Base{
void showChild2(){System.out.println("Show Child2 Class....");}
}

class GrandChild extends Child1{
void showGrandChild(){System.out.println("Show Grand Child Class....");}
}


class InhDemo{
public static void main(String as[]){
//Base b1=new Base();
//Child1 c1=new Child1();
GrandChild gc=new GrandChild();
gc.showBase();
gc.showChild1();
gc.showGrandChild();
//gc.showChild2();

Child2 c2=new Child2();
c2.showBase();
c2.showChild2();



}
}