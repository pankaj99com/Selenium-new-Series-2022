package NumberProblem;

import java.util.Scanner;

public class CheckIfNoIsSpyNumber {
/* 59,5+9+5*9=59 this is special number*/
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
		if(sum+prod==number) {
			System.out.println("yes sum + product is equal to original number so its a SPECIAL NUMBER");
		}else {
			
			System.out.println("NO sum + product is not equal to original number so its a SPECIAL NUMBER");
		}
		

	}

}
