package cdt;

import java.util.Scanner;

public class UebMonatPruefen {

	/*
	 * TEIL 2: Monatsanalyse: Der Benutzer gibt die Nummer eines Monats ein (1-12 =
	 * Januar-Dezember). Das Programm soll ausgeben, wie viele Tage der
	 * entsprechende Monat hat (31 für Januar, 28 oder 29 für Februar usw.). Falls
	 * die Nummer falsch ist, muss die Fehlermeldung ausgegeben werden. Wenn der
	 * Benutzer den Februar auswählt, soll das Programm zusätzlich nach dem Jahr
	 * fragen und anschließend je nachdem, ob es sich um ein Schaltjahr handelt oder
	 * nicht, 28 oder 29 Tage ausgeben. Ein Jahr ist ein Schaltjahr, wenn es durch
	 * 400 teilbar ist oder durch 4, aber nicht durch 100 teilbar ist.
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie die Nummer des Monats ein (1-12): ");

		int monat = scanner.nextInt();

		if (monat <= 0 || monat > 12) {
			System.out.println("Fehler!");
		} else if (monat == 1 || monat == 3 || monat == 5 || monat == 7 || monat == 8 || monat == 10 || monat == 12) {
			System.out.println("31 Tage");
		} else if (monat == 4 || monat == 6 || monat == 9 || monat == 11) {
			System.out.println("30 Tage");
		} else if (monat == 2) {

			System.out.println("Geben Sie das Jahr ein: ");

			int jahr = scanner.nextInt();

			if (istSchaltJahr(jahr)) {
				System.out.println("29 Tage");
			} else {
				System.out.println("28 Tage");
			}
		}
		
		scanner.close();

	}

	public static boolean istSchaltJahr(int jahr) {
		return (jahr % 4 == 0 && jahr % 100 != 0) || jahr % 400 == 0;
	}

}
