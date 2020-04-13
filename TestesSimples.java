package _3construtoresThisSobrecargaEncapsulamento;
import java.util.Scanner;
public class TestesSimples {

	public static void main(String[] args) {
		
      
		Scanner sc=new Scanner(System.in);
		
		MetodoTeste age = new MetodoTeste();
		age.setName("New name");
		
		System.out.printf("Name: %s\nBirth: %d\nYear: %d\n", age.getName(), age.getBirth(), age.getYear());
		
		System.out.printf("Age: %d", age.AGE);		
		System.out.println();
		
		System.out.println("Insert you new name: ");
		
		
		
		sc.close();
	}

}
