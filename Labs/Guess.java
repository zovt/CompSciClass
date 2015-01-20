import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main (String[] args) {
	int numToGuess; // Number the user tries to guess
	int guess;	// The user's guess
	int totalGuesses, lowGuesses, highGuesses;

	Scanner scan = new Scanner(System.in);
	Random gen = new Random();

	// initialize guess nums to 0
	totalGuesses = 0;
	lowGuesses = 0;
	highGuesses = 0;
	
	// randomly generate the number to guess
	numToGuess = gen.nextInt(10) + 1;

	// print message asking user to guess
	// read in guess
	while (true) {
	    // print message saying guess is wrong
	    System.out.print("Enter a guess: ");
	    guess = scan.nextInt();
	    totalGuesses++;

	    if (guess == numToGuess)
		break;
	    else if (guess < numToGuess) {
		System.out.println("Too low!");
		lowGuesses++;
	    }
	    else {
		System.out.println("Too high!");
		highGuesses++;
	    }
	}

	System.out.println("You win!!!");
	System.out.println("Low Guesses: " + lowGuesses);
	System.out.println("High Guesses: " + highGuesses);
	System.out.println("Total Guesses: " + totalGuesses);
    }
}
	

	     
    
    
