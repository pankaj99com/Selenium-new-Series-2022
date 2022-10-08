package Duplicates;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesUingSet {

	public static void main(String[] args) {
		int[] a = { 36, 22, 4, 87, 9, 32, 6 ,9,3,33,22};
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println(set);
		Integer[] i=set.toArray(new Integer[set.size()]);
		for(int j=0;j<i.length;j++) {
			System.out.print(i[j]+" ");
		}

	}

}
