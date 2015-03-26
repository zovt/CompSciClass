import java.util.Scanner;

public class TestAccounts1 {
    public static void main(String[] args) {
	/* Account testAcct;

	   Scanner scan = new Scanner(System.in);

	   System.out.println("How many accounts would you like to create?");
	   int num = scan.nextInt();

	   for (int i = 1; i <= num; i++) {
	   testAcct = new Account(100, "Name" + i, 1000+i);
	   System.out.println("\nCreated account " + testAcct);
	   System.out.println("Now there are " + Account.numAccounts() + " accounts");
	   } */

	Scanner scan = new Scanner(System.in);
	
	System.out.print("Input name for person 1: ");
	Account person1 = new Account(100, scan.next(), 1000+Account.numAccounts());

	System.out.print("Input name for person 2: ");
	Account person2 = new Account(100, scan.next(), 1000+Account.numAccounts());

	System.out.print("Input name for person 3: ");
	Account person3 = new Account(100, scan.next(), 1000+Account.numAccounts());

	System.out.println(person1);
	System.out.println(person2);
	System.out.println(person3);

	person1.close();

	Account cons = Account.consolidate(person2, person3);

	System.out.println(person1);
	if (cons != null) {
	    System.out.println(cons);
	} else {
	    System.out.println(person2);
	    System.out.println(person3);
	}
    }
}
