import java.io.*;
public class Grades {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What grade did you get: ");
        int grade = 0;
        try {
            grade = Integer.parseInt(br.readLine());
        } catch(NumberFormatException nfe) {
            System.out.println("That isn't a number");
        }
        System.out.print("You get a");
        if(grade < 70) {
            System.out.print("n F");
        } else if (grade < 78) {
            System.out.print(" D");
        } else if (grade < 86) {
            System.out.print(" C");
        } else if (grade < 90) {
            System.out.print(" B");
        } else {
            System.out.print("n A");
        }
    }
}
