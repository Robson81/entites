package _0entities;

public class EmployeeList {

	private Integer id;
	private String name;
	private Double salary;

	
	public EmployeeList(Integer id, String name, Double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public EmployeeList() {
		
	}
	
	public void incraseSalary(double incrase) {
		
		salary = salary * (incrase/100 + 1.0);
	}


	
	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalary() {
		return salary;
	}


	public String toString() {
		
		return id
				+", "
				+name
				+", "
				+salary;
	}
	
	
	
}
