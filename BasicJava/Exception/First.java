class First{
void show() throws InterruptedException{
System.out.println("Welcome ........");
//try{Thread.sleep(3000);}catch(InterruptedException e){}
Thread.sleep(3000);
System.out.println("bye bye ........");
}
public static void main(String as[]){
First f1=new First();
try{f1.show();}catch(InterruptedException e){}
}
}