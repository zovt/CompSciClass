import java.util.Scanner;

public class LakeLazyDays {
    public static void main (String[] args) {
	double temp;

	System.out.print("What is the temperature: ");
	Scanner sc = new Scanner(System.in);

	temp = sc.nextDouble();

	if ((temp >= 80) && (temp <= 95)) {
	    System.out.println("Go swimming!");
	} else if ((temp >= 60) && (temp < 80)) {
	    System.out.println("Play tennis!");
	} else if ((temp >= 40) && (temp < 60)) {
	    System.out.println("Go golfing!");
	} else if ((temp < 40) && (temp >= 20)) {
	    System.out.println("Go skiing!");
	} else if ((temp > 95) || (temp < 20)) {
	    System.out.println("Visit our shops!");
	}
    }
}
