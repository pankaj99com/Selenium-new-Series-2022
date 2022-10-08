package Rough;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//  number which divisible by 1 and itself
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			
			if(num%i==0) {
				count++;
			}
			
			
			
		}
		if(count==2) {
			System.out.println("prime hai");
		}else {
			System.out.println(" prime nahi hai");
		}
	
	}

	
	}

