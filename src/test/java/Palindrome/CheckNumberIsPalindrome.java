package Palindrome;

public class CheckNumberIsPalindrome {

	public static void main(String[] args) {
		int num=454;
		int rem,sum=0,temp;
		temp=num;
		
		while(num> 0){
			
			rem= num%10;
			sum=sum*10+rem;
			num=num/10;
			
			
		}
		if(num==temp){
			System.out.println("Its Palindrome");
		}else{
			System.out.println("Its not a Palindrome");
		}
	}

}
