import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maptest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap();
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		map.put("2", "e");
		map.put("5", "d");
		System.out.println(map.size());
		
		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			System.out.println(entry.getKey()+","+entry.getValue());	
		}
		
		System.out.println("........................");
		
		set = map.keySet();
		iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			String value  = (String) map.get(key);
			System.out.println(key + "," + value);	
		}
		
		System.out.println("........................");
		
		Collection collection = map.values();
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			String value = (String) iterator.next();
			System.out.println(value);
		}

	}

}
