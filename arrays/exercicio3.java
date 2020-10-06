package arrays;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int [10];


	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite 10 números");
			numeros[i] = input.nextInt();	
				
			}
		
		System.out.print("Números que são divisores de 34:");
		for (int i = 0; i < numeros.length; i++) {
			if(34 % numeros[i] == 0) {
				System.out.print(" "+numeros[i]);
			}
		}
		
		


		input.close();
	}


}
