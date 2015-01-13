import java.util.Scanner;
import java.util.Random;

public class Dice {
    public static void main (String[] args) {
	Random gen = new Random();

	int dice1 = gen.nextInt(6) + 1;
	int dice2 = gen.nextInt(6) + 1;

	System.out.println("Dice 1: " + dice1);
	System.out.println("Dice 2: " + dice2);
	System.out.println("Sum: " + (dice1 + dice2));
    }
}
