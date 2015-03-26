public class Account {
    private double balance;
    private String name;
    private int number;
    private static int accounts = 0;

    private static int totalDeposits;
    private static int totalWithdrawals;
    private static double totalAmountWithdrawals;
    private static double totalAmountDeposits;
    
    // Constructor -- initializes balance, owner, and account number
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

    public static int getNumWithdrawals() {
	return totalWithdrawals;
    }

    public static int getNumDeposits() {
	return totalDeposits;
    }

    public static double getWithdrawalTotal() {
	return totalAmountWithdrawals;
    }

    public static double getDepositTotal() {
	return totalAmountDeposits;
    }

    public void close() {
	name = name + "(CLOSED)";
	accounts--;
    }

    public void deposit(double amount) {
	balance += amount;
	totalAmountDeposits += amount;
	totalDeposits++;
    }

    public void withdraw(double amount) {
	balance -= amount;
	totalAmountWithdrawals += amount;
	totalWithdrawals++;
    }

    // Transfer money to acct from this object
    public void transfer(Account acct, double amount) {
	acct.balance += amount;
	balance -= amount;
    }

    public static void transfer(Account acct1, Account acct2, double amount) {
	acct2.balance += amount;
	acct1.balance -= amount;
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
