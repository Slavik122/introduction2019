package ua.dp.ort.homework7;

import java.util.Arrays;
import java.util.Scanner;

public class homework7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int userArray[] = new int[20];

		String userInput;
		int sumEvenNumbers = 0;
		int average = 0;
		int amountEvenNumbers = 0;
		int counter;

		for (counter = 0; counter < userArray.length;counter++) {
			System.out.print("Number for array[" + counter + "] -> ");
			userInput = scanner.nextLine();
			int numberForArray = Integer.parseInt(userInput);

			userArray[counter] = numberForArray;
		}
		
//		1)
		
		for (counter = 0; counter < userArray.length; counter++) {

			if ((userArray[counter] % 2 == 0) && (userArray[counter] > 0)) {
				sumEvenNumbers = sumEvenNumbers + userArray[counter];
			}
			
//			2)
			
			if (userArray[counter] > 0) {
				amountEvenNumbers++;
				average = average + userArray[counter];
			}

		}
		
		System.out.println("Sum of all even numbers is -> " + sumEvenNumbers);
		
		System.out.println("Average of all positive numbers is -> " + average / amountEvenNumbers);

//		3)

		int min_1 = 999999;
		int min_2 = 999999;

		for (counter = 0; counter < userArray.length; counter++) {
			if (min_1 > userArray[counter]) {
				min_1 = userArray[counter];
			}
		}
		for (counter = 0; counter < userArray.length; counter++) {
			if (userArray[counter] > min_1 && userArray[counter] < min_2) {
				min_2 = userArray[counter];
			}
		}

		System.out.println("Minimum number is -> " + min_1 + ", " + min_2);
		
//		4)

		int minimalNumber = userArray[0];
		int minimalCounter = 0;

		for (counter = 1; counter < userArray.length; counter++) {
			if (minimalNumber > userArray[counter]) {
				minimalNumber = userArray[counter];
				minimalCounter++;
			}
		}

		int maximalNumber = userArray[0];
		int maximalCounter = 0;

		for (counter = 1; counter < userArray.length; counter++) {
			if (maximalNumber < userArray[counter]) {
				maximalNumber = userArray[counter];
				maximalCounter++;
			}
		}
		
		int temp = userArray[minimalCounter];
		userArray[minimalCounter] = userArray[maximalCounter];
		userArray[maximalCounter] = temp;
		
		System.out.println("Array where minimal and maximal numbers changed places -> " + Arrays.toString(userArray));

//		5)

		int sizeArray = userArray.length;

		for (int counter_1 = 0; counter_1 < sizeArray / 2; counter_1++) {
			int tempArray = userArray[counter_1];
			userArray[counter_1] = userArray[sizeArray - 1 - counter_1];
			userArray[sizeArray - 1 - counter_1] = tempArray;
		}
		
		System.out.println("Array after reverse: " + Arrays.toString(userArray));

//		6)

		int counterNegativeNumbers = 0;

		for (counter = 0; counter < userArray.length; counter++) {
			if (userArray[counter] < 0) {
				counterNegativeNumbers++;
			}
		}

		int[] negativeNumbersArray = new int[counterNegativeNumbers];
		int index_1 = 0;

		for (counter = 0; counter < userArray.length; counter++) {
			if (userArray[counter] < 0) {
				negativeNumbersArray[index_1] = userArray[counter];
				index_1++;
			}
		}

		int counterPositiveNumbers = 0;
		for (counter = 0; counter < userArray.length; counter++) {
			if (userArray[counter] > 0) {
				counterPositiveNumbers++;
			}
		}

		int[] positiveNumbersArray = new int[counterPositiveNumbers];
		int index_2 = 0;

		for (counter = 0; counter < userArray.length; counter++) {
			if (userArray[counter] > 0) {
				positiveNumbersArray[index_2] = userArray[counter];
				index_2++;
			}
		}
		System.out.println("All negative numbers from first array " + Arrays.toString(negativeNumbersArray));
		System.out.println("All positive numbers from first array " + Arrays.toString(positiveNumbersArray));
	}
}