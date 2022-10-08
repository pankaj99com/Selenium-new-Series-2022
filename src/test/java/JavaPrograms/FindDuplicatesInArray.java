package JavaPrograms;

public class FindDuplicatesInArray {
	public static void finduplicates(int[] input) {

		for (int i = 0; i < input.length; i++) {

			for (int j = i + 1; j < input.length; j++) {

				if (input[i] == input[j]) {
					System.out.println("Duplicate element found: " + input[i]);
				}
			}
		}

	}
	
	public static void main(String[] args) {
		int[] arr = { 10, 2, 24, 34, 54, 3, 4, 33, 2, 34 };
		FindDuplicatesInArray.finduplicates(arr);
	
}
	
	
	}
