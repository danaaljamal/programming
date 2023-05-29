package lab_9;
	class Product {
	    private String name;
	    private double price;
	    private String quantity;

	    public Product(String name, double price, String quantity) {
	        this.name = name;
	        this.price = price;
	        this.quantity = quantity;
	    }

	    public String displayInfo() {
	        return "Product Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
	    }
	}



