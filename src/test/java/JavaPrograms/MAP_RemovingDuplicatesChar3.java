package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MAP_RemovingDuplicatesChar3 {

	public static void main(String[] args) {
		String str = "pankaj";
		
		char[] arr= str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		int count=1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i],count);
			}else {
				map.put(arr[i],map.get(arr[i])+1);
			}
		}
		
		for(char key:map.keySet()) {
			if(map.get(key)>1) {
			System.out.println(key+" : "+map.get(key));
			System.out.println(map);
			map.remove(key);
			System.out.println(map);
		}
		}
		
		
		
		
	}
}
