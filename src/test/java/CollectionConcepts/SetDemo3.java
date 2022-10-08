package CollectionConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
	//1.duplicates not allowed(ID,unique number of elements)
	//2Insertion order is not preserved
	//Underlying datastructure is hashtable
		
		Set s=new LinkedHashSet();//default initial capacity is 16 and fill ratio or load factor is 0.75
		
		s.add("pankaj");
		s.add("pankaj");
		s.add("pankaj");
		s.add("pankaj");//duplicates cannot be added inside SET
		System.out.println(s);
		
		
		HashSet h=new LinkedHashSet(100);
		h.add('a');
		h.add('b');
		h.add('a');
		System.out.println(h);
		
		HashSet h1=new HashSet(100,12.5f);
		h1.add('a');
		h1.add('b');
		h1.add('a');
		System.out.println(h1);
		
		HashSet h2=new LinkedHashSet();
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
		
		

	}

}
