package qC;

public class Employee implements Taxable {
	long empid;
	String name;
	double salary;
	
Employee(long empid,String name,double salary)	
{
	this.empid=empid;
	this.name=name;
	this.salary=salary;
}
public double calcTax()
{
	double tax=this.salesTax*this.salary*12;
	return tax;
}

}
