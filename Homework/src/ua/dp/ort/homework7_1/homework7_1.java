package ua.dp.ort.homework7_1;

import java.util.Arrays;
import java.util.Scanner;

public class homework7_1 {

	public static void main(String[] args) {
		int counter;
		int amountOfVisits = 0;
		
		Scanner scanner = new Scanner(System.in);

		String userInput;
		
		System.out.print("Please input massiv's length -> ");
		userInput = scanner.nextLine();
		int size = Integer.parseInt(userInput);

		int[] massiv = new int[size];

		for (counter = 0; counter < massiv.length; counter++) {
			System.out.print("Input number for massiv" + "[" + counter + "]" + "-> ");
			userInput = scanner.nextLine();
			int numberForMassiv = Integer.parseInt(userInput);
			massiv[counter] = numberForMassiv;
		}
		System.out.println("Massiv before rotations " + Arrays.toString(massiv));

		System.out.print("Please input amount of rotations -> ");
		userInput = scanner.nextLine();
		int rotations = Integer.parseInt(userInput);

		boolean cycle = true;
		while (cycle) {
			for (counter = massiv.length - 1; counter <= massiv.length - 1; counter--) {
				int temp = massiv[counter];
				massiv[counter] = massiv[massiv.length - 1 - counter];
				massiv[massiv.length - 1 - counter] = temp;
				amountOfVisits++;

				if (rotations == amountOfVisits) {
					cycle = false;
					break;
				}
			}
		}
		System.out.println("Massiv after all rotations -> " + Arrays.toString(massiv));

	}

}