package JavaPrograms;

public class SortStringCharacters {

	public static void main(String[] args) {

		String s = "PANKAJ";
		
		String str=s.toLowerCase();
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0; i < ch.length; i++) {

			for (int j = i+1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		System.out.println(new String(ch));
	}

}
