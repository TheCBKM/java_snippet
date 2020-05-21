class ArrayLoops{
public static void main(String ss[]){
//int a[]=new int[10];
//a[0]=55;
//a[1]=54;
//int[] a=new int[10];
//int []a=new int[10];
//int a[][]=new int[10][3];
//int[][] a=new int[10][3];
//int [][]a=new int[10][3];
//int []a[]=new int[10][3];
int a[]={11,22,33,44,55,66,77,88,99,100,555,2222,66676,888,333,88,8888,8888,8888};
//int i=0;
/*do{
System.out.println(a[i]);
i++;
}while(i<10);

while(i<a.length){
System.out.println("\t"+a[i]);
i++;
}*/
/*
int i=0;
for(;i<a.length;i++)
{
	if(a[i]%100==0)
		//System.exit(0);	
		continue;
		//break;
	System.out.println(a[i]);

}*/

for(int p:a)
	System.out.println(p);

System.out.println("bye bye.....");
}
}