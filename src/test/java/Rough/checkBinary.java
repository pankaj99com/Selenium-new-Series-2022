package Rough;

import java.util.Scanner;

public class checkBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n=0;
		n=number;
		int rem=0;
		boolean flag=false;
		int i=0;
		//111
		while(n!=0) {
			rem=n%10;//45=5//4
			if(rem>1) {
				flag=true;
				break;
			}else {
				n=n/10;
			}
			
			
		}
		if(flag==true) {
			System.out.println("Not Binary");
		}else {
			System.out.println("Binary");
		}
		
	}

}
