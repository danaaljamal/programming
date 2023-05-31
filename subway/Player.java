package subway;

import java.util.ArrayList;

public class Player extends Human {
	private static String place;
	public static ArrayList<Coin> arrayOfCoins = new ArrayList<>();

	public Player(String gender, int age) {
		super(gender, age);
		place = "center";
	}

	public static void moveRight() {
		place = "right";
		System.out.println("The player moved to the right.");
	}

	public static void moveLeft() {
		place = "left";
		System.out.println("The player moved to the left.");
	}

	public static void collectCoin() {
		System.out.println("The player collected the coin.");
	}

	public static void addCoinToArray(Coin coin) {
		arrayOfCoins.add(coin);
	}

	public void run() {
		System.out.println("The player is running.");
	}

	public static String getPlace() {
		return place;
	}

	public static ArrayList<Coin> getArrayOfCoins() {
		return arrayOfCoins;
	}

}
