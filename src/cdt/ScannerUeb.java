package cdt;

import java.util.Scanner;

public class ScannerUeb {

	/*
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("Введите возраст:");
		//int age = Integer.parseInt(scanner.nextLine());

		//Этот вариант часто удобнее:

		System.out.println("Введите имя:");
		String name = scanner.nextLine();
		System.out.println("Введите возраст:");
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("Введите цену:");
		double price = Double.parseDouble(scanner.nextLine());
		System.out.println(name + age + price);


	}
*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите целое число:");
		if (scanner.hasNextInt()) {
			int zahl = scanner.nextInt();
			System.out.println("Вы ввели: " + zahl);
		} else {
			System.out.println("Ошибка: нужно ввести целое число.");
		}
		scanner.close();
	}
}

}
