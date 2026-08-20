package cdt;

public class TypUmwandlung {

	public static void main(String[] args) {

		// int to long
		int a = 15;
		long b = a;
		System.out.println(b);

		// long to int - Fehler: zurückzählen
		b = 3_000_000_000l;
		a = (int) b;
		System.out.println(a);

	}

	
}

