package week3.day1;

public class MyBank {

	public static void main(String[] args) {
		//ReserveBank myBank = new ReserveBank();
		
		
		AxisBank myBank = new AxisBank();
		myBank.KnowYourCustomer();
		
		ICICIBank bank = new ICICIBank();
		bank.withdrawlLimit();
		bank.KnowYourCustomer();
	}

}
