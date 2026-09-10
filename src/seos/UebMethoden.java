package seos;

import java.util.Scanner;

public class UebMethoden {

	public static void main(String[] args) {
		
		int[] zahlen = werteEingabe();
		
		int summe = summeVonArray(zahlen);
		
		ausgabe(summe);
		
		int[] zahlenVerdoppelt = arrayVerdoppeln(zahlen);
		
		ausgabe(zahlen);
		ausgabe(zahlenVerdoppelt);

	}

	public static int[] werteEingabe() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Geben si Anzahl der Werte ein!");

		int[] arr = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Geben Sie " + i + " element von Array");
			arr[i] = sc.nextInt();
		}

		sc.close();

		return arr;

	}

	public static int summeVonArray(int[] arr) {

		int summe = 0;

		for (int i = 0; i < arr.length; i++) {

			summe = summe + arr[i];
		}
		return summe;
	}

	public static void ausgabe(int summe) {

		System.out.println("Die Summe des Arrays = " + summe);
	}

	public static void ausgabe(int[] arr) {

		//System.out.println("Array = ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print("[" + arr[i] + "]");
		}
		System.out.println("");
	}
	
	public static int[] arrayVerdoppeln(int[] arr) {
		
		// !!! Wichtig neuen Array zu erstellen!!!
		int[] array2 = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {

			array2[i] = arr[i] * 2;
		}
		return array2;
	}

}
