
import java.util.Date;
import java.util.Scanner;

public class AccountHolderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double balance = 100.00;
		
		// start object
		AccountHolder ah1 = new AccountHolder(0);
		
		// obtain today's date
		Date date = new Date();

		// the program's header
		System.out.println("Today's Date: " + date);
		System.out.println("[ Programmed by Rida Tariq ] \n");
		System.out.println("----Welcome to Bank of WCC----\n");
		
		//Ask for initial balance
		System.out.println("Enter Initial Account Balance : ");
		balance = sc.nextDouble();
		ah1.setBalance(balance);
		
		//Ask for deposit amount
		System.out.println("Enter Deposit Balance: ");
		double amount = sc.nextDouble();
		ah1.deposit(amount);
		
		//Ask for withdrawal amount
		System.out.println("Enter Withdrawal Balance: ");
		amount = sc.nextDouble();
		ah1.withdrawal(amount);
		
		System.out.printf("Initial Balance = %.2f\n" , ah1.getBalance());
		
		//for loop to calculate balance with interest 
		for(int i=1; i<2;i++) {
		
		ah1.monthlyInterest();//apply monthly interest
		
		System.out.printf("\nBalance with interest applied "
				+"= %.2f\n" , ah1.getBalance());
		
		System.out.println("\nThank You for using this program");
		
	}
		sc.close();
		
		}		
	}


