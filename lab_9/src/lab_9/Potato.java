package lab_9;

class Potato extends Product {
	private String type;

	public Potato(String name, double price, String quantity, String type) {

		this.type = type;
	}

	public String displayInfo() {
		return super.displayInfo() + "Type: " + type;
	}

}
