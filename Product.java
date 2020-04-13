package _0entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product() {

	}

	public Product(String a, double b, int c) {

		this.name = a;
		this.price = b;
		this.quantity = c;
	}

	public Product(String a, double b) {

		this.name = a;
		this.price = b;

	}

	public double totalValueInStock() {

		return price * quantity;
	}

	public void addProducts(int quantity) {

		this.quantity += quantity;

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;

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

	public int getQuantity() {
		return quantity;
	}


	public String toString() {

		return name + String.format(", $ %.2f", price) + ", " + quantity + " units, total: "
				+ String.format("$ %.2f", totalValueInStock());
	}

}
