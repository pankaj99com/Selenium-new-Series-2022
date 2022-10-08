package NumberProblem;

import java.util.Scanner;

public class EvenOddinARange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range");
		int range=sc.nextInt();
		System.out.println("Odd numbers in a rage of "+range+" are:");
		for(int i=1;i<=range;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j!=0) {
					count=1;
					
				}
			}
			if(count==1) {
				System.out.print(i+" ");
			}
		}

	}

}
