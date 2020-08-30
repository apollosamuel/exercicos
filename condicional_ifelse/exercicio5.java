package condicional_ifelse;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = input.nextInt();
		
		int cinco = x%5;
		int sete = x%7;
		
		if (cinco == 0 && sete == 0) {
			System.out.println(x + " é divisível simultaneamente por 5 e 7.");
		} else {
			System.out.println(x + " não é divisível simultaneamente por 5 e 7.");
		}

		
		input.close();
	}

}
