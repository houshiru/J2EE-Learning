import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Settest03 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(3);
		set.add(9);
		set.add(22);
		set.add(3);
		set.add(1);
		set.add(8);
		set.add(12);
		set.add(9);
		set.add(43);
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		

	}

}
