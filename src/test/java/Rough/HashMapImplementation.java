package Rough;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapImplementation {

	public static void main(String[] args) {
		
		int[] arr= {12,2,3,2,12,2,45,65,5,4,76};
		
		// find duplicates
		
		Map<Integer,Integer> mymap=new LinkedHashMap<Integer,Integer>();
		
		for(Integer x:arr) {
			
			if(!mymap.containsKey(x)) {
				mymap.put(x,1);
			}else {
				mymap.put(x,mymap.get(x)+1);
			}
		}
        for(Integer x:mymap.keySet()) {
			
        	if(mymap.get(x)>1) {
				System.out.println("Duplicate elements in an array are: "+x);
			}
			}
			
		}
	}


