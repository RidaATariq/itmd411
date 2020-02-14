
import java.util.Scanner;
public class AccountHolder {
	
	//instance variable fields
	private double balance;
	private static double annualInterestRate = 0.04;
	Scanner sc = new Scanner(System.in);
	
	public AccountHolder(double bal) 
	{
		/*
		 * set member field to start value
		 * condition ? if true : if false
		 */
		
		balance = bal < 0 ? 0: bal;
	}
	public void monthlyInterest() 
	{	
		//add interest to balance
		balance += balance * (annualInterestRate / 12.0);
	}
	
	// getters and setters functions
	
	public double getBalance() {
		return this.balance;	
	}
	
	public void setBalance(double balance) {	
		// while loop to check invalid balance
		while (balance < 0) {
            System.out.println("Please re-enter a positive beginning balance");
            balance = sc.nextDouble();
		}  
		this.balance = balance; 
	
	}
	
	public void deposit(double amount) {
		// if statement for exception handling
		if (amount < 0) {
			throw new IllegalArgumentException("Negative balance is not acceptable");
	}else {
		this.balance += amount;
	}
	}
	
	public void withdrawal(double amount) {
		/*
		 * discount (drop) balance up to a limit
		 * warn user if they have reached limit
		 */
		if((this.balance - amount) <50.0) {
			System.out.println("Balance must hold at least $50.00");
		
		}else { 
			this.balance -= amount;
			
		}
	}
}