import java.util.Scanner;

public class LoveCS {
    public static void main (String[] args) {
	int limit;
	int sum = 0;
	int count = 1;

	Scanner scan = new Scanner(System.in);

	System.out.print("How much do you love computer science? Enter an integer: ");
	limit = scan.nextInt();

	while (count <= limit) {
	    System.out.println(count + " I love Computer Science!!");
	    sum += count;
	    count++;
	}

	System.out.println("Printed this message " + (count - 1) + " times.");
	System.out.println("The sum of the numbers from 1 to " + (count - 1) + " is " + sum);
    }
}
