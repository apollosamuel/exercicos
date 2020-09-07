package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Digite a nota do aluno " + i + ": ");
			int nota = input.nextInt();
			System.out.print("Digite a quantidade de faltas do aluno " + i + ": ");
			int falta = input.nextInt();
			
			if (nota >= 65 && falta <= 16) {
				System.out.println("ALUNO APROVADO");
			}else {
				System.out.println("ALUNO REPROVADO");
			}
			
		}
		
		input.close();
	}

}
