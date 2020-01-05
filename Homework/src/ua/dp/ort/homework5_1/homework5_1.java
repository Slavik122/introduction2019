package ua.dp.ort.homework5_1;

import java.util.Scanner;

public class homework5_1 {

	public static final double PRICE_A_95 = 25.24;
	public static final double PRICE_A_92 = 21.35;
	public static final double PRICE_GAS = 11.25;
	public static final double PRICE_DIESEL_FUEL = 18.44;

	public static final int NUMBER_A_95 = 1;
	public static final int NUMBER_A_92 = 2;
	public static final int NUMBER_GAS = 3;
	public static final int NUMBER_DIESEL_FUEL = 4;

	public static final double DISCOUNT_FROM_10_TO_20_LITERS = 0.5;
	public static final double DISCOUNT_FROM_20_TO_50_LITERS = 1;
	public static final double DISCOUNT_FROM_50_TO_100_LITERS = 2;
	public static final double DISCOUNT_FROM_100_TO_500_LITERS = 4;
	public static final double DISCOUNT_MORE_THAT_500_LITERS = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String userFuel;
		System.out.println(
				"Choose fuel" + "\n" + "1 - 95" + "\n" + "2 - 92" + "\n" + "3 - Gas" + "\n" + "4 - Diesel fuel");
		userFuel = scanner.nextLine();
		int fuel = Integer.parseInt(userFuel);

		String userMoney;
		double volumeFuel;
		if (fuel == NUMBER_A_95) {
			System.out.println("This fuel cost - " + PRICE_A_95);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money /  PRICE_A_95 * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount =  PRICE_A_95 * (DISCOUNT_FROM_10_TO_20_LITERS / 100);
				discountPrice =  PRICE_A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_10_TO_20_LITERS);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount =  PRICE_A_95 * (DISCOUNT_FROM_20_TO_50_LITERS / 100);
				discountPrice =  PRICE_A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_20_TO_50_LITERS);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = PRICE_A_95 * (DISCOUNT_FROM_50_TO_100_LITERS / 100);
				discountPrice = PRICE_A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_50_TO_100_LITERS);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount =  PRICE_A_95 * (DISCOUNT_FROM_100_TO_500_LITERS / 100);
				discountPrice =  PRICE_A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_100_TO_500_LITERS);
			} else if (volumeFuel > 500) {
				discount =  PRICE_A_95 * (DISCOUNT_MORE_THAT_500_LITERS / 100);
				discountPrice =  PRICE_A_95 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_MORE_THAT_500_LITERS);
			}
		} else if (fuel == NUMBER_A_92) {
			System.out.println("This fuel cost - " + PRICE_A_92);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / PRICE_A_92 * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = PRICE_A_92 * (DISCOUNT_FROM_10_TO_20_LITERS / 100);
				discountPrice = PRICE_A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_10_TO_20_LITERS);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = PRICE_A_92 * (DISCOUNT_FROM_20_TO_50_LITERS / 100);
				discountPrice = PRICE_A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_20_TO_50_LITERS);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = PRICE_A_92 * (DISCOUNT_FROM_50_TO_100_LITERS / 100);
				discountPrice = PRICE_A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_50_TO_100_LITERS);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = PRICE_A_92 * (DISCOUNT_FROM_100_TO_500_LITERS / 100);
				discountPrice = PRICE_A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_100_TO_500_LITERS);
			} else if (volumeFuel > 500) {
				discount = PRICE_A_92 * (DISCOUNT_MORE_THAT_500_LITERS / 100);
				discountPrice = PRICE_A_92 - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_MORE_THAT_500_LITERS);
			}
		} else if (fuel == NUMBER_GAS) {
			System.out.println("This fuel cost - " + PRICE_GAS);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / PRICE_GAS * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = PRICE_GAS * (DISCOUNT_FROM_10_TO_20_LITERS / 100);
				discountPrice = PRICE_GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_10_TO_20_LITERS);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = PRICE_GAS * (DISCOUNT_FROM_20_TO_50_LITERS / 100);
				discountPrice = PRICE_GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_20_TO_50_LITERS);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = PRICE_GAS * (DISCOUNT_FROM_50_TO_100_LITERS/ 100);
				discountPrice = PRICE_GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_50_TO_100_LITERS);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = PRICE_GAS * (DISCOUNT_FROM_100_TO_500_LITERS / 100);
				discountPrice = PRICE_GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_100_TO_500_LITERS);
			} else if (volumeFuel > 500) {
				discount = PRICE_GAS * (DISCOUNT_MORE_THAT_500_LITERS / 100);
				discountPrice = PRICE_GAS - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_MORE_THAT_500_LITERS);
			}
		} else if (fuel == NUMBER_DIESEL_FUEL) {
			System.out.println("This fuel cost - " + PRICE_DIESEL_FUEL);

			System.out.print("Input your amount of money -> ");
			userMoney = scanner.nextLine();
			double money = Double.parseDouble(userMoney);

			volumeFuel = money / PRICE_DIESEL_FUEL * 100;
			int x = (int) Math.round(volumeFuel);
			volumeFuel = (double) x / 100;

			double discount;
			double discountPrice;
			if (volumeFuel <= 10) {
				System.out.println("You don't have a discount" + "\nYou can buy " + volumeFuel + " liters");
			} else if ((volumeFuel >= 10) && (volumeFuel <= 20)) {
				discount = PRICE_DIESEL_FUEL * (DISCOUNT_FROM_10_TO_20_LITERS / 100);
				discountPrice = PRICE_DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_10_TO_20_LITERS);
			} else if ((volumeFuel >= 20) && (volumeFuel <= 50)) {
				discount = PRICE_DIESEL_FUEL * (DISCOUNT_FROM_20_TO_50_LITERS / 100);
				discountPrice = PRICE_DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_20_TO_50_LITERS);
			} else if ((volumeFuel >= 50) && (volumeFuel <= 100)) {
				discount = PRICE_DIESEL_FUEL * (DISCOUNT_FROM_50_TO_100_LITERS / 100);
				discountPrice = PRICE_DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_50_TO_100_LITERS);
			} else if ((volumeFuel >= 100) && (volumeFuel <= 500)) {
				discount = PRICE_DIESEL_FUEL * (DISCOUNT_FROM_100_TO_500_LITERS / 100);
				discountPrice = PRICE_DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_FROM_100_TO_500_LITERS);
			} else if (volumeFuel > 500) {
				discount = PRICE_DIESEL_FUEL * (DISCOUNT_MORE_THAT_500_LITERS / 100);
				discountPrice = PRICE_DIESEL_FUEL - discount;
				volumeFuel = money / discountPrice * 100;
				int y = (int) Math.round(volumeFuel);
				volumeFuel = (double) y / 100;
				System.out.println(
						"You can buy " + volumeFuel + " liters for " + userMoney + " with discount " + DISCOUNT_MORE_THAT_500_LITERS);
			}
		}

		scanner.close();
	}

}
