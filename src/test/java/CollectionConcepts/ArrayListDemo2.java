package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<Object> arr = new LinkedList<Object>();// dynamic polymorphism
		
		// 1.Duplicates allowed
		// 2.Insertion order is maintained
		arr.add(45);
		arr.add(35);
		arr.add(45);
		arr.add(12);
		arr.add(3);
		arr.add("Pankaj");

		System.out.println(arr.get(3));
		arr.add(1, 350);// overloaded method
		arr.remove(2);

		System.out.println(arr);

		System.out.println(arr.get(3));
		ArrayList<Object> arr1 = new ArrayList<Object>();
		arr1.add("Sandy");
		arr1.add('@');
		arr1.add(3456);
		arr1.addAll(arr);
		arr1.add(null);
		arr1.add(null);
		System.out.println(arr1);
		System.out.println(arr1.contains("Sandy"));
		System.out.println(arr1.contains(45));
		System.out.println(arr1.contains('@'));
		// arr1.clear();
		System.out.println(arr1);
		System.out.println(arr1.size());
		for (int i = 0; i < arr1.size(); i++) {
			
			
			System.out.print(arr1.get(i)+" , ");

		}
		System.out.println();
		System.out.println("*************************");
		//deafult size is 10
		//cc+cc/2+1  10+10/2+1=16 ,16+16/2+1=25,25+25/2+121
		ArrayList<Object> arr2 = new ArrayList<Object>(100);
		arr2.ensureCapacity(15);
		//5+5/2+1=8
		
		for(Object e:arr1) {
			System.out.print(e+" ");
		}

		
		System.out.println();
		System.out.println("***********************");
		
		Iterator<Object> it=arr1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
	}

}
