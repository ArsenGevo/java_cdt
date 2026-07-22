package cdt;


public class BubbleSort {

	public BubbleSort() {
		// TODO Auto-generated constructor stub
	}
	


		public static void main(String[] args) {

		int[] werte = {5, 3, 8, 2};

		for (int durchlauf = 0; durchlauf < werte.length - 1; durchlauf++) {

		for (int i = 0; i < werte.length - 1 - durchlauf; i++) {

		if (werte[i] > werte[i + 1]) {

		                    int temp = werte[i];
		                    werte[i] = werte[i + 1];
		                    werte[i + 1] = temp;
		                }
		            }
		        }
		for (int wert : werte) {
		            System.out.print(wert + " ");
		        }
		    }



}
