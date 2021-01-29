package questN;

import java.util.ArrayList;
import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OneBHK a1=new OneBHK(100,200,2000);
		TwoBHK t1=new TwoBHK(300);
		System.out.println("Details of Flat One");
		a1.show();
		t1.show();
		
		OneBHK a2=new OneBHK(150,250,2500);
		TwoBHK t2=new TwoBHK(400);
		System.out.println("Details of Flat Second");
		a2.show();
		t2.show();
		
		OneBHK a3=new OneBHK(300,400,3500);
		TwoBHK t3=new TwoBHK(500);
		System.out.println("Details of Flat Third");
		a3.show();
		t3.show();
		
		double price=a1.price+a2.price+a3.price;
		System.out.println("Total amount of all flats is " +price);
		
		
	}
}
