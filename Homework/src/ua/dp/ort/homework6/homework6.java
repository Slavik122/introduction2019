package ua.dp.ort.homework6;

import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double allVolume = 0.0;
		double portions = 0.0;
		double clientVolume = 0.0;
		while (true) {
			System.out.print("Input overall volume: ");
			String overallVolume;
			overallVolume = sc.nextLine();
			double volume = Double.parseDouble(overallVolume);

			if (volume < 0) {
				System.out.println("it's can not be negative number");
			} else {
				allVolume = volume;
				break;
			}
		}
		while (true) {
			System.out.print("Input how many milliliters in one portion of fuel: ");
			String fuelPortions;
			fuelPortions = sc.nextLine();
			double fuel = Double.parseDouble(fuelPortions);
			fuel = fuel / 1000;
			if (fuel < 0) {
				System.out.println("it's can not be negative number");
			} else {
				portions = fuel;
				break;
			}
		}
		while (true) {
			System.out.print("Input your volume: ");
			String clientaFuel;
			clientaFuel = sc.nextLine();
			double clientFuel = Double.parseDouble(clientaFuel);
			if (clientFuel < 0) {
				System.out.println("it's can not be negative number");
			} else {
				clientVolume = clientFuel;
				break;
			}
		}
		System.out.println("The remainder of the total volume " + (allVolume - clientVolume) + " liters");
		System.out.println("Amount of portions " + (clientVolume / portions));
	}
}