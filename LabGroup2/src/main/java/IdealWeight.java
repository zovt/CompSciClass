import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) {
        int feet, inches, idealWeightMale, idealWeightFemale;
        Scanner input = new Scanner(System.in);
        System.out.print("What is the feet portion of your height: ");
        feet = input.nextInt();
        System.out.print("What is the inches portion of your height: ");
        inches = input.nextInt();
        inches = inches + feet*12;
        idealWeightMale = 106 + 6 * (inches-5*12);
        idealWeightFemale = 100 + 5 * (inches-5*12);
        System.out.println("The ideal weight for a male of this height is between " + idealWeightMale*0.85 + " and " + idealWeightMale*1.15);
        System.out.println("The ideal weight for a female of this height is between " + idealWeightFemale*0.85 + " and " + idealWeightFemale*1.15);
    }
}
