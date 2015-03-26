public class BandBooster {
    private String name;
    private int boxesSold;

    public BandBooster(String _name) {
	name = _name;
	boxesSold = 0;
    }

    public String getName() {
	return name;
    }

    public void updateSales(int boxes) {
	boxesSold += boxes;
    }

    public String toString() {
	return name + ":\t" + boxesSold;
    }
}
