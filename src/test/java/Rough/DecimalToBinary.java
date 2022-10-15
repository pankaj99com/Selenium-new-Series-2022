package Rough;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0;
		n=number;
		int rem=0;
		String sum="";
		//123
		while(n!=0) {
			rem=n%2;//61==1
			sum=sum+rem;
			n=n/2;
			
		}
		System.out.println(sum);
	}

}
