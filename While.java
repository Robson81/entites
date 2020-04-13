package _1extruturas_repetitivas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		System.out.println("Olá");

		while (x != 0) {

			x = sc.nextInt();

		}
		sc.close();

	}

}
