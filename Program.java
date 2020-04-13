package _2introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Product product = new Product(); //instansiação do constructor padrão


		System.out.println("Enter products data:");
		//System.out.print("Name: ");
		product.setName("Computador");//teste do setters name
		//System.out.print("Price: ");
		product.setPrice(1200);//teste do setters para price
		
		
		//Product product = new Product(name, price);
		
	
		
		System.out.print("Product data: " + product.toString());
		System.out.println();
		
		System.out.print("\nEnter the number off prodcts to be Added in Stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Update data: " + product);
		System.out.println();
		System.out.print("Enter the number off products to be removed from Stock: ");
		 quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Update data: " + product);
		
		System.out.printf("quantity %d",product.getQuantity());
		
		sc.close();
	}

}
