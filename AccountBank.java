package _3construtoresThisSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Bank;

public class AccountBank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bank bank;

		System.out.print("Enter account numer: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("I there an initial deposit (y/n)?: ");
		char response = sc.next().charAt(0);

		if (response == 'y') {

			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(number, name, initialDeposit);
		} else {
			bank = new Bank(number, name);
		}
		System.out.println();
		System.out.println("Account Data:");
		System.out.println(bank.toString());
		System.out.println("\n");

		System.out.print("Enter a deposit value : ");
		double initialDeposit = sc.nextDouble();
		bank.deposit(initialDeposit);
		System.out.println("Update account data:\n" + bank);
		System.out.println("\n");

		System.out.print("Enter a withdraw value : ");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		System.out.println("Update account data:\n" + bank);
		System.out.println("\n");

		sc.close();
	}

}
