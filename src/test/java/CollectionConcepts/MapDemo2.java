package CollectionConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo2 {

	public static void main(String[] args) {

		Map<String,Integer> map = new TreeMap<String,Integer>();
		
		map.put("one",1);
		map.put("two", 2);
		map.put("three",3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		
		
		System.out.println(map);
	}
	
		
	}

