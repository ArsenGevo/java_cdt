package cdt;

import java.util.Scanner;

public class UebVerschalteteIfElse {

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
