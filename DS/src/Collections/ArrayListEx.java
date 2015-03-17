package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		al.add("Sahoo");
		al.add("Namrata");
		
		Iterator iterator = al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(""+ iterator.next());
		}
		Collections.sort(al);
		iterator = al.iterator();
		//System.out.println();
		for(int i=0;i<al.size();i++)
		{
			System.out.println("i"+ al.get(i));
			
		}
	}

}
