package cdt;
import java.util.Scanner;
public class UebSchleife {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int z = 0;
		
		
		System.out.println("Geben sie richtige Zahl ein!");

		
		do {			
			    System.out.println("1. Hallo sagen");
	            System.out.println("2. Zufallszahl anzeigen");
	            System.out.println("3. Beenden");
	            System.out.print("Ihre Auswahl: ");
	            System.out.println();
			
			 //z = scanner.nextInt();
			 
			 if (scanner.hasNextInt()) {
	                z = scanner.nextInt();
	            } else {
	                System.out.println("Bitte geben Sie eine Zahl ein!");
	                System.out.println("");
	                scanner.nextLine();
	                continue;
	            }
			 
			 
			if (z == 1) {
				
				System.out.println("Hallo!");
				
			} else if (z == 2) {
				
				System.out.println("Zufallszahl = " + Math.random() );
				
			} else if (z == 3) {
				
				 System.out.println("Programm wird beendet.");
				
			} else {
				
				System.out.println("Ungültige Eingabe!");
				
			}
			
			System.out.println();
			
		} while (z != 3);
		
		scanner.close();
	}
	
	/*
	
	*/

}
