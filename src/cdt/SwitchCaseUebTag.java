package cdt;

import java.util.Scanner;

public class SwitchCaseUebTag {

	public static void main(String[] args) {
		
		wochenTagMeldung();

	}

	public static void wochenTagMeldung() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Nummer des Wochentages (von 1 bis 7) ein: ");
		int tagNr = scanner.nextInt();

		switch (tagNr) {

		case 1:
			System.out.println("Montag");
			break;
		case 2:
			System.out.println("Dienstag");
			break;
		case 3:
			System.out.println("Mittwoch");
			break;
		case 4:
			System.out.println("Donnerstag");
			break;
		case 5:
			System.out.println("Freitag");
			break;
		case 6:
			System.out.println("Samstag");
			break;
		case 7:
			System.out.println("Sonntag");
			break;
		default:
			System.out.println("Falsche Eingabe!");
			break;

		}
		scanner.close();

	}

}
