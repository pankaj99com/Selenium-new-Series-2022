package Arrays;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 3, 4, 34, 3, 23, 4, 65, 23 };
		
		System.out.println("Duplicates are");
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+ " found at index -->"+i );
				}
			}
		}

	}

}
