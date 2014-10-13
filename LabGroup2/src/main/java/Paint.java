import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        final int COVERAGE = 350; // paint covers 350 sq ft/gal
        //declare integers length, width, and height
        int length, width, height;
        //declare double totalSqFt
        double totalSqFt;
        //declare double paintNeeded
        double paintNeeded;
        //declare and initialize Scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt for and read in the length of the room
        System.out.print("Input length of room: ");
        length = input.nextInt();
        //Prompt for and read in the width of the room
        System.out.print("Input width of room: ");
        width = input.nextInt();
        //Prompt for and read in the height of the room
        System.out.print("Input height of room: ");
        height = input.nextInt();
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        totalSqFt = height*length*2 + height*width*2;
        //Compute the amount of paint needed
        paintNeeded = totalSqFt/COVERAGE;
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed
        System.out.println("The width of the room is: " + width + " feet");
        System.out.println("The length of the room is: " + length + " feet");
        System.out.println("The height of the room is: " + height + " feet");
        System.out.println("The area of the walls is: " + totalSqFt + " square feet");
        System.out.println("The amount of paint needed is: " + paintNeeded + " gallons");
    }
}
