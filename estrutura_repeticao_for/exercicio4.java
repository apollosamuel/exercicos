package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int ate18 = 0;
		int acima18 = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite o nome: ");
			String nome = input.nextLine();
			System.out.print("Digite a idade: ");
			int idade = input.nextInt(); input.nextLine();
			
			if(idade >= 18) {
				acima18++;
			}else {
				ate18++;
			}
			
		}
		
		System.out.println("Até 18 = " + ate18 + "\nAcima de 18 = " + acima18);
		
		input.close();
	}

}
