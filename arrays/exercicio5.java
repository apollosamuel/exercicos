package arrays;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int [10];
		int numMaior = 0; 

	
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite 10 números");
			numeros[i] = input.nextInt();	
				
			}
		
		for (int i = 0; i < numeros.length; i++) {
			if(numMaior < numeros[i]) {
				numMaior = numeros[i];
			}
		}
		
		System.out.println("Maior valor = " + numMaior);


		input.close();
	}

}
