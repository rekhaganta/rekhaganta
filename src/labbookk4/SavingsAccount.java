package labbookk4;

public class SavingsAccount extends Account {
	public SavingsAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}

	final  double minBalance = 500; 
	double balance = super.getBalance();

	@Override
	boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance<= minBalance && amount<balance) {
			System.out.println(" SORRY!! Transaction failed.... ");
			System.out.println("Your balance is to low to withdraw the amount ");
		       return false;
		}
		
		else {
	            balance = amount-minBalance;
	            setBalance(balance);
	            System.out.println(" Successful SavingsTransaction is done !!! ");
	            System.out.println("New Balance is: " +balance);
	             return true;
		}
	}

}

