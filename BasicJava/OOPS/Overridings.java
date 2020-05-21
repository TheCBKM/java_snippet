class RBI{
public void intDeposit(){
System.out.println("Int calculation as Per RBI Norms....");
}
final void intSaving(){
System.out.println("Int calculation per. on Saving a/c must be 4%");
}
}

class SBI extends RBI{}
class SBM extends SBI{}

class AXIS extends RBI{
public void intDeposit(){
System.out.println("Int calculation as Per AXIS Norms....");
}
/*void intSaving(){
System.out.println("Int calculation per. on Saving a/c must be 2%");
}*/
}

class UTI extends AXIS{}

class Overridings{
public static void main(String as[]){
//SBI sbi=new SBI();
//AXIS axis=new AXIS();
SBM sbm=new SBM();
UTI uti=new UTI();
sbm.intDeposit();
uti.intDeposit();




}
}