class GCDemo{
GCDemo(int n){
System.out.println("U have created Object No : "+n);
}
public void finalize(){
System.out.println("Ur Object is Killed......!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
}
public static void main(String as[])throws InterruptedException{
int p=1;
	while(true){
		new GCDemo(p);
		Thread.sleep(50);
		if(p%100==0)
			System.gc();
		p++;
	}
}
}