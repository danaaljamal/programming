package subway;

public class Train {
	private int id;
	private boolean movingState;

	public Train(int id, boolean movingState) {
		this.id = id;
		this.movingState = movingState;
	}

	public void transport() {
		System.out.println("Train " + id + " is moving.");
	}

	public void rigidTrain() {
		System.out.println("Train " + id + " is rigid.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMovingState() {
		return movingState;
	}

	public void setMovingState(boolean movingState) {
		this.movingState = movingState;
	}
}
