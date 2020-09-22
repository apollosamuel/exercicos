package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = input.nextInt(); input.nextLine();
		System.out.println("Digite um símbolo: ");
		char simbol = input.nextLine().charAt(0);
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print(simbol + " ");
			}
			System.out.println();
		}
		
		
		input.close();
	}

}
