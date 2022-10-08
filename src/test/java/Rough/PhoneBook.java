package Rough;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneBook {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(789, "Pankaj");
		map.put(8432, "Pankaj");
		map.put(8411, "Laxmi");
		map.put(8422, "Anand");
		map.put(8400, "Pankaj");

		

		for (Entry<Integer, String> e : map.entrySet()) {

			if (e.getValue() == "Pankaj") {

				System.out.println(e.getValue()+ " =" + e.getKey() );
			}
		}
	}

}
