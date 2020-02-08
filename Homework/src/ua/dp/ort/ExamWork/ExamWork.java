package ua.dp.ort.ExamWork;

import java.util.Arrays;
import java.util.Scanner;

public class ExamWork {

	public static String getUserSymbol(Scanner scanner) {
		String userSymbol;
		return userSymbol = scanner.nextLine();
	}

	public static int getUserInput(Scanner scanner) {
		String userInput = scanner.nextLine();
		return Integer.parseInt(userInput);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please, input symbol from which will be consiste field -> ");
		String fieldView = getUserSymbol(scanner);

		System.out.print("Please, input length -> ");
		int fieldLength = getUserInput(scanner);

		System.out.print("Please, input width -> ");
		int fieldWidth = getUserInput(scanner);

		String[][] array = new String[fieldLength][fieldWidth];

		for (int lines = 0; lines < array.length; lines++) {
			for (int columns = 0; columns < array[lines].length; columns++) {
				array[lines][columns] = fieldView;
				System.out.print(" " + array[lines][columns]);
			}
			System.out.println();
		}
	}
}
