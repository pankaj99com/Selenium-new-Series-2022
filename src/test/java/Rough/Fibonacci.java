package Rough;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the range");
		int range=sc.nextInt();
		Fibonacci obj=new Fibonacci();
		obj.getSeries(range);
		
		
	}
		
		public void getSeries(int num) {
		// fibonacci series:0 1 1 2 3 5 8 13
		int a = 0;
		int b = 1;
		int c;//result for sum

		System.out.print(a + " " + b);//hard coded
		for (int i = 1; i <= num; i++) {

			c = a + b;//get the result==2
			System.out.print(" " + c);// 2
			a = b;
			b = c;//swap
		}

		}

	}


