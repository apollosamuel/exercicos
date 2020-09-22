package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número de 1 a 9: ");
		int x = input.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println((x) + " * " + (i) + " = " + x*i);
		}
		
		input.close();
	}

}
