package JavaPrograms;

public class BubbleSort {
	
	public static void bubblesort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr.length-1;j++) {
				
				if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}
		
		
	}

	public static void main(String[] args) {
		int arr[] = {3,60,2,35,2,45,320,5,5};

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		
		BubbleSort.bubblesort(arr);
		
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}


	}

}
