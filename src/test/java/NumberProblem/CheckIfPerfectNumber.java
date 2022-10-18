package NumberProblem;

import java.util.Scanner;

public class CheckIfPerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int n=number;
		int sum=0;//
		boolean flag=false;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
			if(sum==n) {
				flag=true;
			}
			
		}
		if(flag==true) {
			System.out.println("its a perfect number");
		}else {
			System.out.println("its not a perfect number");
		}

	}

}
