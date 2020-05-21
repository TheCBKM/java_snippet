class VaragsDemo{
void sum(String name,int...v){
int s=0;
for(int i:v)
	s=s+i;	
System.out.println("Hello : "+name+",the sum is : "+s);
}

public static void main(String as[]){
VaragsDemo vd=new VaragsDemo();
vd.sum("ABC");
vd.sum("ABC",222);
vd.sum("ABC",1,22,33,44,55,66,7777,9999);
vd.sum("ABC",123,234,345,5666);
}
}