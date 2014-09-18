import java.util.Scanner;

public class GuessMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = (int)(Math.random()*100)+1;
        int guess = 0;
        System.out.print("Guess a number: ");
        guess = sc.nextInt();
        while(guess != secret) {
            System.out.println("Guess again");
            guess = sc.nextInt();
        }
        System.out.println("You win!");
    }
}
