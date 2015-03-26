public class Account {
    private double balance;
    private String name;
    private int number;
    private static int accounts = 0;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, int _number) {
	balance = initBal;
	name = owner;
	number = _number;
	accounts += 1;
    }
    

    public String toString() {
	return "Name: " + name + "\nAcct #: " + number + "\nBalance: " + balance;
    }

    public static int numAccounts() {
	return accounts;
    }

    public String getName() {
	return name;
    }

    public double getBalance() {
	return balance;
    }

    public int getNumber() {
	return number;
    }

    public void close() {
	name = name + "(CLOSED)";
	accounts--;
    }

    public static Account consolidate(Account acct1, Account acct2) {
	if ((acct1.getName().equals(acct2.getName())) &&
	    (acct1.getNumber() != acct2.getNumber())) {
	    accounts++;
	    Account account = new Account(acct1.getBalance() + acct2.getBalance(),
					  acct1.getName(),
					  1000 + accounts);
	    acct1.close();
	    acct2.close();
	    
	    return account;
	}
	System.out.println("Invalid account.");
	return null;
    }
}
