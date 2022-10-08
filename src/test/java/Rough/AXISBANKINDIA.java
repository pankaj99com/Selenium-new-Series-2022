package Rough;

public class AXISBANKINDIA implements USBank,ChinaBank{//multiple inheritance

	public void credit() {
		System.out.println("AXISBANK Credit method");
		
	}

	public void debit() {
		
		System.out.println("AXISBANK debit method");
	}

	public void moneytrasfer() {
		System.out.println("AXISBANK moneytranfer method");
		
	}

	public void tradeCharges() {
		
		System.out.println("AXISBANK tradecharges method");
	}

	
	public void Carloan() {
		System.out.println("AXISBANK own carloan method");
	}
	
	public void Educationloan() {
		System.out.println("AXISBANK own Educationloan method");
	}
}
