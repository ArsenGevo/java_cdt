package cdt;

public class Boolean {

	public static void main(String[] args) {

		boolAusgeben();

		int zahl = 37;
		istGeradeAusgeben(zahl);

		zahl = 44;
		istGeradeAusgeben(zahl);

	}

	public static void boolAusgeben() {

		int alter = 12;
		boolean istVolljarig = checkAlter(alter);
		System.out.println("ist man volljarig?: " + istVolljarig);

	}

	public static boolean checkAlter(int alt) {

		return alt > 18;

	}

	public static boolean istGeradePrufen(int z) {

		return z % 2 == 0;

	}

	public static void istGeradeAusgeben(int z) {

		System.out.println("die Zahl " + z + " ist gerade: " + istGeradePrufen(z));

	}

}
