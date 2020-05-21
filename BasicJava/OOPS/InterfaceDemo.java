interface Sum{
int m=500;
void add();
void show();
}

interface Product{
void multiply();
void show();
}

class InterfaceDemo implements Sum,Product{
int a,b;
void set(int p,int q){a=p;	b=q;}
public void add(){System.out.println("The sum is : "+(a+b));}
public void multiply(){System.out.println("The product is : "+(a*b));}
public void show(){System.out.println("The values are : "+a+" and "+b);}
public static void main(String as[]){
InterfaceDemo id=new InterfaceDemo();
id.set(45,55);
id.show();
id.add();
id.multiply();

//System.out.println("The var is : "+m);
}
}