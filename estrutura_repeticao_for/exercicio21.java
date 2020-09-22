package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Digite um número inteiro: ");
			int x = input.nextInt();

			if(x==1) {
				System.out.println("O numero não é primo");
			}

			for(int i = 2; i < x; i++) {
				if(x % i == 0) {
					System.out.println("O numero não é primo");
					return;
				}
			}
			System.out.println("O número é primo.");

			input.close();
		}
	}
}


