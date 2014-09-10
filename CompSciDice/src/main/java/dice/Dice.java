public class Dice {
    private int rolls;

    public Dice () {
	rolls = 0;

    }

    public int roll() {
	rolls++;
	return (int) (Math.random()*6+1);
    }

    public int numRolls() {
	return rolls;
    }

    public void reset () {
	rolls = 0;
    }
}
