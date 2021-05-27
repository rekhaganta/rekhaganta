package labbookk4;

import java.util.Random;

public class AccountDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating objcets for person
		Person p1 = new Person("smith" ,24);
		Person p2 = new Person("kathy" , 26);
		
		// auto-generated method for accNum
		 Random r =new Random();
		 long accNum1 = r.nextLong();
		 long accNum2 = r.nextLong();
		 
		// creating of accunt objs
		 Account a1= new Account(accNum1,2000,p1);
		 Account a2= new Account(accNum2,3000,p2);
		 
		 // desposit money to smith
		 a1.deposit(2000);
		 
		 // withdraw money from kathy
		 a2.withdraw(2000);
		  // for displaying balances
		 a1.getBalance();
		 a2.getBalance();
		 System.out.println(" Smith account balance is: "+a1.getBalance());
		 System.out.println("Kathy account balance is : "+ a2.getBalance());
		 
		 // instatntiating savings accunt nd peform operations
		 SavingsAccount sa = new SavingsAccount(accNum1,5000,p1);
		 sa.withdraw(2000);
		 System.out.println("Updated Savingsaccount balance after withdrawl is :" + sa.getBalance());
	
		 // object creation and performs operations.
		 CurrentAccount ca = new CurrentAccount(accNum1,3000,p1);
		 ca.withdraw(3500);
		 System.out.println("Updated Current account balance after withdrawl is :" + ca.getBalance());
	


	}

}

