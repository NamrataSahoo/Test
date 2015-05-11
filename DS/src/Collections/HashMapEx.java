package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap <Integer,String>();
		hm.put(1, "Namrata");
		hm.put(2, "NamrataS");
		hm.put(3, "NamrataSahoo");
		hm.put(null,"null");
		hm.put(null,"null");
		//Getting Set of keys for Iteration
		Set<Entry<Integer,String>> map =  hm.entrySet();
		// Using Iterator to loop Map in Java, here Map implementation is Hashtable

		Iterator<Entry<Integer, String>> iterator= map.iterator();
		
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> map2= iterator.next();
			int key=map2.getKey();
			String value=map2.getValue();
			System.out.println("Key :"+key+"  value :"+value);
		}
		
		
				
		for(Map.Entry m:hm.entrySet())
		{
			
		System.out.println("key" +m.getKey() +  "Value"+ m.getValue());
		}
		
		//Hashtable<1, "Namrata"> hash= new Hashtable<>();
		
		
	
	}

}
