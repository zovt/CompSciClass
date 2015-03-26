import java.util.Scanner;

public class ProcessTransactions {
    public static void main(String[] args) {
	Account acct1, acct2;    // two test accounts
	String keepGoing = "y"; // more transactions?
	String action;         // deposit or withdraw
	double amount;        // how much to deposit or withdraw
	long acctNumber;     // which account to access

	Scanner scan = new Scanner(System.in);

	// Create two accounts
	acct1 = new Account(1000, "Sue", 123);
	acct2 = new Account(1000, "Joe", 456);

	System.out.println("The following accounts are available:\n");
	System.out.println(acct1);
	System.out.println(acct2);

	while (keepGoing.equals("y") || keepGoing.equals("Y")) {
	    // get account number, what to do, and amount
	    System.out.print("\nEnter the number of the account you would like to access: ");
	    acctNumber = scan.nextLong();
	    System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");

	    action = scan.next();
	    System.out.print("Enter the amount: ");
	    amount = scan.nextDouble();

	    if (amount > 0) {
		Account selected;
		
		if (acct1.getNumber() == acctNumber) {
		    selected = acct1;
		} else {
		    selected = acct2;
		}
		
		if (action.toUpperCase().equals("D")) {
		    selected.deposit(amount);
		} else if (action.toUpperCase().equals("W")) {
		    selected.withdraw(amount);
		} else {
		    System.out.println("Invalid action.");
		}

		if (acct1.getNumber() == acctNumber) {
		    acct1 = selected;
		} else {
		    acct2 = selected;
		}
	    } else {
		System.out.println("Amount has to be greater than 0");
	    }
	    System.out.print("\nMore transactions? (y/n) ");
	    keepGoing = scan.next();
	}
	// Print the number of deposits
	System.out.println("# Deposits: " + Account.getNumDeposits());
	// Print the number of Withdrawals
	System.out.println("# Withdrawals: " + Account.getNumWithdrawals());
	// Print the total amount of deposits
	System.out.println("Amount of deposits: " + Account.getDepositTotal());
	// Print the total amount of withdrawals
	System.out.println("Amount of withdrawals: " + Account.getWithdrawalTotal());
    }
}
