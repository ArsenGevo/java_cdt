package cdt;

import java.util.Random;
import java.util.Scanner;

public class Ueb2dArray {
	
	public static void main(String[] args) {

		int array[][] = arrayInit();
		
		//arrayWerteEingeben(array);
		
		arrayWerteRandom(array);
		
		//arrayAusgeben(array);
		
		arrayMatrixAusgeben(array);

	}

	public static void arrayAusgeben(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.println("array[" + i + "][" + j + "] " + array[i][j]);
				
				
				
			}
			
		}
	}
	
	public static void arrayMatrixAusgeben(int array[][]) {
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {

				if (j + 1 < array[i].length) {
					System.out.print(array[i][j] + " ");
				} else {
					
					System.out.print(array[i][j] + " \n");
					
				}
	
			}
			
		}
	}

	public static int[][] arrayWerteEingeben(int array[][]) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				
				

				System.out.println("Geben Sie den Wert des Arrays Zeile " + i + " Spalte " + j + " ein: ");
				
				int wert = sc.nextInt();
				
				array[i][j] = wert;
				
			}
		}
		sc.close();
		return array;
	}
	
	public static int[][] arrayWerteRandom(int array[][]) {
		Random r = new Random();

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = r.nextInt(10);

			}
		}
		return array;
	}
	
	public static int[][] arrayInit() {
		Scanner scanner = new Scanner(System.in);
		
		int columns = 0;
		int rows = 0;
		
		System.out.println("Geben Sie die Zahl von Zeilen des Arrays ein:");
		columns = scanner.nextInt();
		
		System.out.println("Geben Sie die Zahl von Spalten des Arrays ein:");
		rows = scanner.nextInt();
		
		scanner.close();
		
		int array[][] = new int[columns][rows];
		
		return array;

	}



}
