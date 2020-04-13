package _0entities;

public class Employee {

	public String name;
	public double salary;
	public double tax;
	
	
public double netSalary() {
	
	return salary - tax;
}
public double incraseSalary(double incrase) {
	 
	
	return  salary * (incrase/100);
	
}


}
