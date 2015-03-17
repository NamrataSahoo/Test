package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class SampleLinkedList {
public static void main(String[] args) {
	LinkedList linkedList= new LinkedList();
	
	linkedList.add("Namrata");
	linkedList.add("NamrataS");
	
	ListIterator iterator2= linkedList.listIterator();
	while(iterator2.hasNext())
	{
		System.out.println("fwd" + iterator2.next());
	}
	while(iterator2.hasPrevious())
	{
		System.out.println("bkwd value" + iterator2.previous());
	}
	
}
}
