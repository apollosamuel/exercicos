package arrays;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero[] = new int [20];
		int cont = 9;
		int x = 0;
		
		for(int i = 0; i < numero.length; i++) {
			
			System.out.println("Digite um número");
			numero[i] = input.nextInt();
		}
		
		for(int y = 0; y < 10; y++) {
			
			cont++;
			x = numero[y]+numero[cont];
			
			System.out.println("Numeros impressos: " + x);
		}
		
		
		
		input.close();
	}

}
