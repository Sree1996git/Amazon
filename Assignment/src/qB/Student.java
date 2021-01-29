package qB;

import java.util.Scanner;

public class Student implements StudentFee {
	

	public void getFee(String name,int fee)throws InvalidFeeException{
	if(fee<0)
	
		throw new InvalidFeeException("Invalid Fees");
	
	else
	
		System.out.println("Name: "+ name +"\nFees: "+ fee);
	}
	public static void main(String args[])
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String k=sc.next();
		System.out.println("Enter the fee");
		int p=sc.nextInt();
		try {
		s.getFee(k,p);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
