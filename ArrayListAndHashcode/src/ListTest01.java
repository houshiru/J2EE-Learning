import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.w3c.dom.stylesheets.StyleSheetList;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList linkedList = new LinkedList();
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(1, "hello");
		
		List sublist = new ArrayList();
		sublist.add("e");
		sublist.add("f");
		
		list.addAll(sublist);
		
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());	
		}
		
		list.remove("a");
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}

}
