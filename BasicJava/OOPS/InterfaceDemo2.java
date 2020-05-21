interface Sum{
void add();
}

interface Product extends Sum{
void multiply();
}

class InterfaceDemo2 implements Product{
int a,b;
void set(int p,int q){a=p;	b=q;}
public void add(){System.out.println("The sum is : "+(a+b));}
public void multiply(){System.out.println("The product is : "+(a*b));}
public static void main(String as[]){
InterfaceDemo id=new InterfaceDemo();
id.set(45,55);
id.add();
id.multiply();
}
}