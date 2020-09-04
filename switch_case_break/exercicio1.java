package switch_case_break;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		int caso = 0;
		
		System.out.println("Digite os nome do apostador: ");
		String nome = input.nextLine(); 
		System.out.println("Digite os acertos: ");
		int acertos = input.nextInt();
		
		if (acertos <= 5) {
			caso = 1;			
		}else if (acertos >= 6 && acertos <=10) {
			caso = 2;
		}else if (acertos == 11) {
			
		}else if (acertos == 12) {
			
		}else {
			caso = 5;
		}
		
		
		System.out.println(nome);
		
		switch (caso) {
		case 1:
			System.out.println("Nenhum prêmio.");
		break;
		case 2:
			System.out.println("Ganha outro cartão.");
		break;
		case 3:
			System.out.println("Ganhou: R$100,00");
		break;
		case 4:
			System.out.println("Ganhou: R$1.000,00");
		break;
		case 5:
			System.out.println("Ganhou: R$50.000,00");
		break;
		
		default:
			System.out.println("Inválido");
		}
		
		
		input.close();

	}

}
