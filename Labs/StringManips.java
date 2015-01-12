import java.util.Scanner;

public class StringManips {
    public static void main (String[] args) {
	String phrase = new String ("This is a String test.");
	int phraseLength;	// number of characters in the phrase String
	int middleIndex;	// index of the middle character in the String
	String firstHalf;	// first half of the phrase String
	String secondHalf;	// second half of the phrase String
	String switchedPhrase;	// a new phrase with original halves switched
	String middle3;
	String city, state;
	Scanner sc = new Scanner(System.in);

	// compute the length and middle index of the phrase
	phraseLength = phrase.length();
	middleIndex = phraseLength / 2;

	// get middle three characters
	middle3 = phrase.substring(middleIndex-1, middleIndex+2);

	// get the substring for each half of the phrase
	firstHalf = phrase.substring(0, middleIndex);
	secondHalf = phrase.substring(middleIndex, phraseLength);

	// concatenate the firstHalf at the end of secondHalf
	switchedPhrase = secondHalf.concat(firstHalf);

	// replace spaces with asterisks
	switchedPhrase = switchedPhrase.replace(" ", "*");

	// prompt user for home city and state
	System.out.print("Enter your hometown: ");
	city = sc.nextLine();
	System.out.print("Enter your home state: ");
	state = sc.nextLine();

	// print information about the phrase
	System.out.println();
	System.out.println("Original phrase: " + phrase);
	System.out.println("Length of the phrase: " + phraseLength + " characters");
	System.out.println("Index of the middle: " + middleIndex);
	System.out.println("Character at the middle index: " + phrase.charAt(middleIndex));
	System.out.println("Switched phrase: " + switchedPhrase);
	System.out.println("Middle three characters: " + middle3);

	System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());

	System.out.println();
    }
}
