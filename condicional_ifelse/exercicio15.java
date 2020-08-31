package condicional_ifelse;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double conta = 0; 

		System.out.println("Digite o número do pacote: ");
		int pacote = input.nextInt();
		
		System.out.println("Digite a quantidade de dias: ");
		int dias = input.nextInt();
		
		System.out.println("Digite o valor dos serviços extras: ");
		double extra = input.nextDouble(); input.nextLine();
		
		System.out.println("Digite a cidade: ");
		String cidade = input.nextLine().toUpperCase();
		
		char city = cidade.charAt(0);
		
		if (pacote == 1) {
			if (dias > 54) {
				conta = 65.0+65.0+extra;
			}else {
				conta = 65.0+(1.20*dias)+extra;
			}
		}else if (pacote == 2) {
			conta = 104.0+(2.10*dias)+extra;
		}else {
			conta = 137.0+extra;
		}
		
		if (city == 'S') {
			conta = conta+(conta*0.01);			
		}else if (city == 'R') {
			conta = conta+(conta*0.015);	
		}else if (city == 'B') {
			conta = conta+0;
		}else {
			conta = conta+(conta*0.02);	
		}
		
		System.out.println("Conta = " + conta);
		
		input.close();
	}

}
