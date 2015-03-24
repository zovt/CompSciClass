public class Dice {
    private int rolls;
    private int sides;

    public Dice (int numSides) {
<<<<<<< HEAD
        rolls = 0;
        sides = numSides;
    }

    public int roll() {
        rolls++;
        return (int) (Math.random()*sides+1);
=======
	rolls = 0;
	sides = numSides;

    }

    public int roll() {
	rolls++;
	return (int) (Math.random()*sides+1);
>>>>>>> 8be6f7cbb23e947bd285de858b08a65023ada379
    }

    public int numRolls() {
        return rolls;
    }

    public void reset () {
        rolls = 0;
    }
}
