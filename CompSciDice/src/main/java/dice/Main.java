public class Main {
    public static void main(String[] args) {
	Dice d1 = new Dice(92);
	System.out.println(d1.roll());
	System.out.println(d1.numRolls());
	d1.reset();
	System.out.println(d1.numRolls());
    }
}
