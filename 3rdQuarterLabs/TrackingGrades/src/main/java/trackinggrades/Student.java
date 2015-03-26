import java.util.Scanner;

public class Student {
    // declare instance data
    private String name;
    private int test1;
    private int test2;

    private Scanner scan = new Scanner(System.in);

    // constructor
    public Student(String studentName) {
	// add body of constructor
	name = studentName;
    }

    // inputGrades: prompt for and read in student's grades for test1 and test2.
    // Use name in prompts, e.g., "Enter Joe's score for test1".
    public void inputGrades() {
	System.out.print("Enter " + name + "'s score for test 1: ");
	test1 = scan.nextInt();

	System.out.print("Enter " + name + "'s score for test 2: ");
	test2 = scan.nextInt();
    }

    // getAverage: compute and return the student's test average
    public double getAverage() {
	// add body of getAverage
	return (test1 + test2) / 2.0;
    }

    // getName: print the student's name
    public String printName() {
	// add body of printName
	return name;
    }

    public String toString() {
	return "Name: " + name + "\tTest 1: " + test1 + "\tTest 2: " + test2;
    }
}
