package ua.dp.ort.homework5;

import java.util.Scanner;

public class homework5 {

	public static final int COFFEE = 1;
	public static final int PRICECOF = 5;
	public static final int WATER = 2;
	public static final int PRICEWAT = 3;
	public static final int COLA = 3;
	public static final int PRICECOL = 10;
	public static final int PEPSI = 4;
	public static final int PRICEPEP = 10;

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
			if (money < PRICECOF) {
				System.out.println("You don't have enough money");
				return;
			}
			System.out.println("You have bought coffee." + "\n" + "It costs 5 ");
			balance = money - PRICECOF;
			message = "You have left ";
		} else if (choise == WATER) {
			if (money < PRICEWAT) {
				System.out.println("You don't have enough money");
				return;
			}
			System.out.println("You have bought sparkling water." + "\n" + "It costs 3 ");
			balance = money - PRICEWAT;
			message = "You have left money: ";
		} else if (choise == COLA) {
			if (money < PRICECOL) {
				System.out.println("You don't have enough money");
				return;
			}
			System.out.println("You have bought cola." + "\n" + "It costs 10 ");
			balance = money - PRICECOL;
			message = "You have left: ";
		} else if (choise == PEPSI) {
			if (money < PRICEPEP) {
				System.out.println("You don't have enough money");
				return;
			}
			System.out.println("You have bought pepsi." + "\n" + "It costs 10 ");
			balance = money - PRICEPEP;
			message = "You have left: ";
		}
		System.out.println(message + balance);
	}

}
