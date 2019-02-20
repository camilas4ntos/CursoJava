package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xLadoA, xLadoB, xLadoC, yLadoA, yLadoB, yLadoC;
		System.out.println("Entre com as medidas do triângulo X: ");
		xLadoA = sc.nextDouble();
		xLadoB = sc.nextDouble();
		xLadoC = sc.nextDouble();

		System.out.println("Entre com as medidas do triângulo Y: ");
		yLadoA = sc.nextDouble();
		yLadoB = sc.nextDouble();
		yLadoC = sc.nextDouble();

		double p = (xLadoA + xLadoB + xLadoC) / 2.0;
		double areax = Math.sqrt(p * (p - xLadoA) * (p - xLadoB) * (p - xLadoC));

		p = (yLadoA + yLadoB + yLadoC) / 2.0;
		double areay = Math.sqrt(p * (p - yLadoA) * (p - yLadoB) * (p - yLadoC));

		System.out.printf("Triângulo X area: %.4f%n", areax);
		System.out.printf("Triângulo Y area: %.4f%n", areay);

		if (areax > areay) {
			System.out.println("Area maior é a do triângulo X: " +areax);
		} else {
			System.out.println("Area maior é a do triângulo Y: " +areay);
		}
		sc.close();
	}

}
