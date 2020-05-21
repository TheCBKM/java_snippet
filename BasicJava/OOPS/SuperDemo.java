class A{
static int m=100;
}

class SuperDemo extends A{
static int m=500;
void show(){
int m=1000;
System.out.println("The value of local m is : "+m);
System.out.println("The value of class 's m is : "+this.m);
System.out.println("The value of parent's m is : "+super.m);
}

public static void main(String as[]){
SuperDemo sf=new SuperDemo();
sf.show();
}
}