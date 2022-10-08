package Rough;

import java.util.Scanner;

public class specialnumber {

	public static void main(String[] args) {
		//123===>1+2+3=6,1*2*3=6

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int number = sc.nextInt();
		int n=0,sum=0,prod=1;
		n=number;
		
		while(n!=0) {
			int rem=n%10;
			sum=sum+rem;
			
			prod=prod*rem;
			n=n/10;//48 4
	
			
		}
		if(sum==prod) {
			System.out.println("ye to special no hai");
		}else {
			System.out.println("special number nahi hai");
		}

	}

}
