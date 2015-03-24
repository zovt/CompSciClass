import java.util.Scanner;
import java.text.NumberFormat;

public class ChargeAccount {
    public static void main (String[] args) {
	double balance;		// balance on the account
	double charge;		// total charges on the account
	double interest;	// the amount of interest due
	double newBalance;	// new balance on the account
	double minimumPayment;  // minimum payment due

	Scanner scan = new Scanner(System.in);

	// get the balance
	System.out.print("Balance last month: ");
	balance = scan.nextDouble();
	System.out.print("Charges last month: ");
	charge = scan.nextDouble();

	// compute the new balance
	interest = balance * 0.02;
	newBalance = balance + interest + charge;

	// compute the minimum payment
	if (newBalance < 50) {
	    minimumPayment = newBalance;
	} else if ((newBalance >= 50) && (newBalance <= 300)) {
	    minimumPayment = 50;
	} else if (newBalance > 300) {
	    minimumPayment = newBalance * 0.20;
	} else {
	    minimumPayment = 0;
	}
	
	// Print the statement
	NumberFormat money = NumberFormat.getCurrencyInstance();

	System.out.println("CS CARD International Statement");
	System.out.println("===============================");
	System.out.println();
	System.out.println("Previous Balance:      " + money.format(balance));
	System.out.println("Additional Charges:    " + money.format(charge));
	System.out.println("Interest:              " + money.format(interest));
	System.out.println();
	System.out.println("New Balance:           " + money.format(newBalance));
	System.out.println();
	System.out.println("Minimum Payment:       " + money.format(minimumPayment));
	
    }
}
