package lab_9;

class Rice extends Product {
	private String type;
	private String brand;

	public Rice(String name, double price, String quantity, String type, String brand) {
		this.type = type;
		this.brand = brand;
	}

    public String displayInfo() {
        return super.displayInfo() + "\nType: " + type + "\nBrand: " + brand;
    }
}

