package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double totalIdadeM = 0;
		int contM = 0;
		double totalIdadeF = 0;
		int contF = 0;
		
		System.out.println("Digite a quantidade de pessoas: ");
		int x = input.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.println("Digite a idade: ");
			int idade = input.nextInt(); input.nextLine();
		
			System.out.println("Digite se é masculino ou feminino");
			String sexo = input.nextLine().toUpperCase();
			char sexoChar = sexo.charAt(0);
			
			if (sexoChar == 'M') {
				totalIdadeM = idade + totalIdadeM;
				contM++;
			}else {
				totalIdadeF = idade + totalIdadeF;
				contF++;
			}
		}
		
		System.out.println("Média das idades dos homens: " + totalIdadeM/contM);
		System.out.println("Média das idades das mulheres: " + totalIdadeF/contF);
		input.close();
	}

}
