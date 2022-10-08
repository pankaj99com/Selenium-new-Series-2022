package Arrays;

public class CopyArraytoAnotherArray {

	public static void main(String[] args) {
		// copy all elements of one array into another array

		int arr1[] = new int[] { 23, 19, 4, 5, 27 };
		int arr2[] = new int[arr1.length];
		System.out.println("Element in first array");
		for (int k = 0;k < arr1.length; k++) {
			System.out.print(arr1[k] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];

		}
		System.out.println("Elements in second array are:");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");

		}
	}

}
