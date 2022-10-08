package NumberProblem;

import java.util.Scanner;

public class CheckIfNoIsSpecialNumber {
/* 123,1+2+3=6 and 1*2*3=6 this is spy number*/
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0,sum=0,prod=1;
		
		n=number;
		
		System.out.println(number);
		
		while(n!=0) {
			
			int r=n%10;
			sum=sum+r;
			prod=prod*r;
			
			n=n/10;
		}
		if(sum==prod) {
			System.out.println("yes sum and product is same so its a SPY NUMBER");
		}else {
			
			System.out.println("No sum and product is not same so its NOT A SPY NUMBER");
		}
		

	}

}
