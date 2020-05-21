import java.util.HashSet;
import java.util.Iterator;

class SetDemo{
public static void main(String as[]){
HashSet set=new HashSet();
set.add(1234);
set.add(16.59f);
set.add("Java");
set.add(1234.98);
set.add('F');
set.add("Java");
set.add(true);
set.add("Hello");
set.add("Java");
set.add(4566.44);
System.out.println("The set is : "+set);
//System.out.println("The lenght of set is : "+set.size());
//set.clear();
//System.out.println("Is set is blank? :  "+set.isEmpty());
//set.remove('F');
//System.out.println("The set is : "+set);
//System.out.println("Is set contains Java : "+set.contains("Java"));
HashSet set2=new HashSet();
set2.add("One");	set2.add("Two");	set2.add("Three");	set2.add("Four");	set2.add("Five");	set2.add("Six");
//set.add(set2);
set.addAll(set2);
System.out.println("The set is : "+set);
//System.out.println("The lenght of set is : "+set.size());
//set.removeAll(set2);
//set.retainAll(set2);
//System.out.println("The set is : "+set);
/*Object obj[]=set.toArray();
for(int i=0;i<obj.length;i++)
	System.out.println("The element is : "+obj[i]);
*/

Iterator it=set.iterator();
while(it.hasNext())
	System.out.println("The element is : "+it.next());








}
}