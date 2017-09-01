import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest02 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Student(1, 18, "aa"));
		set.add(new Student(2, 17, "bb"));
		set.add(new Student(1, 18, "cc"));
		set.add(new Student(3, 19, "aa"));
		
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.getName());
			
		}
		

	}

}
