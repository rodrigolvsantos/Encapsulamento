package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	// Criando o construtor dessa xana

	public Product(String nome, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String nome, double price) {
		this.name = name;
		this.price = price;

	}
	
	//generally the methods get and setters all inclusive after constructor method

		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice (double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double totalValuesInStock() {
		return price * quantity;
	}

	public void addproduct(int quantity) {
		this.quantity += quantity;
	}

	public void removeproducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValuesInStock());

	}
}
