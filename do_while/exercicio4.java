package do_while;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String produto;
		double valor = 0; 
		int quantidade = 0;
		double custoParcial = 0;
		double custoTotal = 0;
		double custoFinal = 0;
		
		System.out.print("Digite A TAXA DE BDI: ");
		double bdi = input.nextInt();
		System.out.println("Digite FIM para finalizar.");
		
		do {
			
			System.out.println("Digite o nome do produto: ");
			produto = input.next();
			
			if (produto.compareToIgnoreCase("FIM") != 0) {
				
				System.out.println("Digite o valor unitário do produto: ");
				valor = input.nextDouble(); 
				System.out.println("Digite a quantidade do produto");
				quantidade = input.nextInt(); 
				
				custoParcial = valor*quantidade;
				System.out.println("Valor parcial: " + custoParcial);
				
				custoTotal += custoTotal+custoParcial;
				custoFinal = (custoTotal*(bdi/100))+custoTotal;
				
							
			}									
		}while (produto.compareToIgnoreCase("FIM") != 0);
		
		System.out.println("Custo total: " + custoTotal);
		System.out.println("BDI: " + custoTotal*(bdi/100));
		System.out.println("Preço final: " + custoFinal);
		
		
		input.close();
	}

}
