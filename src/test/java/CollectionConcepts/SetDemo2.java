package CollectionConcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo2 {

	public static void main(String[] args) {
		// 1.duplicates not allowed(ID,unique number of elements)
		// 2Insertion order is not preserved
		// Underlying datastructure is hashtable

		Set s = new TreeSet();// default initial capacity is 16 and fill ratio
								// or load factor is 0.75

		s.add(1000);

		System.out.println(s);

		TreeSet h2 = new TreeSet();
		h2.add(41);
		h2.add(24);
		h2.add(33);
		h2.add(4);
		h2.add(5);
		h2.add(634);
		h2.add(7);
		h2.add(8);
		h2.add(93);
		h2.add(10);
		h2.add(11);
		h2.add(12);
		h2.add(13);
		h2.add(14);
		System.out.println(h2);

		ArrayList a = new ArrayList();
		a.add(100);
		a.add(101);
		a.add(102);
		a.add(103);

		TreeSet h3 = new TreeSet(a);
		h3.add(50);
		System.out.println(h3);
		
		
		
		

	}

}
