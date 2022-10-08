package JavaPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SET_RemovingDuplicatesChar2 {

	public static void main(String[] args) {
		String str = "programming";
		String str1="";
		System.out.println(str.length());
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new LinkedHashSet();

		for (int i = 0; i < str.length(); i++) {

			set.add(str.charAt(i));

		}
		for (Character c : set) {
			sb.append(c);
		}

		System.out.println(sb);

	}
}
