package curso;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String nome= sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int qtde = sc.nextInt();
		System.out.println("Enter product price:");
		double valor = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String sobrenome = sc.next();
		int idade = sc.nextInt();
		double altura = sc.nextDouble();
		
		System.out.println(nome);
		System.out.println(qtde);
		System.out.printf("%.2f%n", valor);
		System.out.println(sobrenome);
		System.out.println(idade);
		System.out.printf("%.2f%n",altura);
		
		sc.close();
		

	}

}
