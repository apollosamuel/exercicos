package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int aprovados = 0;
		int reprovados = 0;

		for (int i = 1; i <= 3; i++) {
			System.out.print("Digite a nota do aluno " + i + ": ");
			int nota = input.nextInt();
			System.out.print("Digite a quantidade de faltas do aluno " + i + ": ");
			int falta = input.nextInt();

			if (nota >= 65 && falta <= 16) {
				System.out.println("ALUNO APROVADO");
				aprovados++;
			}else {
				System.out.println("ALUNO REPROVADO");
				reprovados++;
			}
		}

		System.out.print("Aprovados: " + aprovados + "\nReprovados: " + reprovados);
		input.close();
	}

}