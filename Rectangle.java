package _2introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Retangle;

public class Rectangle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Retangle lado;

		lado = new Retangle();

		System.out.println("Enter Retangle heigth and widht:");
		System.out.print("Heigth: ");
		lado.height = sc.nextDouble();
		System.out.print("Widht: ");
		lado.width = sc.nextDouble();
		System.out.println();

		/*System.out.println("Area: " + lado.area());
		System.out.println("Perimeter: " + lado.perimeter());
		System.out.println("Diagonal: " + lado.diagonal());
		*/
		
		System.out.println(lado.toString());
		
		sc.close();
	}

}
