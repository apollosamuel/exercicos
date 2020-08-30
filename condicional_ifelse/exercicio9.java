package condicional_ifelse;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a altura: ");
		double altura = input.nextDouble(); input.nextLine();
		System.out.println("Digite feminimo ou masculino: ");
		String sexo = input.nextLine().toLowerCase();
		
		char inicial = sexo.charAt(0);
		
		if (inicial == 'f' ) {
			double pesoIdeal = 62.1*altura-44.7;
			System.out.println("Peso =" + pesoIdeal);
		} else {
			double pesoIdeal = 72.7*altura-58;
			System.out.println("Peso =" + pesoIdeal);
		}
	
		input.close();
	}

}
