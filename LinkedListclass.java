package collection;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListclass {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(12);
		l.add(15);
		l.add(1);
		l.add(12);
		Collections.sort(l);
		System.out.println(l);
		
		l.add("nandini");
		l.add(12.0);
		l.add('e');
		l.add(null);
		System.out.println(l);
		

	}

}
