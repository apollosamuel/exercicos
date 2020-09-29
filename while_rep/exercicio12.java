package while_rep;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o número: ");
		int numero = input.nextInt();
		
		int numeroDireita = 0;
		int numeroBase = 0;
		for(int i = 1;i<=numero;i++) {
			numeroDireita+=i;
			numeroBase+=1;
			
			System.out.print(numeroDireita);
			System.out.println(numeroBase*(i+1) - numeroDireita);
			
			numeroDireita*=10;
			numeroBase*=10;
		}
		
		input.close();
	}

}
