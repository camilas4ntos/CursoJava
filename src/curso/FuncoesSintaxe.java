package curso;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {
		// Raiz Quadrada
		double x = Math.sqrt(25.00);
		System.out.println(x);

		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com três os números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int num = max(a, b, c);
		showResult(num);

		sc.close();
	}

	public static int max(int x, int y, int z) {

		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else
			aux = z;
		return aux;
	}

	public static void showResult (int value){
		System.out.println("O maior Número é o: " +value);
		
	}
}
