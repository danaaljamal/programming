package lab_9;

	class Meat extends Product {
	    private String type;

	    public Meat(String name, double price, String quantity, String type) {
	       
	        this.type = type;
	    }

	    public String displayInfo() {
	        return displayInfo() + "Type: " + type;
	    }
	}

