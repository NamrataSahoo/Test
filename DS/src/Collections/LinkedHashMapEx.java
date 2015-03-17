package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> lhm= new LinkedHashMap<>();
	lhm.put(1, "N");
	lhm.put(2, "A");
	lhm.put(3, "S");
	for(Map.Entry m:lhm.entrySet())
	{
		System.out.println("value" + m.getValue());
	}
}
}
