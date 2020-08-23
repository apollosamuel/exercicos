package sysout_scanner;
import java.util.Scanner;


//A Secretaria do Meio Ambiente mediu a quantidade de poluentes atmosféricos emitidos por uma empresa.
//Dependendo do valor obtido, a empresa foi multada conforme a tabela abaixo.
//Faça um algoritmo que monte esta tabela, solicitando as informações variáveis (xxx) para o usuário:

//Vou fazer a tabela no exercício, então vai ficar visível. 

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade mínima de poluentes: ");
		int xxx1 = input.nextInt();
		System.out.println("Digite a quantidade média de poluentes: ");
		int xxx2 = input.nextInt();
		System.out.println("Digite o valor mínimo da multa: ");
		double xxx3 = input.nextDouble();
		System.out.println("Digite o valor médio da multa: ");
		double xxx4 = input.nextDouble();
		System.out.println("Digite o valor alto da multa: ");
		double xxx5 = input.nextDouble();
		
		System.out.println("______________________________________________________");
		System.out.println("  QUANTIDADE DE POLUENTE EMITIDO x VALOR DA MULTA     ");
		System.out.println("------------------------------------------------------");
		System.out.println("  Até " + xxx1 + " multa de R$" + xxx3);
		System.out.println("------------------------------------------------------");
		System.out.println("  Entre " + xxx1 + " e " + xxx2 + " multa de R$" + xxx4);
		System.out.println("------------------------------------------------------");
		System.out.println("  Acima de " + xxx2 + " multa de R$" + xxx5 + " por poluente emitido");
		System.out.println("______________________________________________________");
		
		
		input.close();
	}
}
