package arrays;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int [10];


	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite 10 números");
			numeros[i] = input.nextInt();	
				
			}
		
		System.out.print("Números maiores que 5 e menores que 10:");
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i]>5 && numeros[i]<10) {
				System.out.print(" "+numeros[i]);
			}
		}
		
		


		input.close();
	}

}

