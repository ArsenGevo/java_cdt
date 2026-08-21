package cdt;

import java.util.Scanner;

public class ScannerUeb {


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

}


