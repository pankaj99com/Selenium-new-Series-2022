package Duplicates;

public class MissingValueInAnArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		// n*(n+1/2)=5*6/2 =15-11=4

		System.out.println(a.length);

		int s = 0;

		for (int i = 0; i < a.length; i++) {

			s = s + a[i];
		}
		System.out.println(s);
		int s1 = 0;
		int n=10;
		n=n*(n+1)/2;
		System.out.println(n);
		for (int i = 1; i <= 10; i++) {
			
			s1 = s1 + i;
		}
		System.out.println(s1);
		System.out.println("Missing number in an Array is :" +(s1 - s));
	}

}
