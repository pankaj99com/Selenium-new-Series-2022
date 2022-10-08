package JavaPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_FindDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr= {12,3,45,23,45,23,2,1,15,6,15};
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!set.add(arr[i])) {
				System.out.println("Duplicate element in an array is:"+arr[i]);
			}
			System.out.println(set);
		}

	}

}
