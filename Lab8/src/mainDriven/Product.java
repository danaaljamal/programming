package mainDriven;

public class Product {
    private static int counter = 1;
    private int id;
    private String name;
    private double price;
    private static String shop;
    public static boolean printed = false;

    public Product() {
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getShop() {
        return shop;
    }

    public static void setShop(String shop) {
        Product.shop = shop;
    }

    public String toString() {
        printed = true;
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}
