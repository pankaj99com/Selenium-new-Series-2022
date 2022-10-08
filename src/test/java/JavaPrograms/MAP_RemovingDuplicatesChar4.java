package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MAP_RemovingDuplicatesChar4 {

	public static void main(String[] args) {
		String str = "pankaj";
		
		char[] arr= str.toCharArray();
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		int count=1;
		
		for(char c : arr) {
			
			if(!map.containsKey(c)) {
				map.put(c,count);
			}else {
				map.put(c,map.get(c)+1);
			}
		}
		
		for(Character key:map.keySet()) {
			if(map.get(key)>1) {
			System.out.println(key+" : "+map.get(key));
		}
		}
		

		
	}
}
