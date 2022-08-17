package Model;

public class Ipi implements Tax {
	private double baseValue;
	private double price;
	private double shippingPrice;
	private double safeTax;
	//(Base Cálculo * 0,15%). Base Cálculo = Valor do
	//produto + Frete + Seguro;
	
	public Ipi(double price, double shippingPrice, double safeTax) {
		this.price = price;
		this.shippingPrice = shippingPrice;
		this.safeTax = safeTax;
		baseValue= price+shippingPrice+safeTax;
	}
	
	
	
	
	public double getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public double getSafeTax() {
		return safeTax;
	}
	public void setSafeTax(double safeTax) {
		this.safeTax = safeTax;
	}
	
	public double calculateTax() {
		
		return getBaseValue()*0.15;
		
	}
	

}
