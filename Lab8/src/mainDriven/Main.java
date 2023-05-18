package mainDriven;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Product.setShop("Carrefour");

		Product p1 = new Product();
		p1.setName("Cheese");
		p1.setPrice(5.50);

		Product p2 = new Product();
		p2.setName("Milk");
		p2.setPrice(9.75);

		Product p3 = new Product();
		p3.setName("Nescafe");
		p3.setPrice(4.50);

		Product p4 = new Product();
		p4.setName("Ketchup");
		p4.setPrice(2.50);

		ArrayList<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(1, p4);
		productList.add(p2);
		productList.add(p3);

		System.out.println("Content of the ArrayList:");
		for (Product product : productList) {
			System.out.println(product);
		}

		System.out.println("Static variable: " + Product.staticVariable);

		double[] prices = new double[productList.size()];
		for (int i = 0; i < productList.size(); i++) {
			prices[i] = productList.get(i).getPrice();
		}

		System.out.println("Basic array:");
		for (double price : prices) {
			System.out.println(price);
		}

		sortAlgorithms.BubbleSort.sort(prices);

		System.out.println("Sorted array (Bubble Sort):");
		for (double price : prices) {
			System.out.println(price);
		}
	}
}
