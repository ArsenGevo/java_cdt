package cdt;

public class ZweiDemArray {

	public ZweiDemArray() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		int[][] zwDemArr = new int[3][4];
		
		for (int zeile = 0; zeile < zwDemArr.length; zeile++) {
			
			for (int spalte = 0; spalte < zwDemArr[zeile].length; spalte++) {
				
				zwDemArr[zeile][spalte] = 1;
				
			}
			
		}
			
		
	}

}
