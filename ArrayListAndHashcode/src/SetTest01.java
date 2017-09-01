import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		Set hashSet = new HashSet();
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		hashSet.add("d");
		hashSet.add("a");
		HashSet subhashSet = new HashSet();
		subhashSet.addAll(hashSet);
		hashSet.addAll(subhashSet);
		
		//subhashSet = (HashSet) hashSet.clone();
		hashSet.remove("b");
		
		System.out.println(hashSet.hashCode());
		System.out.println(subhashSet.hashCode());
		System.out.println(hashSet);
		System.out.println(subhashSet);
		System.out.println(hashSet.size());
		System.out.println(subhashSet.size());
		//System.out.println(hashSet.spliterator());
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		
		
		
	}

}
