class VarScope{
static int m=5000;
void welcome(){
System.out.println("Welcome to my code...");
System.out.println("The value of m : "+m);
}

void sum(int p,int q){
System.out.println("The value of m : "+m);
System.out.println("The sum is : "+(p+q));
}

static int sqr(int n){
System.out.println("The value of m : "+m);
return n*n;
}

public static void main(String as[]){
int a,b;
a=100;
b=300;
VarScope v1=new VarScope();
v1.welcome();
v1.sum(a,b);
int s=sqr(45);
System.out.println("The sqr is : "+s);
//System.out.println("The value of p : "+p);
System.out.println("The value of m : "+m);
}
}