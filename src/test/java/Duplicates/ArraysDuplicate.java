package Duplicates;

public class ArraysDuplicate {

	public static void main(String[] args) {
	int a[]= {32,3,5,23,5,3,2,3,22,222,13};
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]+" ");
			}
		}
		
	}
	

	}

}
