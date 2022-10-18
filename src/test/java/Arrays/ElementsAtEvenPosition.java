package Arrays;

public class ElementsAtEvenPosition {

	public static void main(String[] args) {
		int arr[]=new int[] {67,9,65,4,68,8,34,23,90};
		
		for(int i=2;i<arr.length;i=i+2) {
			System.out.println("Elements at even at "+ i +" position is-->"+arr[i]);
		}
	}

}
