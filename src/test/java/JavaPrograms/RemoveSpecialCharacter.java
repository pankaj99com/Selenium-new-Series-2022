package JavaPrograms;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str="j@#@a)(v&^&a";
		String plaintext=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plaintext);

	}

}
