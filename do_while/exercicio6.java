package do_while;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		double a = input.nextDouble();
		System.out.print("Insira o valor de B: ");
		double b = input.nextDouble();
		System.out.print("Insira o valor de C: ");
		double c = input.nextDouble();

		double den = Math.sqrt(a * a + b * b);
		double distancia = 0;
		do {
			System.out.print("Insira o valor de X: ");
			double x = input.nextDouble();
			System.out.print("Insira o valor de Y: ");
			double y = input.nextDouble();

			distancia = (a * x + b * y + c) / den;
			System.out.println("Ditância = " + distancia);
		} while (distancia != 0);
		input.close();
	}

}
