package arrays;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome[] = new String [100];
		String estado[] = new String [100];
		int populacao[] = new int [100];
		String tempNome, tempEstado;

		for(int i = 0; i < populacao.length; i++) {

			System.out.println("Digite o nome");
			nome[i] = input.nextLine(); 
			System.out.println("Digite o estado");
			estado[i] = input.nextLine(); 
			System.out.println("Digite a populacao");
			populacao[i] = input.nextInt();input.nextLine(); 
		}		

		for (int i = 0; i < populacao.length; i++) {
			for (int x = 0; x < populacao.length-1; x++) {

				if (populacao[x] > populacao[x+1]) {
					int temp = populacao[x];
					populacao[x] = populacao[x+1];
					populacao[x+1] = temp;

					tempNome = nome[x];
					nome[x] = nome[x+1];
					nome[x+1] = tempNome; 

					tempEstado = estado[x];
					estado[x] = estado[x+1];
					estado[x+1] = tempEstado; 
				}
			}
		}
		int x = 100;
		
		for(int i = 0; i < 10; i++) {
			x--;
			System.out.println(nome[x]);
			System.out.println(estado[x]);
			System.out.println(populacao[x]);
		}





		input.close();
	}
}
