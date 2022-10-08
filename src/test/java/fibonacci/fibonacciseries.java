package fibonacci;

import java.util.Scanner;

public class fibonacciseries {

//0+1=1,1+2=3
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range for Fibonacci series");
		System.out.println();
		int input=sc.nextInt();
		
		int a=0,b=1,c;
		System.out.print(a+" " +b);

		for(int i=1;i<=input;i++){
			
			c=a+b;
			
			System.out.print(" " +c);
			a=b;
			b=c;
		}
		
		

	}

}
