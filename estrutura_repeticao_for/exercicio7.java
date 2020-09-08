package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aux = 0;
		int maiorIdade = 0;
		String nomeMaisVelho = "a";
		int menor12 = 0;
		int maior30 = 0;
		double totalIdade = 0;
		double media = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Digite a idade: ");
			int idade = input.nextInt(); input.nextLine();
			System.out.println("Digite o nome: ");
			String nome = input.nextLine();
			aux++;
			
			if (idade > maiorIdade) {
				maiorIdade = idade;
				nomeMaisVelho = nome;
			}

			if (idade <= 12) {
				menor12++;
			}else if (idade > 30) {
				maior30++;
			}
			
			totalIdade+=idade;
			
			media = totalIdade/aux;
			
		}
		
		System.out.println("Alunos até 12 anos = " + menor12);
		System.out.println("Alunos maior que 30 anos = " + maior30);
		System.out.println("Média das idades = " + media);
		System.out.println("Aluno de maior idade = " + nomeMaisVelho);
		
		input.close();
	}

}
