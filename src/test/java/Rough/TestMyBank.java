package Rough;

public  class TestMyBank {

	public static void main(String[] args) {
		AXISBANKINDIA bank=new AXISBANKINDIA();
		
		bank.credit();
		bank.debit();
		bank.moneytrasfer();
		bank.tradeCharges();
		bank.Carloan();
		bank.Educationloan();

		
		//USBank us=new USBank();
		USBank us=new SimpleClass();
		us.credit();
		us.debit();
		us.moneytrasfer();
		System.out.println(USBank.min_balance);
		//USBank.min_balance=1500;
		
		
	}

}
