class TLC extends Thread{
public void run(){
String name=getName();
System.out.println("welcome : "+name);
System.out.println("how r u : "+name);
if(name.equals("Kanika")){
try{Thread.sleep(2000);}catch(InterruptedException e){}
}
System.out.println("bye bye : "+name);
}
public static void main(String as[]) throws Exception{
TLC t1=new TLC();
TLC t2=new TLC();
TLC t3=new TLC();
TLC t4=new TLC();

t1.setName("Arpit");
t2.setName("Kapil");
t3.setName("Kanika");
t4.setName("Shivani");

/*t4.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t3.setPriority(Thread.NORM_PRIORITY);*/

t4.setPriority(10);
t1.setPriority(6);
t2.setPriority(8);
t3.setPriority(4);

t3.setDaemon(true);

System.out.println("********Welcome to TLC*********");
t1.start();
t2.start();
t3.start();
t4.start();
t3.join();
System.out.println("********End of TLC*********");
}
}