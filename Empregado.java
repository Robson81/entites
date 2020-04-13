package _2introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Employee;

public class Empregado {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee data = new Employee();

		System.out.print("Name: ");
		data.name = sc.nextLine();
		System.out.print("Gross salary: ");
		data.salary = sc.nextDouble();
		System.out.print("Tax: ");
		data.tax = sc.nextDouble();
		System.out.println();

		System.out.printf("Employee: %s, $ %.2f\n", data.name, data.netSalary());
		System.out.println();

		System.out.print("Which percentage to incrase salary: ");
		double incrase = sc.nextDouble();
		System.out.println();

		System.out.printf("Updated data: %s, $ %.2f", data.name, data.incraseSalary(incrase) + data.netSalary());

		sc.close();
	}

}
