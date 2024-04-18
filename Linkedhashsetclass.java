package collection;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Linkedhashsetclass {
public static void main(String[] args) {
	LinkedHashSet l=new LinkedHashSet();
	l.add(153);
	l.add(15);
	l.add(15);
	l.add(10);
	//sCollections.sort((List<T>) l);
	System.out.println(l);
	l.add(null);
	System.out.println(l);
	l.add("nandini");
	System.out.println(l);
	
}
}
