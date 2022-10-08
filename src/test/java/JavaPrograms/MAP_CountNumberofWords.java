package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class MAP_CountNumberofWords {

	public static void main(String[] args) {
		 String str="I am learning java java programming";
		 
		 Map<String,Integer> map=new HashMap<String,Integer>();
		 int count=1;
		 String[] arr=str.split(" ");
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(!map.containsKey(arr[i])) {
				 
				 map.put(arr[i], count);
				 
			 }else {
				 
				 map.put(arr[i],map.get(arr[i])+1);
			 }
		 }
		 
		 System.out.println();
		 System.out.println("Frequency of each word in a String");
		 for(String x:map.keySet()) {
			 System.out.println(x+" = "+map.get(x));
		 }
		 
		
		 

	}

}
