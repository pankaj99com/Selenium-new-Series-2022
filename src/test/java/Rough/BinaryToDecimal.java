package Rough;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0;
		n=number;
		int rem=0;
		int sum=0;
		int i=0;
		//111
		while(n!=0) {
			rem=n%10;
			sum=sum+rem*(int) Math.pow(2, i++);//1+1=2+1=3,3+4=7
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
