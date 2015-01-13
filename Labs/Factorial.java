import java.util.Scanner;

public class Factorial {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number greater than zero: ");
	int num = scan.nextInt();

	while(num <= 0) {
	    System.out.print("Not a valid number. Enter a number greater than zero: ");
	    num = scan.nextInt();
	}

	int factorial = 1;
	for(int i = 1; i <= num; i++) {
	    factorial *= i;
	}

	System.out.println("Your factorial is: " + factorial);
    }
}
