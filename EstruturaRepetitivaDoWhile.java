package curso;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {

			System.out.println("Entre com um número: ");
			double n = sc.nextDouble();
			double r = Math.sqrt(n);
			System.out.printf("Raiz Quadrada: %.3f%n", r);

			System.out.println("Deseja Repetir (y/n)? ");
			resp = sc.next().charAt(0);
		}

		while (resp != 'n');

		sc.close();
	}
}
