package do_while;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double servicos = 0;
		double total = 0;
		int cont = 0;
		int cont2 = 0;
		
		do {
			
			System.out.println("Digite o valor dos serviços: ");
			servicos = input.nextDouble();
			
			if(servicos != 0) {
				cont++;
				total += servicos;
				
				if (servicos > 1000) {
					cont2++;
					
				}
				
			}
			
		} while (servicos != 0);
		
		System.out.println("Valor total = " + total);
		System.out.println("Média = " + total/cont);
		System.out.println("Quantidade de valores acima de R$1000.00 = " + cont2);
		
		input.close();
	}

}
