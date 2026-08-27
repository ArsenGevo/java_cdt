package cdt;

import java.util.Scanner;

public class Enum {

	public static void main(String[] args) {
		
		enum Status {
			ACTIVE,
			BLOCKED,
			DELETED
		}
		
		//Enum Deklaration und Werte Zuweisung
		Status stat = Status.BLOCKED;
		
		// 1.ZuweisungsVerfahren:
		stat = Status.ACTIVE;
		
		// 2.ZuweisungsVerfahren: String → enum
		stat = Status.valueOf("DELETED");
		System.out.println(stat);
		
		// 3.ZuweisungsVerfahren: eingabe String → enum
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		stat = Status.valueOf(str.toUpperCase());
		
		System.out.println("Enum: " + stat);
		
		//Enum in String Umwandlung
		str = stat.name();
		System.out.println("String: " + str);
		scanner.close();

	}

}
