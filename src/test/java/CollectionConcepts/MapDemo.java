package CollectionConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(104, "Java");
		map.put(101, "Selenium");
		map.put(102, "c++");
		map.put(103, "JavaScript");
		map.put(100, "Python");

		System.out.println(map);
		System.out.println(map.containsKey(101));// true
		System.out.println(map.containsValue("Java"));// true
		
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(100, "Java");
		map1.put(101, "Selenium");
		map1.put(102, "c++");
		map1.put(103, "Ruby");
		map1.put(104, "Python");
		System.out.println(map1);
		System.out.println(map.equals(map1));//false
		
		System.out.println(map.isEmpty());//false
		
		System.out.println(map.get(102));//pass key-c++
		
		System.out.println(map.values());
		
		System.out.println(map.keySet());
		
		System.out.println(map.entrySet());
		
		map.putIfAbsent(105, "Cucumber");
		if(!map.containsKey(106)) {
			map.put(106, "Pankaj");
		}
		
		System.out.println(map);
		
		map.remove(106);
		System.out.println(map);
		
		System.out.println(map.size());
		
		System.out.println(map.replace(105, "nodejs"));
		System.out.println(map);
		
		//map.clear();
		//System.out.println(map);
		
		
		System.out.println("*************************************************");
		for(Integer i:map.keySet()) {
			
			System.out.print(i+" ");
		}
		System.out.println("*************************************************");
		for(Object i:map.values()) {
			System.out.print(i+" ");
		
			}
		System.out.println("*************************************************");
		for(Object i:map.entrySet()) {
			System.out.println(i);
		}
		
		System.out.println("*************************************************");
		for(Object i:map.keySet()) {
			System.out.println(i+"="+map.get(i) );
		}
		System.out.println("*************************************************");
		
		
		for(Entry<Integer, String> e:map.entrySet()) {
			
			System.out.println(e.getKey()+"="+e.getValue());
			
		}
		
		Map<Integer, String> map3 = new HashMap<Integer, String>(map);
		map3.put(106," .Net");
		System.out.println(map3);
		
		Map<Integer, String> map4 = new HashMap<Integer, String>(10);
		
		Map<Integer, String> map5 = new HashMap<Integer, String>(10,12.6f);
			
			}
		}

	


