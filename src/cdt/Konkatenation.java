package cdt;

public class Konkatenation {
	
	//Methodenüberladung (Overloading)

	public static void main(String[] args) {

		concatenate();
		concatenate("1 ");
		concatenate("1 ", "2 ");
		concatenate("1 ", "2 ", "3 ");
		concatenate("1 ", "2 ", "3 ", "4 ");
		concatenate("1 ", "2 ", "3 ", "4 ", "5 ");

	}
	
	/*
	 * Das Interessante ist: alle Methoden dürfen denselben Namen ausgeben haben, 
	 * weil sie unterschiedlich viele Parameter besitzen. 
	 * Das nennt man Methodenüberladung (Overloading).
	 */

	public static void concatenate() {

		System.out.println("leer");

	}
	
	public static void concatenate(String a) {

		System.out.println(a);

	}
	
	public static void concatenate(String a, String b) {

		System.out.println(a + b);

	}
	
	public static void concatenate(String a, String b, String c) {

		System.out.println(a + b + c);

	}
	
	public static void concatenate(String a, String b, String c, String d) {

		System.out.println(a + b + c + d);

	}
	
	public static void concatenate(String a, String b, String c, String d, String e) {

		System.out.println(a + b + c + d + e);

	}

}
