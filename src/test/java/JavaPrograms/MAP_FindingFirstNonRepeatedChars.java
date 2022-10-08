package JavaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MAP_FindingFirstNonRepeatedChars {

	public static void main(String[] args) {
		
		
		String str="swiss";//first non repeated char is W
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();//linked hashmap maintains insertion order
		int count=1;
		for(int i=0;i<str.length();i++) {
			
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i),count);
				
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()==1) {
				System.out.println("First non repeated char in String is: "+ entry.getKey());
				break;
			}
			
		}

	}

}
