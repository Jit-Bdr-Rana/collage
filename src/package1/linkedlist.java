package package1;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist {
public static void main(String[] args)
{
	LinkedList<String> al=new LinkedList<String>();
	al.add("Ravi");
	al.add("jit");
	al.add(null);
	
	Iterator<String> itr=al.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
