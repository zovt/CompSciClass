public class Runs {
    public static void old_main(String[] args) {
	final int FLIPS = 100;  // number of coin flips

	int currentRun = 0;	// length of the current run of HEADS
	int maxRun = 0;		// length of the maximum run so far

	// Create a coin object
	Coin coin = new Coin();
	

	// Flip the coin FLIPS times
	for (int i = 1; i <= FLIPS; i++) {
	    // Flip the coin and print the result
	    coin.flip();
	    System.out.println("Result of flip " + i + ": " + coin);

	    // Update the run information
	    if (coin.isHeads()) {
		currentRun++;
	    } else {
		if (maxRun < currentRun) {
		    maxRun = currentRun;
		}
		currentRun = 0;
	    }
	}
	// Print the results
	System.out.println("Maximum run length: " + maxRun);
    }
}
