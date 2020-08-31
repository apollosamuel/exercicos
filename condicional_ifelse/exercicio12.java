package condicional_ifelse;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Quantas bolas vão ser produzidas: ");
		int bolasCompleto = input.nextInt();
		System.out.println("Quantas bolas estão com defeito?: ");
		int bolasDefeito = input.nextInt();		
		System.out.println("Digite o valor da caixa de papelão: ");
		double caixa = input.nextDouble(); 
		System.out.println("Digite a quantidade de meses para copa: ");
		double aluguel = input.nextDouble();
		System.out.println("Digite o valor do aluguel mensal: ");
		aluguel*= input.nextDouble();
		
		int bolasOk = bolasCompleto-bolasDefeito;
		
		int numeroCaixas = bolasOk/10;
		double numeroGalpao = numeroCaixas/850;
		
		if (bolasOk%10>0) {
			bolasOk++;
		} 
		
		if (numeroGalpao%850>0) {
			numeroGalpao++;
		}

		
		double custoTotal = numeroCaixas*caixa + numeroGalpao*aluguel;
		
		System.out.println("Custo Total = R$" + custoTotal);
		
		
		
		input.close();
	}

}
