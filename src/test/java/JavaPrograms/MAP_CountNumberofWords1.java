package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class MAP_CountNumberofWords1 {

	public static void main(String[] args) {
		 String str="I am learning java java programming";
		 
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 
		 String strArr[]=str.split(" ");
		 
		 for(String c : strArr) {
			 if(!map.containsKey(c)) {
				 
				 map.put(c, 1);
			 }else {
				 
				 map.put(c, map.get(c)+1);
			 }
		 }
		 System.out.println(str+":"+map);
	}
}