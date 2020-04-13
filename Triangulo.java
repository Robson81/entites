package _2introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Triangle;

public class Triangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xA, xB, xC, yA, yB, yC;
		Triangle x, y;//substitui a linha acima por duas variaveis do tipo Triangle.
		
		x = new Triangle();// instanciar as variáveis do tipo Triangle
		y = new Triangle();// instanciar as variáveis do tipo Triangle
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//double p = (x.a + x.b + x.c) / 2.0; - o método area da função Triangle substitui toda essa expressão
		double areaX = x.area();//Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c)); - a chamada do método area();
		
		//p = (y.a + y.b + y.c) / 2.0; - método area da função Triangle substitui toda essa expressão
		double areaY = y.area();//Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c)); - a chamada do método area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}
}