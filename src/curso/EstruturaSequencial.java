package curso;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int soma = n1 + n2;
		System.out.println("SOMA = " +soma);
		
		double raio = sc.nextDouble();
		double pi =  3.14159;
		double area = pi * raio * raio;
		System.out.printf("A= %.4f",  area);
		
		int a,b,c,d, dife;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		dife = a * b - c * d;
		System.out.println("Diferenca = "+ dife);
		
		
		double numero = sc.nextDouble();
		double horas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salario = horas * valorHora;
		
		System.out.println("Número = "+ numero);
		System.out.printf("Salário = $ %.2f", salario);
		
		int codigo1 = sc.nextInt();
		int numero1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		int codigo2 = sc.nextInt();
		int numero2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		double valorTotal = numero1 * valorUnitario1 + numero2 * valorUnitario2 ;
		
		System.out.printf("Valor a Pagar: $%.2f ", valorTotal);
		
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double triangulo = A * C / 2.0;

		double circulo = 3.14159 * C * C;

		double trapezio = (A + B) / 2.0 * C;

		double quadrado = B * B;

		double retangulo = A * B;
		
		System.out.printf("Triângulo: %.3f%n", triangulo);
		System.out.printf("circulo: %.3f%n", circulo);
		System.out.printf("Trapezio: %.3f%n", trapezio);
		System.out.printf("Quadrado: %.3f%n", quadrado);
		System.out.printf("Retangulo: %.3f%n", retangulo);
		
		
		sc.close();
	}

}
