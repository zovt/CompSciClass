public class Main {
    public static void main(String[] args) {
	Dice myDice = new Dice();
	
	for(int i = 0; i < 100; i++) {
	    System.out.println(myDice.roll());
	}
    }
}
