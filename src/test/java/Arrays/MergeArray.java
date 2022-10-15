package Arrays;

public class MergeArray {

	public static void main(String[] args) {
		int arr1[] = new int[] { 23, 19, 4, 8, 27 };
		int arr2[] = new int[] {5,15,25,35,45,55,65,75,85,95} ;
		
		int arr1_len=arr1.length;
		int arr2_len=arr2.length;
		
		int arr3[]=new int[arr1_len+arr2_len];
		int arr3_len=arr3.length;
		for(int i=0;i<arr1_len;i++) {
			arr3[i]=arr1[i];
			
		}
		for(int i=0;i<arr2_len;i++) {
			arr3[arr1_len+i]=arr2[i];
			
		}
		
		for(int i=0;i<arr3_len;i++) {
			System.out.print(arr3[i]+" ");
		}

	}

}
