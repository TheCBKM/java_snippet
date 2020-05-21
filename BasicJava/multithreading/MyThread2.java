
class MyThread2 implements Runnable{
public void run(){
System.out.println("I m running......");
}
public static void main(String ss[]){
MyThread2 m2=new MyThread2();
Thread t1=new Thread(m2);
t1.start();
}
}