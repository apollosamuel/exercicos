package arrays;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int nota[] = new int [3];
		String nome[] = new String [3];
		String nomeMaior = "";
		int notaMaior = 0;

		for(int i = 0; i < nota.length; i++) {

			System.out.println("Digite a nota");
			nota[i] = input.nextInt(); input.nextLine(); 
			System.out.println("Digite o nome");
			nome[i] = input.nextLine(); 
		}		


		for(int i = 0; i < nota.length; i++) {
			
			if(nota[i] > notaMaior) {
				nomeMaior = nome[i];
				notaMaior = nota[i];
			}
		}
		
		System.out.println("Maior nota: " + nomeMaior);
		
		input.close();
	}

}
