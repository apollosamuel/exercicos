package modularizacao;

import java.util.Scanner;

public class ModularizacaoGeral {
	static Scanner input = new Scanner(System.in);

	public static void exercicio1() {

		System.out.println("Digite o x1: ");
		int x1 = input.nextInt();
		System.out.println("Digite o x2: ");
		int x2 = input.nextInt();
		System.out.println("Digite o y1: ");
		int y1 = input.nextInt();
		System.out.println("Digite o y2: ");
		int y2 = input.nextInt();

		double distancia = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));

		System.out.println("Distância = " + distancia);
	}
}