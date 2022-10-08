package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP_FindDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr= {12,3,45,23,45,23,2,1,15,6,15,15};
		int count=1;
		Map<Integer,Integer> map =new HashMap<Integer,Integer>();
		
		for(Integer x:arr) {
			if(!map.containsKey(x)) {
				map.put(x,count);
			}else {
				map.put(x, map.get(x)+1);
			}
		}
		
		System.out.println("Duplicate elements in an array are:");
		for(Integer x:map.keySet()) {
			if(map.get(x)>1) {
				System.out.println(x);
			}
			
			
			
			
				
		}
		System.out.println("**********************************");
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
		}
		
	}

}
