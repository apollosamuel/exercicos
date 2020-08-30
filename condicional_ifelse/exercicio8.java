package condicional_ifelse;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a sua altura em metros: ");
		double altura = input.nextDouble();

		double minimo = (20*Math.pow(altura, 2));
		
		double maximo = (25*Math.pow(altura, 2));
		
		System.out.println();
		
		System.out.println("Peso mínimo = " + minimo + ", Peso máximo = " + maximo);
		
		input.close();
	}

}
