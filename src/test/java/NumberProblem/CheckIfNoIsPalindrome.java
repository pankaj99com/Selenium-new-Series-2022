package NumberProblem;

import java.util.Scanner;

public class CheckIfNoIsPalindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0,sum=0;
		
		n=number;
		
		System.out.println(number);
		
		while(n!=0) {
			
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(sum==number) {
			System.out.println("Its a Palindrome number");
		}else {
			
			System.out.println("Its not a plaindrome number");
		}
		

	}

}
