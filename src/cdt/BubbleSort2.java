package cdt;

import java.util.Arrays;

public class BubbleSort2 {

	public BubbleSort2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arra = { 3, 1, 4, 6, 3, 23, 54, 2, 5 };
		
		int temp = 0;
		
		for (int step = 0; step < arra.length - 1; step++) {

			for (int i = 0; i < arra.length - 1 - step; i++)

				if (arra[i] > arra[i + 1]) {
					
					temp = arra[i + 1];
					arra[i + 1] = arra[i];
					arra[i] = temp;

				}
		}
		System.out.print(Arrays.toString(arra));
	}

}
