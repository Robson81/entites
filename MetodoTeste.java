package _3construtoresThisSobrecargaEncapsulamento;

public class MetodoTeste {
	
	
	private String name = "Mode Privite Test";
	
	private int birth = 1981;
	
	private int year = 2020;

	public int AGE = year - birth;
	
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		
		return birth;
	}
	
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public int getYear() {
		
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
