package questN;

public class TwoBHK extends OneBHK{
	double room2Area;
	
	TwoBHK()
	{
		super();
	}
	public  TwoBHK(double room2Area)
	{
		
		this.room2Area=room2Area;
	}
	
	public void show()
	{
		
		System.out.println("Room 2 Area is " +room2Area);		
	}

}
