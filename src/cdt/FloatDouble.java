package cdt;

public class FloatDouble {
	
	public static void main(String[] args) {
		
		rechnen();
		zeigeGrenze();
				
	}
	
	public static void rechnen() {
		
		int intZahl = 5;
		double doubleZahl = 5;
		float floatZahl = 5f;
		
		System.out.println(intZahl);
		System.out.println(doubleZahl);
		System.out.println(floatZahl);
		System.out.println(" ");
		
		System.out.println(intZahl / 3);
		System.out.println(doubleZahl / 3);
		System.out.println(floatZahl / 3);
		
		System.out.println(" ");
		
		double gross = 234d * 1000000000;
		System.out.println("gross = " + gross);
		
		/* 
		 * FEHLER: double gross = 234 * 1000000000;
		 * zu beheben: 234d oder 234.0
		 */
		
		System.out.println(" ");
		
		double klein = 234.0 / 1000000000;
		System.out.println("klein = " + klein);
		
		System.out.println(" ");
		
		
	}
	
	public static void zeigeGrenze() {
		
		System.out.println("Float:");
		System.out.print("± " + Float.MIN_VALUE);
		System.out.print(" ... ");
		System.out.println(Float.MAX_VALUE);
		
		System.out.println("Double:");
		System.out.print("± " + Double.MIN_VALUE);
		System.out.print(" ... ");
		System.out.println(Double.MAX_VALUE);
		
	}
	

}
