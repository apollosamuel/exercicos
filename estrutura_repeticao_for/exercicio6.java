package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		int soma4 = 0;
		int impar = 0;


		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			numero = input.nextInt();

			if (numero%3 == 0){
				impar++;
			}
			if(numero%2 == 0) {
				System.out.println("Este numero é par. ");
				if (numero%4 == 0){
					soma4 = numero + soma4;
				}
			}else {
				System.out.println("O número é ímpar.");
			}

		}

		System.out.println("Soma dos números divisíveis por 4 = " + soma4);
		System.out.println("Número divisíveis por 3 = " + impar);

		input.close();
	}

}
