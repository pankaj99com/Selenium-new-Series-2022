package Rough;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// 404,484
	
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = sc.nextInt();
		int n=0,sum=0;
		n=number;
		
		while(n!=0) {
			int rem=n%10;//4   8 4
			System.out.println(rem);
			sum=sum*10+rem;//4  40+8=480+4=484
			System.out.println(sum);
			
			n=n/10;//48 4
			System.out.println(n);
			
		}
		if(sum==number) {
			System.out.println("palindrome");
		}else {
			System.out.println("palindrome nahi hai");
		}

	}

}
