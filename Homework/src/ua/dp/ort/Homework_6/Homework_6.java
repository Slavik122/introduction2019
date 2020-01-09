package ua.dp.ort.Homework_6;

import java.util.Scanner;

public class Homework_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double allVolume = 0.0;
		double portions = 0.0;
		double clientVolume = 0.0;

		double volume = 0, fuel = 0, clientVolumeFuel = 0;
		
		boolean Boolean = true;

		while (Boolean) {
			System.out.print("Input overall volume: ");
			String overallVolume = sc.nextLine();
			volume = Double.parseDouble(overallVolume);

			if (volume < 1000) {
				System.out.println("it's less than minimum");
				Boolean = false;
				break;
			} else {
				allVolume = volume;
				break;
			}
		}
		while (Boolean) {
			System.out.print("Input how many milliliters in one portion of fuel: ");
			String fuelPortions = sc.nextLine();
			fuel = Double.parseDouble(fuelPortions);
			fuel = fuel / 1000;
			
			if (fuel < 0) {
				System.out.println("it's can not be negative number");
			} else {
				portions = fuel;
				break;
			}
		}
		while (Boolean) {
			System.out.print("Input your volume: ");
			String clientFuel = sc.nextLine();
			clientVolumeFuel = Double.parseDouble(clientFuel);
			
			if ((clientVolumeFuel < 0) || (clientVolumeFuel > volume)) {
				System.out.println("it's can not be negative number or bigger than minimum");
			} else {
				clientVolume = clientVolumeFuel;
				break;
			}
		}
		System.out.println("The remainder of the total volume " + (allVolume - clientVolume) + " liters");
		System.out.println("Amount of portions " + (clientVolume / portions));
	}
}