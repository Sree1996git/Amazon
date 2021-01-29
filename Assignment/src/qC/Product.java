package qC;

public class Product implements Taxable {
	
	long proid;
	double price;
	double quantity;
	
	Product(long proid,double price,double quantity)
	{
		this.proid=proid;
		this.price=price;
		this.quantity=quantity;
	}
	public double calcTax()
	{
		double tax=this.incomeTax*this.price*quantity;
		return tax;
	}

}
