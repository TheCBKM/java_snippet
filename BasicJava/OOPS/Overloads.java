class Overloads{
//void sum(int a,int b){System.out.println("Sum of 2 int : "+(a+b));}
void sum(int a,double b){System.out.println("Sum of 2 int/dbl : "+(a+b));}
void sum(double a,int b){System.out.println("Sum of 2 dbl/int : "+(a+b));}
void sum(double a,double b){System.out.println("Sum of 2 dbl : "+(a+b));}
void sum(int a,int b,int c){System.out.println("Sum of 3 int : "+(a+b+c));}
void sum(int a,int b,int c,int d){System.out.println("Sum of 4int : "+(a+b+c+d));}
public static void main(String as[]){
Overloads od=new Overloads();
od.sum(222,333);
od.sum(222,333,99,88);
od.sum(222,333,77);
od.sum(45.55,98.66);
}
}