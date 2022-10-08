package JavaPrograms;

public class LargestAndSmallestElement {

	public static void main(String[] args) {

		int[] arr = { 2, 45, 6, -20, 20, 1, 56, 4, 72, 8 };
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				
				largest=arr[i];
			}else if(arr[i]<smallest) {
				smallest=arr[i];
			}
			
		}
		
		System.out.println("Largest element in an array is: "+largest);
		
		System.out.println("Smallest element in an array is: "+smallest);

	}

}
