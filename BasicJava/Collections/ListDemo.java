import java.util.ArrayList;
import java.util.Iterator;

class ListDemo{
public static void main(String as[]){
ArrayList list=new ArrayList();
list.add(1234);
list.add(16.59f);
list.add("Java");
list.add(1234.98);
list.add('F');
list.add("Java");
list.add(true);
list.add("Hello");
list.add("Java");
list.add(4566.44);
System.out.println("The list is : "+list);
//System.out.println("The lenght of list is : "+list.size());
//list.clear();
//System.out.println("Is list is blank? :  "+list.isEmpty());
//list.remove('F');
//System.out.println("The list is : "+list);
//System.out.println("Is list contains Java : "+list.contains("Java"));
ArrayList list2=new ArrayList();
list2.add("One");	list2.add("Two");	list2.add("Three");	list2.add("Four");	list2.add("Five");	list2.add("Six");
//list.add(list2);
//list.addAll(list2);
//System.out.println("The list is : "+list);
//System.out.println("The lenght of list is : "+list.size());
//list.removeAll(list2);
//list.retainAll(list2);
//System.out.println("The list is : "+list);
/*Object obj[]=list.toArray();
for(int i=0;i<obj.length;i++)
	System.out.println("The element is : "+obj[i]);
*/

/*Iterator it=list.iterator();
while(it.hasNext())
	System.out.println("The element is : "+it.next());
*/
//System.out.println("The 5th element is : "+list.get(4));
//list.set(4,'C');
//list.add(4,'C');
//System.out.println("Now,List is  : "+list);
//System.out.println("The 1st java is at  : "+list.indexOf("Java"));
//System.out.println("The last java is at  : "+list.lastIndexOf("Java"));

for(int i=0;i<list.size();i++)
	System.out.println("The element : "+i+" Is : "+list.get(i));













}
}