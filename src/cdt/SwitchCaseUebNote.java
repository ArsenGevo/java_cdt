package cdt;

import java.util.Scanner;

public class SwitchCaseUebNote {

	public static void main(String[] args) {
		
		notenMeldungChar();

	}

	public static void notenMeldung() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Note (A, B, C, D) ein: ");
		String note = scanner.nextLine().toUpperCase().trim();

		switch (note) {

		case "A":
			System.out.println("Sehr gut");
			break;
		case "B":
			System.out.println("Gut");
			break;
		case "C":
			System.out.println("Befriedigend");
			break;
		case "D":
			System.out.println("Ungenügend");
			break;
		default:
			System.out.println("Falsche Eingabe!");
			break;
		}
		scanner.close();

	}
	
	public static void notenMeldungChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie die Note (A, B, C, D) ein: ");
		char note = scanner.nextLine().toUpperCase().trim().charAt(0);

		switch (note) {

		case 'A':
			System.out.println("Sehr gut");
			break;
		case 'B':
			System.out.println("Gut");
			break;
		case 'C':
			System.out.println("Befriedigend");
			break;
		case 'D':
			System.out.println("Ungenügend");
			break;
		default:
			System.out.println("Falsche Eingabe!");
			break;
		}
		scanner.close();
	}
	
	
}



