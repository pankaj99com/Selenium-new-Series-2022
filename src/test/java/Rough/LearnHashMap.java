package Rough;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnHashMap {

	public static void main(String[] args) {

		Map<String, Integer> numbers = new HashMap<String, Integer>();

		numbers.put("one",1);
		numbers.put("two",2);
		numbers.put("three",3);
		numbers.put("four",4);
		numbers.put("five",5);
		numbers.put("six", 6);
		System.out.println(numbers);
		if(!numbers.containsKey("six")) {
			numbers.put("six", 6);
		}else {
			System.out.println("Cannot enter duplicate keys in Map");
			
		}
		System.out.println(numbers);
		
		numbers.putIfAbsent("six", 6);
		numbers.putIfAbsent("seven", 2);
		
		numbers.remove("three");
		System.out.println(numbers);
		
		System.out.println("**********************");
		
		for(Entry<String, Integer> e:numbers.entrySet()) {
			
			//System.out.println(e);
			//System.out.println(e.getKey());
			
			if(e.getValue()==2)
			System.out.println(e.getKey());
			
		}
	}

}
