package cdt;

import java.util.Scanner;

public class UebUmsatz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Geben Sie Umsatz ein");

		double ums = sc.nextDouble();
		
		double bon = bonusRechn(ums);
		
		System.out.println("Ihr Bonus = " + bon);

	}

	public static double bonusRechn(double ums) {

		double bonus = 0;

		if (ums <= 1000) {

			bonus = 100;

		} else if (ums > 1000 && ums <= 2000) {

			bonus = 200;
		}

		else if (ums > 2000 && ums <= 3000) {

			bonus = 300;
			
		} else {

			bonus = 500;
		}
		
		return bonus;

	}
}
