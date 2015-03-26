import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter first, middle, and last names of person 1: ");
	Name name1 = new Name(scan.next(), scan.next(), scan.next());

	System.out.print("Enter first, middle, and last names of person 2: ");
	Name name2 = new Name(scan.next(), scan.next(), scan.next());

	System.out.println(name1.firstMiddleLast());
	System.out.println(name1.lastFirstMiddle());
	System.out.println(name1.initials());
	System.out.println(name1.length());

	System.out.println(name2.firstMiddleLast());
	System.out.println(name2.lastFirstMiddle());
	System.out.println(name2.initials());
	System.out.println(name2.length());

	if (name1.equals(name2))
	    System.out.println("Names are equal.");
	else
	    System.out.println("Names aren't equal.");
    }
}

			      
			      
	
	
	
    
