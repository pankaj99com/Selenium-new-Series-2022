package Arrays;

public class MaxValue {
	
	public static void main(String[] args) {
		
		int a[]= {32,23,2,4,23,25,12,18,43,3};
		
		int min=a[0];
		
		
		for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
			if(a[i]<min) {
				
				min=a[i];
				
			}
		}
		
		System.out.println(min);
		
	}

}
