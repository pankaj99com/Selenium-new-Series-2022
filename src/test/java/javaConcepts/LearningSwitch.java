package javaConcepts;

import java.util.Scanner;

public class LearningSwitch {

	public static void main(String[] args) {
		
		System.out.println("Enter your preferences");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		switch(age) {
		
		case 18:
			System.out.println("You have passed class 12th");
			break;
			
		case 24:
			System.out.println("You are graduate now");
			break;
			
		case 30:
			System.out.println("you are married");
			break;
			
		default:
			System.out.println("Wrong age selection.Please try again");
		}

	}

}
