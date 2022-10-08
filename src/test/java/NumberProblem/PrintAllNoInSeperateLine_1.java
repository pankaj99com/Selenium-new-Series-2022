package NumberProblem;

import java.util.Scanner;

public class PrintAllNoInSeperateLine_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any interger number");
		
		int number=sc.nextInt();
		
	   while(number!=0) {
		   int r=number%10;
		   System.out.println(r);
		   number=number/10;
	   }

	}

}
