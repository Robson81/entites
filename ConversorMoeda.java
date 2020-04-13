package _2introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

import _0entities.CurrencyConverter;

public class ConversorMoeda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price, value;
		
		System.out.print("What is the dollar price: ");
		price = sc.nextDouble();
		System.out.print("How many dollars will be bought: ");
		value = sc.nextDouble();
		System.out.println();

		System.out.printf("Amount to be paid in Reais: %.2f",
				CurrencyConverter.valueToPay(price, value));

		sc.close();
	}

}
