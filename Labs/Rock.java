import java.util.Scanner;
import java.util.Random;

public class Rock {
    public static void main (String[] args) {
	String personPlay;	// User's play -- R, P, or S
	String computerPlay;	// Computer's play -- R, P, or S
	int computerInt;	// Random int for getting computer play

	Scanner scan = new Scanner(System.in);
	Random gen = new Random();

	// Get player's play -- note that this is stored as a string
	// Make the player's play uppercase for ease of comparison
	System.out.print("Throw! Enter R, P, or S: ");
	personPlay = scan.next().toUpperCase();
	
	while (!(personPlay.equals("R")) && !(personPlay.equals("P")) && !(personPlay.equals("S"))) {
	    System.out.print("Not a valid guess. Please enter either R, P, or S: ");
	    personPlay = scan.nextLine().toUpperCase();
	}
	
	// Generate the computer's play (0, 1, 2)
	computerInt = gen.nextInt(3);
	
	// Translate computer's randomly generated play to string
	switch (computerInt) {
	case 0:
	    computerPlay = "R";
	    break;
	case 1:
	    computerPlay = "P";
	    break;
	case 2:
	    computerPlay = "S";
	    break;
	default:
	    computerPlay = "S";
	    break;
	}

	// Print computer's play
	System.out.println("Computer played: " + computerPlay);
	System.out.println("You played: " + personPlay);
	
	// See who won. Use nested ifs istead of &&.
	if (personPlay.equals(computerPlay))
	    System.out.println("It's a tie!");
	else if (personPlay.equals("R"))
	    if (computerPlay.equals("S"))
		System.out.println("Rock crushes scissors. You win!!");
	    else
		System.out.println("Paper covers rock. You lose.");
	else if (personPlay.equals("P"))
	    if (computerPlay.equals("R"))
		System.out.println("Paper covers rock. You win!!");
	    else
		System.out.println("Scissors cuts paper. You lose.");
	else if (personPlay.equals("S"))
	    if (computerPlay.equals("R"))
		System.out.println("Rock crushes scissors. You lose.");
	    else
		System.out.println("Scissors cuts paper. You win!!");
	else
	    System.out.println("Everything is broken. I'm sorry");
    }
}

	
