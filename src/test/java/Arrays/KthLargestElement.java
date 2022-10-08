package Arrays;

public class KthLargestElement {

	public static void main(String[] args) {

		int a[] = { 23, 4, 2, 54, 23, 4, 34, 58, 96, 45, 3, 22 };
		int k=1;
		for(int i=0;i<a.length-1;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			if(i==k-1) {
				System.out.println(a[i]);
				break;
			}
		}

	}

}
