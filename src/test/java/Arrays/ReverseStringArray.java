package Arrays;

public class ReverseStringArray {

	public static void main(String[] args) {
		// copy all elements of one array into another array

		String str[] = { "India", "is", "a", "great", "Country" };
		System.out.println("Original Array");
		for (int i = 0; i <= str.length - 1; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
		System.out.println("After reverse");

		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i] + " ");

		}
	}
}
