public class Name {
    private String first;
    private String middle;
    private String last;

    public Name(String _first, String _middle, String _last) {
	first = _first;
	middle = _middle;
	last = _last;
    }

    public String getFirst() {
	return first;
    }

    public String getMiddle() {
	return middle;
    }

    public String getLast() {
	return last;
    }

    public String firstMiddleLast() {
	return first + " " + middle + " " + last;
    }

    public String lastFirstMiddle() {
	return last + ", " + first + " " + middle;
    }

    public boolean equals(Name _name) {
	return (first.equals(_name.first) &&
		middle.equals(_name.middle) &&
		last.equals(_name.last));
    }

    public String initials() {
	return first.substring(0, 1).toUpperCase() +
	    middle.substring(0, 1).toUpperCase() +
	    last.substring(0, 1).toUpperCase();
    }
    
    public int length() {
	return first.length() + middle.length() + last.length();
    }
}
