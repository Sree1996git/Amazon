package questN;

public class OneBHK {
	
	double roomArea;
	double hallArea;
	double price;
	OneBHK()
	{
		super();
	}
	
	public  OneBHK(double roomArea,double hallArea,double price)
	{
		super();
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	
	public void show()
	{
		System.out.println("Room Area is " +roomArea);
		System.out.println("Hall Area is " +hallArea);
		System.out.println("Price is " +price);
		
	}

}
