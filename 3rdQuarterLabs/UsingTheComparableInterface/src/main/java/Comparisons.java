import java.util.Scanner;

public class Comparisons {
    public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("Input three strings to compare: ");
	System.out.println("The greatest string is: " +
			   Compare3.largest(scan.nextLine(),
					    scan.nextLine(),
					    scan.nextLine()));

	System.out.print("Input three integers to compare: ");
	System.out.println("The greatest int is: " +
			   Compare3.largest(scan.nextInt(),
					    scan.nextInt(),
					    scan.nextInt()));
    }
}
									
	
