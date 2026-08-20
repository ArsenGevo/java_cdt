package cdt;

public class Methoden {

	public static void main(String[] args) {
		// Methode sagWas aufrufen u. String Wert als Argumenten vergeben
		sagWas("Hallo");
		
		// Methode aboutJavaInsel aufrufen
		aboutJavaInsel();

		// Methode summe aufrufen u. Variablen als Argumenten vergeben
		int a = 4;
		int b = 5;
		int s = summe(a, b);
		System.out.println(s);

	}

	public static void sagWas(String was) {

		System.out.println(was);

	}

	public static int summe(int a, int b) {
		return a + b;
	}

	public static void aboutJavaInsel() {
		System.out.println("Die Insel Java:");
		System.out.println("- Gehört zu Indonesien.");
		System.out.println("- Auf Java entstanden die Königreiche Mataram, Majapahit und Demak.");
		System.out.println("- Java ist die bevölkerungsreichste Insel der Welt.");
		System.out.println("- Einwohnerzahl: ca. 157 Millionen Menschen.");
		System.out.println("- Bevölkerungsdichte: ca. 1.180 Einwohner pro km2.");
		System.out.println("- Auf Java wird eine der bekanntesten Kaffeespezialitäten der Welt produziert: Kopi Luwak.");

	}

}
