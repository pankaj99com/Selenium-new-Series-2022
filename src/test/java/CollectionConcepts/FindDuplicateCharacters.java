package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		String str = "swiss";

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(arr[i])) {
				map.put(arr[i], 1);

			} else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}

		}

		for (Character key : map.keySet()) {

			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("******************************************");
		for (Entry<Character, Integer> e : map.entrySet()) {

			if (e.getValue()==1) {
				System.out.println("Repeated char: " + e.getKey());
				break;

			}

		}

	}

}
