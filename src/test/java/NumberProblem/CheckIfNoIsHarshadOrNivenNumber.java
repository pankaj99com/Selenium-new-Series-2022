package NumberProblem;

import java.util.Scanner;

public class CheckIfNoIsHarshadOrNivenNumber {
/* 156,1+5+6=12 and 156 should be divisible by 12 this is Harshad/Niven number*/
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
			
			n=n/10;
		}
		if(number%sum==0) {
			System.out.println("yes its a HARSHAD NUMBER");
		}else {
			
			System.out.println("No its NOT A HARSHAD NUMBER");
		}
		

	}

}
