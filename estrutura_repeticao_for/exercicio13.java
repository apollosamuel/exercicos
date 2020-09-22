package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int milhao = 0;
		int diferenca = 0;
		int menor = 0 ;
		String menorCidade = ""; 
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite o nome da cidade: ");
			String cidade = input.nextLine().toUpperCase();
			System.out.println("Digite a quantidade da população: ");
			int populacao = input.nextInt();
			System.out.println("Digite a quantidade de eleitores: ");
			int eleitores = input.nextInt();
			System.out.println("Digite a quantidade de homens: ");
			int homens = input.nextInt();
			System.out.println("Digite a quantidade de mulheres: ");
			int mulheres = input.nextInt(); input.nextLine();
			
			if (populacao != (homens+mulheres)) {
				System.out.println("A população difere.");
			}
			System.out.println("Percentual de eleitores é de: " + (eleitores/(double)populacao)*100);
			if (populacao > 1000000) {
				milhao++;
			}
			if (mulheres > homens) {
				diferenca++;
			}
			
			if(menor>populacao || menor==0) {
				menorCidade = cidade;
				menor = populacao;
			}
			
		}
		System.out.println("Cidade com mais de 1 milhão de habitantes: " + milhao);
		System.out.println("Cidades com mais mulheres do que homens: " + diferenca);
		System.out.println("Cidade com menor população: " + menorCidade);
		
		input.close();
	}

}
