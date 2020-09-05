package switch_case_break;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		int n1 = input.nextInt();
		System.out.println("Digite a nota 2");
		int n2 = input.nextInt();
		System.out.println("Digite a nota 3");
		int n3 = input.nextInt();
		
		int notaFinal = n1+n2+n3;
		int conceito = 0;
		
		if (notaFinal >= 90 && notaFinal <= 100) {
			conceito = 1;
		}else if (notaFinal >= 80 && notaFinal <= 89){
			conceito = 2;
		}else if (notaFinal >= 70 && notaFinal <= 79){
			conceito = 3;
		}else if (notaFinal >= 60 && notaFinal <= 69){
			conceito = 4;
		}else {
			conceito = 5;
		}
		
		switch (conceito) {
		case 1:
			System.out.println("Conceito: A ");
			break;
		case 2:
			System.out.println("Conceito: B ");
			break;
		case 3:
			System.out.println("Conceito: C ");
			break;
		case 4:
			System.out.println("Conceito: D ");
			break;
		case 5:
			System.out.println("Conceito: E ");
			break;
			
			default:
				System.out.println("Inválido");
		}
		
		input.close();
	}

}
