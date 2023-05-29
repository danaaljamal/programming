package lab_9;

class Vegetables extends Product {
    private String organic;

    public Vegetables(String name, double price, String quantity, String organic) {
      
        this.organic = organic;
    }

    public String displayInfo() {
        return super.displayInfo() + "Organic: " + organic;
    }
}


