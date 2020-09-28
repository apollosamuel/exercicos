package while_rep;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String nome = "";
		double valor = 0;
		int cont = 0;
		double valorMedio = 0;
		int contMedio = 0;

		do {
			System.out.println("Digite o nome ou FIM para sair");
			nome = input.nextLine();


			if (nome.compareToIgnoreCase("FIM") != 0) {

				System.out.println("Digite o código da opção: ");
				int codigo  = input.nextInt(); input.nextLine();

				contMedio++;
				if (codigo == 1){
					valor = 100;
					cont++;
				} else if (codigo == 2) {
					valor = 100;
				} else if (codigo > 7) {
					valor = 100;
				}
				
				System.out.println(nome + ", sua mensalidade é de = " + valor);
				valorMedio += valor;
			}

		}while (nome.compareToIgnoreCase("FIM") != 0);

		System.out.println("Alunos na turma de inglês " + cont);
		System.out.println("Mensalidade média = " + valorMedio/contMedio);
		
		input.close();
	}
}