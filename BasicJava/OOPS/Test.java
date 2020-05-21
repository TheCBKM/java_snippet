class Test{
Test(){
System.out.println("Welcome to Test......");
}

Test(int n){
this();
System.out.println("The sqr is : "+n*n);
}

Test(int m,int n){
this(m);
//this();
System.out.println("The sum is : "+(m+n));
}

void hello(){
this();
System.out.println("Hello!!!!!!!!!!!!!!!!");
}


public static void main(String as[]){
//Test t1=new Test();
//Test t2=new Test(32);
Test t3=new Test(45,9887);
t3.hello();
}
}