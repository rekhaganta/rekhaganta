package labbook4;

public class Account {



	private long accNum;
	private double balance;
	private Person accHolder;
	
	//creating parameterised constructors
	
	public Account(long accNum, double balance, Person accHolder) {
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
		System.out.println();
	}
	
	//operations in the class diagram
	
	// to perform deposit method / operations
	 void deposit(double amount) {
		
		System.out.println(" enter the amount to be deposited:" + amount);
		this.balance = this.balance+amount; // deposited 2000
		System.out.println("Updated balance is: " + balance); //4000
         setBalance(this.balance);
	
	}
	// to perform withdraw operations
	 boolean withdraw(double amount) {
	
		System.out.println(" Enter the amount to be withdraw: "+ amount); 
		this.balance = this.balance-amount; // withdrawed amunt is deduced
		System.out.println(" Updated Balance is : "+ balance);
		setBalance(this.balance);
		return true;
		
	}
	 // to get balance
	public double getBalance(){
		return this.balance;
		
	}


	// Generating setter and getter methods
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

