package collection;

import java.util.Collections;
import java.util.HashSet;

public class HashSetclass {
public static void main(String[] args) {
	HashSet h=new HashSet();
	h.add(123);
	h.add(10);
	h.add(10);
	//Collections.sort(h);
	//System.out.println(h);
	h.add("nandni");
	h.add(null);
	System.out.println(h);
	
}
}
