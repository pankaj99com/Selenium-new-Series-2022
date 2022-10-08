package Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a= {23,32,53};
		int[] b= {24,34,54,64,74,7,3,29};
		int a_len=a.length;
		int b_len=b.length;
		
		int[] c= new int[a_len+b_len];
		int c_len=c.length;
		for(int i=0;i<a_len;i++) {
			
			c[i]=a[i];
		}
		
		for(int j=0;j<b_len;j++) {
			
			c[a_len+j]=b[j];
		}
		System.out.println("Elements in Array C after merging");
		for(int k=0;k<c_len;k++) {
			
			System.out.print(c[k]+" ");
		}

	}

}
