package Arrays;

public class MinValueInArray {

	public static void main(String[] args) {
		// copy all elements of one array into another array

		int arr1[] = new int[] { 23, 19, 44, 4, 5, 27 };
		int max = arr1[0];
		System.out.println("Original Array");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Maximum value in a Array is:");
		for (int i = 0; i <= arr1.length-1; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		System.out.println(max);

	}

}
