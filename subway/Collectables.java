package subway;

import java.util.ArrayList;

public class Collectables {
	private static ArrayList<Coin> coins;

	public Collectables() {
		coins = new ArrayList<>();
	}

	public static void addCoinToArray(Coin coin) {
		coins.add(coin);
	}

	public static ArrayList<Coin> getCoins() {
		return coins;
	}

	public static void setCoins(ArrayList<Coin> coins) {
		Collectables.coins = coins;
	}
}
