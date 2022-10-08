package Rough;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		//  20=1,2,4,5,10
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num=sc.nextInt();
		
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.print(i+",");
			}
			
		
		}
		
		System.out.println(num);
	}

	
	}

