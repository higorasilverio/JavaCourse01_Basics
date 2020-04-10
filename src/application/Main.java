package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Adding two numbers ***");
		System.out.print("Enter the first value to add: ");
		double first = scanner.nextDouble();
		System.out.print("Enter the second value to add: ");
		double second = scanner.nextDouble();
		
		double sum = first + second;
		
		System.out.printf("Sum = %.0f", sum);
		
		scanner.close();
		
	}

}
