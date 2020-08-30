package condicional_ifelse;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número para A: ");
		int a = input.nextInt();
		System.out.print("Digiteum número para B: ");
		int b = input.nextInt();
		System.out.print("Digite um número para C: ");
		int c = input.nextInt();
		
		double delta = (Math.pow(b, 2))-(4*a*c);
		
		if (delta > 0) {
			double raiz1 = ((-b+Math.sqrt(delta))/(2*a));
			double raiz2 = ((-b-Math.sqrt(delta))/(2*a));
			
			System.out.println("Teremos 2 raízes = " + raiz1 + " e " + raiz2 + ".");
		} else if(delta == 0) {
			
			double raiz1 = ((-b+Math.sqrt(delta))/(2*a));
		
			System.out.println("Teremos 1 raiz = " + raiz1 + ".");
		} else {
			
			System.out.println("Não teremos raízes.");
		}
		
		input.close();
	}

}
