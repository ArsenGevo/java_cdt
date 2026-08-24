package cdt;

import java.util.Scanner;

public class StringVergleichenUebPasswort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pw = "1234";
		
		String pwIn = passwortEingabe();

		boolean check = passCheck(pw, pwIn);
		
		pwAusgabe(check);
	}
	
	public static boolean passCheck(String a, String b) {
		return a.equals(b);		
	}
	public static String passwortEingabe() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Geben Sie Passwort ein");
		String pwIn = sc.next();
		return pwIn;
	}
	public static void pwAusgabe(boolean check) {
		if (check == true) {
			System.out.println("Eingabe erfoderlich!");
		} else {
			System.out.println("Passwort ist Falsch!");
		}
		
	}
	

}
