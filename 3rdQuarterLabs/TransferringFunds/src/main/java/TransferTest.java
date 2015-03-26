import java.util.Scanner;

public class TransferTest {
    public static void main(String[] args) {
	Account account1 = new Account(1000, "Joe", 100);
	Account account2 = new Account(1000, "Bob", 102);

	System.out.println("Available accounts: ");
	System.out.println(account1);
	System.out.println(account2);

	boolean go = true;
	
	while (go) {
	    System.out.print("Enter the account number you want to transfer money to: ");
	    Scanner scan = new Scanner(System.in);
	    int account = scan.nextInt();

	    if (account == account1.getNumber()) {
		System.out.print("How much money to transfer to " + account1.getNumber());
		double amount = scan.nextDouble();
		// account2.transfer(account1, amount);
		Account.transfer(account2, account1, amount);
	    } else if (account == account2.getNumber()) {
		System.out.print("How much money to transfer to " + account2.getNumber());
		double amount = scan.nextDouble();
		// account1.transfer(account2, amount);
		Account.transfer(account1, account2, amount);
	    } else {
		System.out.println("Not a valid account number.");
	    }
	    System.out.print("Keep going? (y/n) ");
	    go = (scan.next().toUpperCase().equals("Y")) ? true : false;
	}

	System.out.println(account1);
	System.out.println(account2);
    }
}
