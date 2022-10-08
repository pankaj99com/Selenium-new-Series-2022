package JavaPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str="    j      av   a  co  n ce   p  t   ";
		System.out.println(str.trim());//removing spaces only from ends
		System.out.println(str.replaceAll("\\s",""));//unicode value for space

	}

}
