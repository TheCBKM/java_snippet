import java.util.Stack;

class StackDemo{
public static void main(String as[]){
Stack st=new Stack();
//st.push(1234); auto boxing
Integer I10=new Integer(1234);  //manual boxing....
st.push(I10);
st.push('C');
st.push("Hello");
st.push(12.38f);
st.push(45.66);
st.push(false);
//st.push(new Student());
System.out.println("The stack is : "+st);
boolean ob1=(Boolean)st.pop();  
System.out.println(ob1+" is out....");
System.out.println("Now,the stack is : "+st);
//double ob2=(Double)st.pop();  //auto unboxing.....
Double DD=(Double)st.pop();  //manual unboxing.....
double ob2=DD.doubleValue();
System.out.println(ob2+" is out....");
System.out.println("Now,the stack is : "+st);
}
}