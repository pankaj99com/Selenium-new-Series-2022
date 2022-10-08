package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class MAP_CountNoOfCharacters {
	/*frequency of chracters in a word*/
	public static void getCharCount(String name) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char strArray[]=name.toCharArray();
		
		for(char c : strArray) {
			
			if(!map.containsKey(c)) {
				
				map.put(c, 1);
			}else {
				
				map.put(c,map.get(c)+1);
			}
		}
		System.out.println(name + " "+ map);
		
		System.out.println("We can also print in this way as well");
		for(Character c:map.keySet()) {
			System.out.println("The count of charcters:"+c+"="+map.get(c));
		}
	}

	public static void main(String[] args) {
		
		getCharCount("pankaj");
		
		

	}

}
