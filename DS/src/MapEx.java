import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapEx {
	
	public static void main(String[] args) {
		Map map=  new HashMap();
		map.put("1", "Namrata");
		map.put("2", "Shkm xkalue");
		
		String element1= (String) map.get("1");
		//System.out.println("element1" + element1);
		
		Iterator iterator= map.keySet().iterator();
//		while(iterator.hasNext())
//		{
//			String key= (String) iterator.next();
//			String value= (String) map.get(key);
//			//System.out.println(iterator.next());
//			System.out.println("key" + key);
//			System.out.println("value" + value);
//		}
		while(iterator.hasNext())
		{
			Object key= iterator.next();
			Object value= map.get(key);
		}
		for(Object key: map.keySet())
		{
			System.out.println(map.get(key));
		}
	}

}
