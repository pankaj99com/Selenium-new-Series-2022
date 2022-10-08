package Rough;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// number which divisible by 1 and itself
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range");

		int range = sc.nextInt();

		
		for (int i = 1; i <= range; i++) {//5
			int count = 0;
			for (int j = 1; j <=i; j++) {  //2,3,

				if (i%j == 0) {
					count++;
				}
				
				
			}
			
			if (count == 2) {
				System.out.print(i + " ");
			} 
			}
		

	}
}
