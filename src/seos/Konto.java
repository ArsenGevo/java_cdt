package seos;
//Klassendiagramm Übung - Konto

public class Konto {

	private String kontoinhaber;
	private int kontonummer;
	private double kontostand;

	Konto() {

	}

	public String getKontoinhaber() {
		return kontoinhaber;
	}

	public int getKontonummer() {
		return kontonummer;
	}

	public double getKontostand() {
		return kontostand;
	}

	void setKontoinhaber(String kontoinhaber) {
		if (kontoinhaber != null && !kontoinhaber.isBlank()) {
			this.kontoinhaber = kontoinhaber;
		}
	}

	void setKontonummer(int kontonummer) {
		if (kontonummer > 0) {
			this.kontonummer = kontonummer;
		}
	}

	void setKontostand(double kontostand) {
		if (kontostand >= 0) {
			this.kontostand = kontostand;
		}
	}

	public void einzahlen(double betrag) {
		if (betrag > 0) {
			kontostand = kontostand + betrag;
		}
	}
	
	public boolean abheben(double betrag) {
		if (betrag > 0 && betrag <= kontostand) {
			kontostand = kontostand - betrag;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Konto [kontoinhaber=" + kontoinhaber 
				+ ", kontonummer=" + kontonummer 
				+ ", kontostand=" + kontostand + "]";
	}

	public static void Main(String[] args) {
		Konto meinKonto = new Konto();

		meinKonto.setKontoinhaber("Hevork");
		meinKonto.setKontonummer(000001);
		meinKonto.setKontostand(1_000_000);

		if (meinKonto.abheben(100)) {
			System.out.println("Hier bitte. Ihre Auszahlung");
			System.out.println("Neuer Kontostand: " + meinKonto.getKontostand());
		} else {
			System.out.println("Abgelengt");
		}
	}

}
