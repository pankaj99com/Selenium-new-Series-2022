package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class MAP_CountNoOfCharacters1 {
	/*frequency of chracters in a word*/
	public static void getCharCount(String name) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char strArray[]=name.toCharArray();
	
		
		for(int i=0;i<strArray.length;i++) {
			
			
			if(!map.containsKey(strArray[i])) {
				
				map.put(strArray[i], 1);
			}else {
				
				map.put(strArray[i], map.get(strArray[i])+1);
			}
		}
		
		System.out.println(map);
		
		}
		


	public static void main(String[] args) {
		
		getCharCount("pankaj");
		
		

	}

}
