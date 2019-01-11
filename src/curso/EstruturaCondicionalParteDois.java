package curso;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalParteDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		// int numero = sc.nextInt();
		//
		// if (numero < 0) {
		// System.out.println("Número Negativo");
		// } else {
		// System.out.println("Número é Positivo");
		// }

		// int numero2 = sc.nextInt();
		//
		// if (numero2 % 2 ==0) {
		// System.out.println("Número Par");
		// } else {
		// System.out.println("Número é Impar");
		// }
		//
		// int A = sc.nextInt();
		// int B = sc.nextInt();
		// if (A % B == 0 || B % A == 0) {
		// System.out.println("Sao Multiplos");
		// }
		// else {
		// System.out.println("Nao sao Multiplos");
		// }

		// int horaInicial = sc.nextInt();
		// int horaFinal = sc.nextInt();
		//
		// int duracao;
		// if (horaInicial < horaFinal) {
		// duracao = horaFinal - horaInicial;
		// } else {
		// duracao = 24 - horaInicial + horaFinal;
		// }
		//
		// System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		// int codigo = sc.nextInt();
		// int qtde = sc.nextInt();
		// double total;
		//
		// if (codigo == 1) {
		// total = qtde * 4.0;
		// }
		//
		// else if (codigo == 2) {
		// total = qtde * 4.50;
		//
		// }
		//
		// else if (codigo == 3) {
		// total = qtde * 5.00;
		// }
		//
		// else if (codigo == 4) {
		// total = qtde * 2.00;
		// }
		//
		// else {
		// total = qtde * 1.50;
		// }
		//
		// System.out.printf("Total: %.2f", total);

		double numero = sc.nextDouble();

		if (numero < 0.0 || numero > 100.0) {

			System.out.println("Fora de intervalo");

		}

		else if (numero <= 25.0) {

			System.out.println("Intervalo [0,25]");

		}

		else if (numero <= 50.0) {

			System.out.println("Intervalo (25,50]");

		}

		else if (numero <= 75.0) {

			System.out.println("Intervalo (50,75]");

		}

		else {

			System.out.println("Intervalo (75,100]");

		}
		sc.close();

	}

}
