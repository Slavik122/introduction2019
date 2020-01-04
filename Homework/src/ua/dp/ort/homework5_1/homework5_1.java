package ua.dp.ort.homework5_1;

import java.util.Scanner;

public class homework5_1 {

	public static final double A_95 = 25.24;
	public static final double A_92 = 21.35;
	public static final double GAS = 11.25;
	public static final double DIESEL_FUEL = 18.44;

	public static final int FUEL_1 = 1;
	public static final int FUEL_2 = 2;
	public static final int FUEL_3 = 3;
	public static final int FUEL_4 = 4;

	public static final double DISCOUNT_1 = 0.5;
	public static final double DISCOUNT_2 = 1;
	public static final double DISCOUNT_3 = 2;
	public static final double DISCOUNT_4 = 4;
	public static final double DISCOUNT_5 = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userFuel;
		System.out.println(
				"Choose fuel" + "\n" + "1 - 95" + "\n" + "2 - 92" + "\n" + "3 - Gas" + "\n" + "4 - Diesel fuel");
		userFuel = scanner.nextLine();
		int fuel = Integer.parseInt(userFuel);

		String userMoney;
		double volumeFuel;
		if (fuel == FUEL_1) {
			System.out.println("This fuel cost - " + A_95);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / A_95 * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = A_95 * (DISCOUNT_1 / 100);
				discountPrice = A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_1);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = A_95 * (DISCOUNT_2 / 100);
				discountPrice = A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_2);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = A_95 * (DISCOUNT_3 / 100);
				discountPrice = A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_3);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = A_95 * (DISCOUNT_4 / 100);
				discountPrice = A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_4);
			} else if (volumeFuel > 500) {
				discount = A_95 * (DISCOUNT_5 / 100);
				discountPrice = A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_5);
			}
		} else if (fuel == FUEL_2) {
			System.out.println("This fuel cost - " + A_92);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / A_92 * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = A_92 * (DISCOUNT_1 / 100);
				discountPrice = A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_1);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = A_92 * (DISCOUNT_2 / 100);
				discountPrice = A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_2);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = A_92 * (DISCOUNT_3 / 100);
				discountPrice = A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_3);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = A_92 * (DISCOUNT_4 / 100);
				discountPrice = A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_4);
			} else if (volumeFuel > 500) {
				discount = A_92 * (DISCOUNT_5 / 100);
				discountPrice = A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_5);
			}
		} else if (fuel == FUEL_3) {
			System.out.println("This fuel cost - " + GAS);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / GAS * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = GAS * (DISCOUNT_1 / 100);
				discountPrice = GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_1);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = GAS * (DISCOUNT_2 / 100);
				discountPrice = GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_2);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = GAS * (DISCOUNT_3 / 100);
				discountPrice = GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_3);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = GAS * (DISCOUNT_4 / 100);
				discountPrice = GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_4);
			} else if (volumeFuel > 500) {
				discount = GAS * (DISCOUNT_5 / 100);
				discountPrice = GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_5);
			}
		} else if (fuel == FUEL_4) {
			System.out.println("This fuel cost - " + DIESEL_FUEL);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / DIESEL_FUEL * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = DIESEL_FUEL * (DISCOUNT_1 / 100);
				discountPrice = DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_1);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = DIESEL_FUEL * (DISCOUNT_2 / 100);
				discountPrice = DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_2);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = DIESEL_FUEL * (DISCOUNT_3 / 100);
				discountPrice = DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_3);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = DIESEL_FUEL * (DISCOUNT_4 / 100);
				discountPrice = DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_4);
			} else if (volumeFuel > 500) {
				discount = DIESEL_FUEL * (DISCOUNT_5 / 100);
				discountPrice = DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_5);
			}
		}

		scanner.close();
	}

}
