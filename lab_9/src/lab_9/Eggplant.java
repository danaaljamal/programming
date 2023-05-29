package lab_9;

class Eggplant extends Product {
	private String size;

	public Eggplant(String name, double price, String quantity, String size) {

		this.size = size;
	}

	public String displayInfo() {
		return super.displayInfo() + "Size: " + size;
	}
}
