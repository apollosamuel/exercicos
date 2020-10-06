package arrays;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int [10];


	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite 10 números");
			numeros[i] = input.nextInt();	
				
			}
		
		System.out.print("Números elevados ao quadrado:");
		for (int i = 0; i < numeros.length; i++) {
				System.out.print(" "+ Math.pow(numeros[i], 2));
			}
		
		
		


		input.close();
	}

}
