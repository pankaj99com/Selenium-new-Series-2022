package ReverseNumber;

public class ReverseNumber1 {

	public static void main(String[] args) {
		
		int number=4563;
		int remainder,reverse=0;
		
		while(number!=0){
			
			remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
			
		}
		System.out.print(reverse);

	}

}
