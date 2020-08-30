package condicional_ifelse;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o nome da equipe 1: ");
		String equipe1 = input.nextLine();
		System.out.print("Digite o nome da equipe 2: ");
		String equipe2 = input.nextLine();
		
		System.out.print("Digite quantos sets a equipe 1 fez: ");
		int sets1 = input.nextInt();
		System.out.print("Digite quantos sets a equipe 2 fez: ");
		int sets2 = input.nextInt();
		
		if (sets1 == 3 && sets2 < 2) {
			int pontos1 = 3;
			int pontos2 = 0;
			System.out.println("Pontos " + equipe1 + " = " + pontos1);
			System.out.println("Pontos " + equipe2 + " = " + pontos2);
		} else if (sets2 == 3 && sets1 < 2) {
			int pontos1 = 0;
			int pontos2 = 3;
			System.out.println("Pontos " + equipe1 + " = " + pontos1);
			System.out.println("Pontos " + equipe2 + " = " + pontos2);
		} else if (sets2 == 2) {
			int pontos1 = 2;
			int pontos2 = 1;
			System.out.println("Pontos " + equipe1 + " = " + pontos1);
			System.out.println("Pontos " + equipe2 + " = " + pontos2);
		} else {
			int pontos1 = 1;
			int pontos2 = 2;
			System.out.println("Pontos " + equipe1 + " = " + pontos1);
			System.out.println("Pontos " + equipe2 + " = " + pontos2);
		}
		 
		
		input.close();
	}

}
