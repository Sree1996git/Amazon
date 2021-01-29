package qC;

import java.util.Scanner;

public class xYZ {

	public static void main(String[] args) {
		double salary = 0;
		String name = null;
		long empid = 0;
		// TODO Auto-generated method stub
		Employee e=new Employee(empid,name,salary);
		Product p=new Product(02,2500,2);
		double incomeTax=e.calcTax();
		double salesTax=p.calcTax();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id ");
		int a=sc.nextInt();
		System.out.println("Enter the Employee name ");
		String b=sc.next();
		System.out.println("Enter the Product Id ");
		int c=sc.nextInt();
		System.out.println("Enter the Price ");
		int d=sc.nextInt();
		System.out.println("Enter the Quantity ");
		int f=sc.nextInt();
		
		System.out.println("Income Tax : " +incomeTax);
		System.out.println("Sales Tax :" +salesTax);
		
		

	}

}
