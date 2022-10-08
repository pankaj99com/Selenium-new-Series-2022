package PrimeNumbers;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		int number=7;
		boolean temp=true;
		
		for(int i=2;i<=number/2;i++){
			
			if (number%i==0){
				
				temp=false;
			}
		}

	
	if (temp==false){
		
		System.out.println("its not aPrime Number");
	}else{
		System.out.println("its a Prime Number");
	}
}
}
