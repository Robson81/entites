package _2introducaoPoo;

import java.util.Locale;
import java.util.Scanner;

import _0entities.Student;

public class Estudante {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student aluno = new Student();

		System.out.println("Informe os dados solicitados abaixo:");
		System.out.print("Nome: ");
		aluno.name = sc.nextLine();
		System.out.print("1� nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("2� nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("3� nota: ");
		aluno.nota3 = sc.nextDouble();

		if (aluno.notaFinal() >= 60) {
			System.out.println("Nota Final: " + aluno.notaFinal());
			System.out.println("Passou");
		} else {

			System.out.println("Nota Nofal: " + aluno.notaFinal());
			System.out.println("N�o Passou.");
			System.out.println("Faltaram " + aluno.missing() + " para passar.");
		}

		sc.close();
	}

}
