package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
		
		for(Map.Entry m:hm.entrySet())
		{
			
		System.out.println("key" +m.getKey() +  "Value"+ m.getValue());
		}
		

	}

}
