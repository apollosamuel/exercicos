package while_rep;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int dia = 0;
		double multa = 0;
		double totalMulta = 0;
		int cont = 0;

		do {
			System.out.println("Digite o dia ou 99 para sair");
			dia = input.nextInt();


			if (dia != 99) {
				
				System.out.println("Digite a placa: ");
				int placa = input.nextInt();
				System.out.println("Digite os pontos ");
				int pontos = input.nextInt();
				
				if (pontos <= 3){
					multa = 42;
					System.out.println("Placa = " + placa + "\nMulta = " + multa);
					
				} else if (pontos > 3 && pontos <= 7) {
					multa = 108;
					System.out.println("Placa = " + placa + "\nMulta = " + multa);
				} else if (pontos > 7) {
					multa = 479;
					System.out.println("Placa = " + placa + "\nMulta = " + multa);
					if (dia < 15) {
					cont++;
					}
				}
				
				totalMulta += multa;
			}



		}while (dia != 99);

		System.out.println("Valor total = " + totalMulta);
		System.out.println("Quantidade de multas 8 até primeira quinzena do mês = " + cont);
		
		input.close();
	}
}
