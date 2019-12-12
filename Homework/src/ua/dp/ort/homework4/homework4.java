package ua.dp.ort.homework4;

import java.util.Scanner;

public class homework4 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
//		1)
//		String userInput;
//		System.out.println("Input number for side a: ");
//		userInput = num.nextLine();
//		int a = Integer.parseInt(userInput);
//
//		System.out.println("Input number for side b: ");
//		userInput = num.nextLine();
//		int b = Integer.parseInt(userInput);
//
//		int result = a * b;
//		System.out.println("Your result = " + result);

//		2)
		String analyzer;
		System.out.println("Input random number a:");
		analyzer = num.nextLine();
		int number1 = Integer.parseInt(analyzer);

		System.out.println("Input random number b:");
		analyzer = num.nextLine();
		int number2 = Integer.parseInt(analyzer);

		if (number1 == number2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println("numbers are different");
		}

		if (number1 > number2) {
			System.out.println("number a is greater than number b");
		}
		if (number1 < number2){
			System.out.println("number a are less than number b");
		}

		if (number1 >= number2) {
			System.out.println("number a is greater or equal number b");
		} 
		if (number1 <= number2){
			System.out.println("number a are less or equal number b");
		}

//		3)
//		String input;
//		System.out.println("Input length of figure:");
//		input = num.nextLine();
//		int length = Integer.parseInt(input);
//
//		System.out.println("Input width of figure :");
//		input = num.nextLine();
//		int width = Integer.parseInt(input);
//
//		if (length > width) {
//			System.out.println("It's reqtangle");
//		}
//
//		if (length < width) {
//			System.out.println("It's reqtangle too");
//		}
//
//		if (length == width) {
//			System.out.println("It's square");
//		}

	}

}
