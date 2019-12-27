package ua.dp.ort.homework5;

import java.util.Scanner;

public class homework5 {

	public static final int COFFEE = 1;
	public static final int PRICE_COFFEE = 5;
	public static final int WATER = 2;
	public static final int PRICE_WATER = 3;
	public static final int COLA = 3;
	public static final int PRICE_COLA = 10;
	public static final int PEPSI = 4;
	public static final int PRICE_PEPSI = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String clientMoney;
		System.out.print("Please enter your money: ");
		clientMoney = scanner.nextLine();
		int money = Integer.parseInt(clientMoney);

		System.out.println("'1' coffee - 5.");
		System.out.println("'2' sparkling water - 3.");
		System.out.println("'3' cola - 10.");
		System.out.println("'4' pepsi - 10.");

		String clientDrink;
		clientDrink = scanner.nextLine();
		int choise = Integer.parseInt(clientDrink);

		String message = null;
		int balance = 0;
		if (choise == COFFEE) {
			balance = money - PRICE_COFFEE;
			if (money >= PRICE_COFFEE) {
				System.out.println("You have bought coffee." + "\n" + "It costs 5 ");
				message = "You have left " + balance;
			} else {
				message = "You don't have enough money";
			}
		} else if (choise == WATER) {
			balance = money - PRICE_WATER;
			if (money >= PRICE_WATER) {
				System.out.println("You have bought sparkling water." + "\n" + "It costs 3 ");
				message = "You have left " + balance;
			} else {
				message = "You don't have enough money";
			}
		} else if (choise == COLA) {
			balance = money - PRICE_COLA;
			if (money >= PRICE_COLA) {
				System.out.println("You have bought cola." + "\n" + "It costs 10 ");
				message = "You have left " + balance;
			} else {
				message = "You don't have enough money";
			}
		} else if (choise == PEPSI) {
			balance = money - PRICE_PEPSI;
			if (money >= PRICE_PEPSI) {
				System.out.println("You have bought pepsi." + "\n" + "It costs 10 ");
				message = "You have left " + balance;
			} else {
				message = "You don't have enough money";
			}
		}
		System.out.println(message);
	}

}
