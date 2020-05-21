
class MyThread1 extends Thread{
public void run(){
System.out.println("I m running......");
}
public static void main(String ss[]){
MyThread1 m1=new MyThread1();
m1.start();
}
}