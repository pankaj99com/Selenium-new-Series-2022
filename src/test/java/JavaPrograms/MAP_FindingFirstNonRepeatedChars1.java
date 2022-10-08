package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MAP_FindingFirstNonRepeatedChars1 {

	public static void main(String[] args) {
		
		
		String str="SWISS";//first non repeated char is W
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();//linked hashmap maintains insertion order
		int count=1;
		for(int i=0;i<str.length();i++) {
			
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),count);
				
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		

		for(Character key:map.keySet()) {
			if(map.get(key)==1) {
			System.out.println(key);
			break;
		}

	}
	}

	}
