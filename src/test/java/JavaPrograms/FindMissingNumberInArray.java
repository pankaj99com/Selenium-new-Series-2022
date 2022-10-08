package JavaPrograms;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		System.out.println(arr.length);
		int sum = 0;
		int expectedsum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println(sum);// actual sum

		for (int i = 1; i <= 10; i++) {
			expectedsum = expectedsum +i;
		}
		
		System.out.println(expectedsum);
		
		System.out.println("Missing number is: "+(expectedsum-sum));
	}

}
