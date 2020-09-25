package do_while;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String cidade;
		int cont = 0;
		int cont1 = 0;
		int populacaoTotal = 0;
		int eleitoresTotal = 0;
		int media = 0;
		int menorPopulacaoNumero = 0;
		String menorPopulacaoNome = "";



		do {
			System.out.println("Digite o nome da cidade: ");
			cidade = input.nextLine();
			System.out.println("Digite o número da população: ");
			int populacao = input.nextInt();
			System.out.println("Digite o número da homens: ");
			int homens = input.nextInt();
			System.out.println("Digite o número da mulheres: ");
			int mulheres = input.nextInt(); 
			System.out.println("Digite o número da eleitores: ");
			int eleitores = input.nextInt(); input.nextLine();
			
			cont++;
			populacaoTotal += populacao;
			eleitoresTotal += eleitores;
			media += homens;

			if ((mulheres + homens) < populacao) {
				System.out.println("Quantidade é diferente");
			}

			if (mulheres > homens) {
				cont1++;
			}

			;
			if (menorPopulacaoNumero > populacao || menorPopulacaoNumero == 0) {
				menorPopulacaoNumero = populacao;
				menorPopulacaoNome = cidade;
			}

		}while (cidade.compareToIgnoreCase("Zimbabue de Minas") != 0);

		System.out.println("Total de cidade = " + cont);
		System.out.println("Total dda população = " + populacaoTotal);
		System.out.println("Cidades com mais mulheres que homens = " + cont1);
		System.out.println("Percentual de eleitores = " + ((double)eleitoresTotal / populacaoTotal * 100));
		System.out.println("Média de homens = 236.000 = " + media/cont);
		System.out.println("Cidade com menor população = " + menorPopulacaoNome);


		input.close();
	}

}
