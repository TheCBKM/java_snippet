class T{
final int x=0;

void modif(int x1){this.x=x1;}
void show(){
System.out.println(this.x);
}
public static void main(String as[]){
modif(2);
show();
}
}
