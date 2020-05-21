class Test<X,Y>{
X a;
Y b;
void set(X m,Y n){
a=m;	b=n;
}
void show(){
System.out.println("The values are : "+a+" and "+b);
}
public static void main(String as[]){
/*Test<Integer> t1=new Test<Integer>();
t1.set(25,55);
t1.show();
Test<String> t2=new Test<String>();
t2.set("Hello","Bye");
t2.show();*/
Test<String,Double> t3=new Test<String,Double>();
t3.set("SSI",2.0);
t3.show();
Test<Integer,Boolean> t4=new Test<Integer,Boolean>();
t4.set(444,true);
t4.show();
Test t5=new Test();
t5.set('C',"C++");
t5.show();
}
}