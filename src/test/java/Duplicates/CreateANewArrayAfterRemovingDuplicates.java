package Duplicates;

import java.util.Arrays;

public class CreateANewArrayAfterRemovingDuplicates {

	public static void main(String[] args) {
		int a[] = new int[] {92, 32, 4, 5, 5, 8, 12, 14 ,4};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length - 1-i; j++) {
				
				if (a[j]< a[j + 1]) {
					
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
				// System.out.print(a[i] + " ");
				
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//System.out.println(a.length);
		int temp1[] = new int[a.length];
		int k = 0;
		int count = 0;
		for (int m = 0; m < a.length - 1; m++) {

			if (a[m] != a[m + 1]) {
				temp1[k] = a[m];
				k = k + 1;
			} else {
				if (a[m] == a[m + 1]) {
					count++;
				}
			}

		}
		
		temp1[k] = a[a.length - 1];
		System.out.println(temp1.length);
		for (int l = 0; l < temp1.length-count; l++) {
			System.out.print(temp1[l] + " ");
		}

	}
}
