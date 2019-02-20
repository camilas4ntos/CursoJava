package curso;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o dia da semana: ");
		int x = sc.nextInt();
		String day;

		switch (x) {
		case 1:
			day = "Domingo";
			break;

		case 2:
			day = "Segunda";
			break;

		case 3:
			day = "Terça";
			break;

		case 4:
			day = "Quarta";
			break;

		case 5:
			day = "Quinta";
			break;

		case 6:
			day = "Sexta";
			break;

		case 7:
			day = "Sábado";
			break;

		default:
			day = "Dia Inválido";
		}

		System.out.println("Dia: " +day);
		sc.close();
	}

}
