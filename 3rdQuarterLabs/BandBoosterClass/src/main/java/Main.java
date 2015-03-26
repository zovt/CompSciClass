import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	System.out.print("First student's name: ");
	BandBooster booster1 = new BandBooster(scan.next());

	System.out.print("Second student's name: ");
	BandBooster booster2 = new BandBooster(scan.next());

	for(int i = 1; i <= 3; i++) {
	    System.out.print("Enter " + booster1.getName() + "'s sales for week " + i);
	    booster1.updateSales(scan.nextInt());
	    
	    System.out.print("Enter " + booster2.getName() + "'s sales for week " + i);
	    booster2.updateSales(scan.nextInt());
	}

	System.out.println("Sales Report\n==========\n");
	System.out.println(booster1);
	System.out.println(booster2);
    }
}

	
	    
	
	    
	    
	    
	
