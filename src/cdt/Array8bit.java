package cdt;

import java.util.Arrays;

public class Array8bit {

	public static void main(String[] args) {
	// TODO Auto-generated method stub


	int zahl = 1;
	
	int[] zahlen = new int[8];
	
	for (int i=0; i < zahlen.length; i++) {
		zahlen[i] = zahl;
		zahl = zahl * 2;		
	}
	
	System.out.print(Arrays.toString(zahlen));

}
}