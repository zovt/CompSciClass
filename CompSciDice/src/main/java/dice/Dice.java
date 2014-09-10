public class Dice {
    private int rolls;
    private int sides;

    public Dice (int numSides) {
	rolls = 0;
	sides = numSides;

    }

    public int roll() {
	rolls++;
	return (int) (Math.random()*sides+1);
    }

    public int numRolls() {
	return rolls;
    }

    public void reset () {
	rolls = 0;
    }
}
