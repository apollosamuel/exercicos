package condicional_ifelse;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
			
		System.out.print(" Digite o capital aplicado: ");
		double capital = input.nextDouble();
		System.out.print("Digite a quantidade de dias");
		int dia = input.nextInt();
		System.out.print("Digite a taxa diária: ");
		double taxa = input.nextDouble();
		
		double resgatado = ((capital+(capital*(taxa/100)*dia*0.85)-10));
		
		System.out.println();
		
		System.out.println("Valor resgatado: R$" + resgatado);
		

		input.close();

	}

}
