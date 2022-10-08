package Duplicates;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicatesUsingMap {

	public static void main(String[] args) {
		int[] a = { 36, 22, 4, 87, 9, 32, 6 ,9,3,33,22,4,4};
		
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(!map.containsKey(a[i])) {
				map.put(a[i],1);
			}else {
				map.put(a[i],map.get(a[i])+1);
			}
			
		}
		//System.out.println(map);
		for(Entry<Integer,Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>1) {
				System.out.println(entry);
			}
			
		}
		
            for(Integer key:map.keySet()) {
            	if(map.get(key)==3)
			
			System.out.println(key +"--->"+map.get(key));
			
		}
	}

}
