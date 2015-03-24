import java.util.Scanner;
public class LabGrade {
    public static void main(String[] args) {
        // Declare Constants
        double inWeight;
        double outWeight;

        // Declare Variables
        double preLabPts; //number of points earned on the pre-lab assignment
        double preLabMax; //maximum number of points possible for pre-lab
        double labPts; // maximum number of points earned on the lab
        double labMax; // maximum number of points possible for the lab
        double postLabPts; // number of points earned on post lab
        double postLabMax; // maximum number of points possble
        double outClassAvg, inClassAvg;
        double labGrade;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        postLabMax = scan.nextInt();
        System.out.print("Enter the in-class work weight in decimal form: ");
        inWeight = scan.nextDouble();
        System.out.println();

        //Calculato the average for the out of class work
        outClassAvg = ((preLabPts + postLabPts) / (preLabMax + postLabMax)) * 100.00;

        // In class average
        inClassAvg = (labPts / labMax) * 100.00;
        outWeight = 1 - inWeight;

        // weighted average
        labGrade = outWeight * outClassAvg + inWeight * inClassAvg;

        //Print Results
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
        System.out.println("Your average on in-class work is " + inClassAvg + "%");
        System.out.println("Your lab grade is " + labGrade + "%");
    }
}
