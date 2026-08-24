package cdt;

import java.util.Scanner;

public class UebVerschalteteIfElse {
	/*
	 * In unserem Buchclub möchten wir nur erwachsene Personen aufnehmen, die älter als 20 Jahre sind. Da der Club nur
auf Einladung zugänglich ist, muss jeder Teilnehmer einen geheimen Code zur Authentifizierung besitzen.
Das automatisierte System soll zuerst nach dem Alter fragen. Wenn die Person älter als 20 Jahre ist, soll
anschließend der geheime Code abgefragt werden. Wenn beide Angaben korrekt sind, wird die Meldung
„Willkommen“ ausgegeben. Andernfalls wird eine Fehlermeldung ausgegeben: entweder „Falscher Code“ oder „Sie
sind zu jung“.
Der geheime Code ist „1234“.
	 */
//static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String code = "1234";
		int mindestAlter = 20;
		
		int benutzerAlter = alterEingabe(scan);
		
		if (benutzerAlter > mindestAlter) {
			String benCode = codeEingabe(scan);
			if (code.equals(benCode)) {
				System.out.println("Willkommen!");
			} else {
				System.out.println("Falscher Code!");
			}
		} else {
			System.out.println("zu Jung!");
		}
		
	}
	
	public static int alterEingabe(Scanner scan) {
		System.out.println("Geben Sie Ihr Alter ein:");
		//Scanner sc = new Scanner(System.in);
		int userAge = scan.nextInt();
		return userAge;
	}
	public static String codeEingabe(Scanner scan) {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie Ihren Code ein:");
		String code = scan.next();
		return code;
		
	}
	

}
