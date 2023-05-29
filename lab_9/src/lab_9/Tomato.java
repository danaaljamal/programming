package lab_9;

class Tomato extends Product {
	private String color;

	public Tomato(String name, double price, String quantity, String color) {
		this.color = color;
	}

	public String displayInfo() {
		return super.displayInfo() + "Color: " + color;
	}
}
