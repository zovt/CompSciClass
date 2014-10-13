import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integers");
        System.out.print("One: ");
        val1 = scan.nextInt();
        System.out.print("Two: ");
        val2 = scan.nextInt();
        System.out.print("Three: ");
        val3 = scan.nextInt();

        average = (val1 + val2 + val3)/3;

        System.out.println(average);
    }
}
