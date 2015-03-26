import java.util.Scanner;

public class BiasedCoinRuns {
    public static void main(String[] args) {
	final int FLIPS = 100;
	
	Scanner scan = new Scanner(System.in);
	BiasedCoin coin1 = new BiasedCoin();

	System.out.println("Coin 1 created as fair coin.");
	
	System.out.print("Enter bias for coin 2 (0.0-1.0): ");
	BiasedCoin coin2 = new BiasedCoin(scan.nextDouble());

	System.out.print("Enter bias for coin 3 (0.0-1.0): ");
	BiasedCoin coin3 = new BiasedCoin(scan.nextDouble());

	// Spaghetti code inbound
	int numHeads = 0;
	for (int i = 1; i <= FLIPS; i++) {
	    coin1.flip();
	    if (coin1.isHeads()) {
		numHeads++;
	    }
	}
	
	System.out.println("Heads for coin 1: " + numHeads);
	numHeads = 0;
       
	for (int i = 1; i <= FLIPS; i++) {
	    coin2.flip();
	    if (coin2.isHeads()) {
		numHeads++;
	    }
	}

	System.out.println("Heads for coin 2: " + numHeads);
	numHeads = 0;
	
	for (int i = 1; i <= FLIPS; i++) {
	    coin3.flip();
	    if (coin3.isHeads()) {
		numHeads++;
	    }
	}

	System.out.println("Heads for coin 3: " + numHeads);
	numHeads = 0;
	
    }
}
	    
	
	
	    
	
	
    
    
