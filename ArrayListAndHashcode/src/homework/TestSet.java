package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<Person> persons =  new HashSet<Person>();
		persons.add(new Person(1, "aa", "male"));
		persons.add(new Person(2, "bb", "fmale"));
		persons.add(new Person(5, "cc", "fmale"));
		persons.add(new Person(1, "aa", "male"));
		persons.add(new Person(3, "ee", "fmale"));
		persons.add(new Person(2, "ff", "male"));
		
		Iterator iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person);			
		}
		
		System.out.println("-----------------------");
		
		Person p1 = new Person(5, "cc", "male");
		persons.remove(p1);
		iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person);	
		}
		
		System.out.println("-----------------------");
		
		iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			if (person.getId() == 3) {
				iterator.remove();
				break;
			}
		}
		iterator = persons.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person);	
		}

	}

}