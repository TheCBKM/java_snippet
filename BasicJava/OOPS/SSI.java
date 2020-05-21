class SSI{
int a,b;
void set(int a,int b){
this.a=a;	this.b=b;
}
void show(){System.out.println("The values are : "+a+" and "+b);}
public static void main(String as[]){
SSI ssi=new SSI();
ssi.set(45,55);
ssi.show();
}
}