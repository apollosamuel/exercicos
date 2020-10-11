package arrays;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nota[] = new int [2];
		String nome[] = new String [2];
		int total = 0;
		int cont = 0;

		for(int i = 0; i < nota.length; i++) {

			System.out.println("Digite a nota");
			nota[i] = input.nextInt(); input.nextLine(); 
			System.out.println("Digite o nome");
			nome[i] = input.nextLine(); 

			total += nota[i];
			cont++;

		}		


		for(int i = 0; i < nota.length; i++) {
			if(nota[i] > 50) {
				System.out.println(nome[i] + " / " + nota[i]);
			}
		}
		
		System.out.println("Média das notas: " + total/cont);

		input.close();
	}
}
