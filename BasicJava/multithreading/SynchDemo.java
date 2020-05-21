class Table{
synchronized static void prints(int n){
for(int i=1;i<=10;i++){
	System.out.println("\t"+n*i);
	try{Thread.sleep(100);}catch(Exception e){}
}
}
}

class Thread1 extends Thread{
public void run(){
Table.prints(5);
}
}

class Thread2 extends Thread{
public void run(){
Table.prints(11);
}
}

class SynchDemo{
public static void main(String as[]){
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
t1.start();
t2.start();
}
}