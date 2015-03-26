public class BiasedCoin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private double bias;
    
    private int face;

    public BiasedCoin() {
	bias = 0.5;
	flip();
    }

    public BiasedCoin(double _bias) {
	if ((_bias > 1.0) || (_bias < 0.0)) {
	    System.out.println("Bias not in range. Defaulting to 0.5");
	    bias = 0.5;
	} else {
	    bias = _bias;
	}
	flip();
    }

    public void flip() {
	face = (Math.random() < bias) ? HEADS : TAILS;
    }

    public boolean isHeads() {
	return (face == HEADS);
    }
}
