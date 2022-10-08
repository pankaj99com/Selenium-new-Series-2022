package JavaPrograms;

public class StringLogic {

	public static void main(String[] args) {
		String str = "Pankaj love Cricket";
		String rev = "";
		String word = "";
		str = str + " ";
		int count = 0;
		String longest="";
		String ns="";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
               rev=c+rev;
			if (c != ' ') {
				
					
				word = word +c;
					
					
			
				
			} else {
				
				
					ns=word.replace("a", "#");
					System.out.println(ns);
					ns=word.replace("c", "*");
			
				System.out.println(ns);
				//System.out.println(word.substring(0,1));
//				if(word.startsWith("C")) {
//					System.out.println(word);
//				}
//				
//				if(word.contains("o")) {
//					System.out.println(word);
//				}
				
//				if(word.length()>=4) {
//					System.out.println(word);
//				}
				
//				
//				if(word.length()>longest.length()) {
//					longest=word;
//				}
				
				
			count++;
				word = "";
				ns="";
			}

		}
//		System.out.println("reverse is -->"+rev);
//		System.out.println(longest);
		System.out.println(count);
	}

}

