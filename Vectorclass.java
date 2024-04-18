package collection;

import java.util.Collections;
import java.util.Vector;

public class Vectorclass {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(100);
	v.add(10);
	v.add(12);
	v.add(10);
	Collections.sort(v);
	System.out.println(v);
	
	v.add("ashwatha");
	v.add(1.2);
	v.add('e');
	v.add("aswatha");
	v.add(null);
	System.out.println(v);
	
	
}
}
