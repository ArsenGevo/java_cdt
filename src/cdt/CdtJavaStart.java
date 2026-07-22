package cdt;

import java.util.Scanner;



public class CdtJavaStart {

	public static void main(String[] args) {

		/*
		boolean erg = istZahlPositive();
		System.out.println("ist eingegebene zahl positive? - " + erg);
		*/
		
		/*
		System.out.println(x[3]);
		*/

		int[] meinArray = {1,2,4,8};
		for (int i = 0; i < meinArray.length; i++) {
			System.out.println("meinArray besteht von: " + meinArray[i]);
		}
			
			
		int summe = 0;
		int laenge = meinArray.length; 
		for (int i = 0; i < laenge; i++) {
			summe = summe + meinArray[i];
		}
		
		System.out.println("die Summe von Arrayelementen ist: " + summe);
		
		int letztenElement = meinArray.length - 1;
		System.out.println("letzte Arrayelement ist: " + meinArray[letztenElement]);
		

		
	}

	public static boolean istZahlPositive() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie eine Zahl ein: ");
		int zahl = scanner.nextInt();
		return zahl >= 0;
	}

}