package cdt;
import java.util.Scanner;

public class UebSchaltjahr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben sie ein Jahr ein, dann prüfe ich ob es ein Schaltjahr ist");
		int jahr = scanner.nextInt();
		
		boolean istSchalt = istSchaltJahr(jahr);
		
		if (istSchalt == true) {
			System.out.println("Es ist ein Schaltjahr.");
		} else {
			System.out.println("Es ist kein Schaltjahr.");
		}
		
	}
	
	public static boolean istSchaltJahr(int jahr) {
		return jahr % 4 == 0 && jahr % 100 != 0 || jahr % 400 == 0;
	}

}
