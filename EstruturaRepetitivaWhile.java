package curso;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// System.out.print("Entre com um número: ");
		// double n = sc.nextDouble();
		//
		// while (n >= 0.00){
		// double raiz = Math.sqrt(n);
		// System.out.printf("%.3f%n" , raiz);
		// System.out.print("Entre com outro número: ");
		// n = sc.nextDouble();
		// }
		//
		// System.out.println("Número Negativo");

		//
		// System.out.print("Informe uma senha: ");
		// int senha = sc.nextInt();
		// while (senha != 2002){
		// System.out.println("Senha Invalida");
		// System.out.print("Entre com outra senha: ");
		// senha = sc.nextInt();
		// }
		//
		// System.out.println("Acesso Permitido");

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}

			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}

			else if (tipo == 3) {
				diesel = diesel + 1;
			}

			tipo = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
