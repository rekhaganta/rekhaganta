package labbookk4;

public class CurrentAccount extends Account{

	public CurrentAccount(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		// TODO Auto-generated constructor stub
	}
	
	

	static final double OVERDRAFTLIMIT=500; // added variable
	double balance = super.getBalance(); // calling balace from parent class

	@Override
	boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		
		if(balance-amount-500<0) { // if exceeding bank balance
			 System.out.println("SORRY!!!  Insufficient funds to perform overdraft");
			return false;
			}

			else { // if not exceeding bank balance
			 this.balance =this.balance - amount+500;
			 System.out.println("Successful Transaction!!!  ");
			 System.out.println("You have withdrawn of amount is: " +amount);
			 System.out.println(" New Balance is: " + this.balance);

			}
			return true;
	}
	

}

