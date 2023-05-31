package subway;

public class StartGame extends GameSystem {

	public void startGame() {

		Player player = new Player("Male", 20);
		Guard guard = new Guard("Male", 30);
		Train train1 = new Train(1, true);
		Train train2 = new Train(2, false);
		Coin coin = new Coin("center");
		player.run();
		guard.run();
		train1.transport();
		train2.rigidTrain();
		coin.setPlace("right");

	}
}
