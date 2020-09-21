package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a = 0;
		double maiorSalario = 0;
		double maiorSalarioM = 0;
		double menorSalario = 9999999;
		String nomeSalario = "";
		
		for(int i = 1; i <= 2; i++) {
			
			System.out.println("Digite seu nome: ");
			String nome = input.nextLine(); 
			System.out.println("Digite sua idade: ");
			int idade = input.nextInt(); input.nextLine(); 
			
			System.out.println("Masculino ou Feminino?");
			String sexo = input.nextLine().toUpperCase();
			char charSexo = sexo.charAt(0);
			
			System.out.println("Casado, Solteiro ou Outros?");
			String civil = input.nextLine().toUpperCase();
			char charCivil = civil.charAt(0);
			
			System.out.println("Cor dos olhos: Azul, Castanho, Preto ou Outros?");
			String olhos = input.nextLine().toUpperCase();
			char charOlhos = olhos.charAt(0);
			
			System.out.println("Cor do Cabelo: Loiro, Castanho, Preto ou Ruivos?");
			String cabelo = input.nextLine().toUpperCase();
			char charCabelo = cabelo.charAt(0);
			
			System.out.println("Digite o salário: ");
			double salario = input.nextDouble(); input.nextLine(); 
			
			System.out.println("Informe a escolaridade: \n1-Analfabeto \n2-Fundamental \n3-Ensino Médio"
					+ "\n4-Superior");
			int escolaridade = input.nextInt(); input.nextLine(); 
			
			
			if ((charSexo == 'F') && (charCabelo == 'L') && (charOlhos == 'A') && (idade >= 18 && idade <= 25) 
					&& (charCivil == 'S') && (salario > 10000) && (escolaridade == 4)) {
				a++;
				
			}
			
			if (salario > maiorSalario) {
				
				nomeSalario = nome; 
				maiorSalario = salario;
				if (charSexo == 'M') {
					maiorSalarioM = salario;
			} 
			
			
			}
			if ((salario < menorSalario) && (charSexo == 'M')) {
				menorSalario = salario;
			}
			
		}
		 System.out.println("Quantidade de mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, "
		 		+ "salário maior que R$10.000,00 e curso superior completo é " + a);
		 System.out.println("Nome da pessoa com maior salário é: " + nomeSalario);
		 System.out.println("Diferença entre o maior e menor salário dos homens é: " + (maiorSalarioM - menorSalario));
		
		input.close();
	}

}
