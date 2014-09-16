public class Main {
    public static void main(String[] args) {
<<<<<<< HEAD
	Dice d1 = new Dice(20);
=======
	Dice d1 = new Dice(92);
>>>>>>> 8be6f7cbb23e947bd285de858b08a65023ada379
	System.out.println(d1.roll());
	System.out.println(d1.numRolls());
	d1.reset();
	System.out.println(d1.numRolls());
<<<<<<< HEAD

	int secret = 12;
	int roll = 0;
	while(roll != secret) {
	    roll = d1.roll();
	}
	
	System.out.println(d1.numRolls());
=======
>>>>>>> 8be6f7cbb23e947bd285de858b08a65023ada379
    }
}
