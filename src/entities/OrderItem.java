package entities;

public class OrderItem {

	private int quantity;
	private double price;
	private Product prod;
	
	public OrderItem() {
		
	}

	public OrderItem(int quantity, double price, Product prod) {
		this.quantity = quantity;
		this.price = price;
		this.prod = prod;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

//	public void setPrice(double price) {
//		this.price = price;
//	}
	
	
	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	public double subTotal() {
	//	return this.price = prod.getPrice() * this.quantity;
		return price * this.quantity;
	}
	
	@Override
	public String toString() {
		return getProd().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
							
	}
	
	
}
