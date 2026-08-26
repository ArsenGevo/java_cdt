package cdt;

import java.util.Scanner;

public class UebPasswortLange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Erstellen Sie ein Passwort, der mindestens 8 Zeichnen enthält");
		String passwort = scanner.next();

		String ausgabe = passwort.length() >= 8 ? "PW Länge ist genug" : "PW weniger als 8 Zeichnen enthält";
		System.out.println(ausgabe);
		scanner.close();
	}

}
