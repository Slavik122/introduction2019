package ua.dp.ort.homework7_1;

import java.util.Arrays;
import java.util.Scanner;

public class homework7_1 {

	public static void main(String[] args) {
		int counter;
		int amountOfVisits = 0;
		int temp = 0;
		int previous = 0;

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

		if (rotations == 0) {
			System.out.println("Massiv after rotations -> " + Arrays.toString(massiv));
		} else {
			boolean cycle = true;
			while (cycle) {
				for (counter = 0; counter < massiv.length; counter++) {
					previous = massiv[massiv.length - 1];

					for (int counter_2 = 0; counter_2 < massiv.length; counter_2++)
						if ((temp <= massiv[counter_2]) || (temp > massiv[counter_2])) {
							temp = massiv[counter_2];
							massiv[counter_2] = previous;
							previous = temp;
						}
					amountOfVisits++;

					if (rotations == amountOfVisits) {
						cycle = false;
						break;
					}
				}
			}
			System.out.println("Massiv after rotations -> " + Arrays.toString(massiv));
		}
	}
}