import java.util.StringTokenizer;
class StrTokens{
public static void main(String as[]){
String s="A,quick;brown fox,jumps over the,lazy;dog";
//StringTokenizer st=new StringTokenizer(s);
//StringTokenizer st=new StringTokenizer(s,",;");
StringTokenizer st=new StringTokenizer(s,",;",true);
//int n=st.countTokens();
//for(int i=1;i<=n;i++)
while(st.hasMoreTokens())
	System.out.println(st.nextToken());
}
}

/*
s=";MP .UP @Mumbai [Pune 'Gandhinagar @Chennai ;pubjab @Kolkata ?Uttarakhand @Delhi =Bihar"

*/






