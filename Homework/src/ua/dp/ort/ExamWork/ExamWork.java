package ua.dp.ort.ExamWork;

import java.util.Arrays;
import java.util.Scanner;

public class ExamWork {

	public static String getUserInput(Scanner scanner) {
		String userInput;
		return userInput = scanner.nextLine();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please, input symbol from which will be consiste field -> ");
		String fieldView = getUserInput(scanner);

		boolean cycle = true;
		while (cycle) {
			System.out.print("Please, input length -> ");
			String fieldLength = getUserInput(scanner);
			int length = Integer.parseInt(fieldLength);

			if (length < 0) {
				System.out.println("Please, input only positive numbers");
				continue;
			}

			System.out.print("Please, input width -> ");
			String fieldWidth = getUserInput(scanner);
			int width = Integer.parseInt(fieldWidth);

			if (width < 0) {
				System.out.println("Please, input only positive numbers");
				continue;
			}

			String[][] field = new String[length][width];

			for (int lines = 0; lines < field.length; lines++) {
				for (int columns = 0; columns < field[lines].length; columns++) {
					field[lines][columns] = fieldView;
					System.out.print(" " + field[lines][columns]);
				}
				System.out.println();
			}
			cycle = false;
		}
	}
}