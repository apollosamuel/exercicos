package arrays;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int [10];
		int cont = 0;
	
		
		for (int i = 0; i <= 9; i++) {
			System.out.println("Digite 10 números");
			numeros[i] = input.nextInt();		
			if(numeros[i] % 3 == 0 && numeros[i] % 7 == 0) {
				cont++;
			}
		}
		
		System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: " + cont);
		
		input.close();
	}

}
