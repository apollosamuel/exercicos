package do_while;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int cont = 0;;
		double multa = 0;
		double numero = 0;
		double soma = 0;
		do {
			System.out.println("Digite a multa: ");
			numero = input.nextDouble();
			
			if(numero != -1) {
				cont++;
				multa = numero*0.10;	
				soma += multa;
				System.out.println("Multa = " + multa);
			}
			
			
		} while (numero != -1);
		
		System.out.println("MÉDIA = " + soma/cont);
		
		input.close();
	}

}
