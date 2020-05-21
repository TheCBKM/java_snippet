abstract class RBI{
abstract void recovery();
void welcome(){System.out.println("Welcome to Banking......");}
}

abstract class SBI extends RBI{
//void recovery(){System.out.println("Recovery method of SBI invoked...");}
}

class SBM extends SBI{
void recovery(){System.out.println("Recovery method of SBM invoked...");}
}


class HDFC extends RBI{
void recovery(){System.out.println("Recovery method of HDFC invoked...");}
}

class AbsDemo{
public static void main(String as[]){
RBI rbi;
//rbi=new RBI();
SBI sbi=new SBM();
HDFC hdfc=new HDFC();
sbi.welcome();
sbi.recovery();
hdfc.recovery();
}
}