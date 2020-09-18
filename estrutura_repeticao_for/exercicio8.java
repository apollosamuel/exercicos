package estrutura_repeticao_for;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int cont = 0;
		int maisFaltas = 0;
		int notaTotal = 0; 
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("Digite a nota final do aluno: ");
			int notaFinal = input.nextInt();
			System.out.print("Digite o total de faltas do aluno: ");
			int totalFaltas = input.nextInt();
			
			if (notaFinal >= 65 && totalFaltas <= 16) {
				System.out.println("Aluno aprovado!");
				cont++;
				notaTotal = notaFinal + notaTotal;
			}else {
				System.out.println("Aluno reprovado!");
				if (totalFaltas > 16) {
					maisFaltas++;
				}
			}
		}
			
		System.out.println("Média das notas dos aprovados = " + notaTotal/cont);
		System.out.println("Quantidade de alunos com mais de 16 faltas = " + maisFaltas);
			
		input.close();
	}

}
