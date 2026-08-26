package cdt;
import java.util.Scanner;
public class SwitchCaseUeb {

	public static void main(String[] args) {
		kaffeeMachen();
	}

	public static void kaffeeMachen() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Nummer von Getränk ein: ");
		int choise = scanner.nextInt();

		switch (choise) {

		case 1:
			System.out.println("Espresso");
			break;
		case 2:
			System.out.println("Cappucinno");
			break;
		case 3:
			System.out.println("Latte");
			break;
		default:
			System.out.println("Getränk nicht verfügbar!");
			break;
		}
		scanner.close();
	}

}
