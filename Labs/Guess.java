import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main (String[] args) {
	int numToGuess; // Number the user tries to guess
	int guess;	// The user's guess

	Scanner scan = new Scanner(System.in);
	Random gen = new Random();

	// randomly generate the number to guess
	numToGuess = gen.nextInt(10) + 1;

	// print message asking user to guess
	// read in guess
	while (true) {
	    // print message saying guess is wrong
	    System.out.print("Enter a guess: ");
	    guess = scan.nextInt();

	    if (guess == numToGuess)
		break;
	    System.out.println("Nope!");
	}

	System.out.println("You win!!!");
    }
}
	

	     
