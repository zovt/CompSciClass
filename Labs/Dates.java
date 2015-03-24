import java.util.Scanner;
import java.util.Arrays;

public class Dates {
    public static void main (String[] args) {
	int month, day, year;				// Date read in from user
	int daysInMonth;				// Number of days in month read in
	boolean monthValid, yearValid, dayValid;	// true if input is valid
	boolean leapYear;				// true if user's year is a leap year

	dayValid	= false;
	monthValid	= false;
	yearValid	= false;
	leapYear	= false;
	
	Scanner scan = new Scanner(System.in);

	// Get integer month, day, and year from user
	System.out.print("Input day: ");
	day = scan.nextInt();
	
	System.out.print("Input month: ");
	month = scan.nextInt();
	
	System.out.print("Input year: ");
	year = scan.nextInt();

	// Check to see if month is valid
	if ((month <= 12) && (month > 0)) {
	    monthValid = true;
	    daysInMonth = 0;
	}
	

	// Check if year is valid
	if ((year >= 1000) && (year < 2000))
	    yearValid = true;

	// Determine whether it's a leap year
	if (year % 400 == 0)
	    leapYear = true;
	if ((year % 4 == 0) && (year % 100 != 0))
	    leapYear = true;
	

	// Determine number of days in month
	int[] thirtyMonths = {4, 6, 9, 10};
	int[] thirtyOneMonths = {1, 3, 5, 7, 8, 11, 12};

	if (Arrays.asList(thirtyMonths).contains(month))
	    daysInMonth = 30;
	else if (Arrays.asList(thirtyOneMonths).contains(month))
	    daysInMonth = 31;
	else if (leapYear == true)
	    daysInMonth = 29;
	else
	    daysInMonth = 28;

	// Use number of days in month to check to see if day is valid
	if ((day <= daysInMonth) && (day > 0))
	    dayValid = true;

	if (dayValid && monthValid && yearValid) {
	    System.out.println("The date you entered is valid!");
	    if (leapYear)
		System.out.println("And it's a leap year!");
	} else {
	    System.out.println("The date you entered is invalid.");
	}
    }
}
		
	
