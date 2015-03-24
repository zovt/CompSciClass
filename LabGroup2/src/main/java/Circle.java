import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        int radius;
        System.out.print("Input a radius: ");
        radius = input.nextInt();

        double area1 = PI * radius * radius;
        double circumference1 = PI * 2 * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area1);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference1);

        radius = radius*2;

        double area2 = PI * radius * radius;
        double circumference2 = PI * 2 * radius;

        System.out.println("The area of a circle with radius " + radius +
                " is " + area2);
        System.out.println("The circumference of a circle with radius " + radius +
                " is " + circumference2);

        double areaRatio = area2/area1;
        double circumferenceRatio = circumference2/circumference1;

        System.out.println("The ratio of area2 to area1 is " + areaRatio);
        System.out.println("The ratio of circumference2 to circumference1 is " + circumferenceRatio);
    }
}
