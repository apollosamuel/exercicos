package modularizacao;

import java.util.Scanner;

public class ModularizacaoGeral {
	static Scanner input = new Scanner(System.in);

	public static void Exercicio1() {

		System.out.println("Digite o x1: ");
		int x1 = input.nextInt();
		System.out.println("Digite o x2: ");
		int x2 = input.nextInt();
		System.out.println("Digite o y1: ");
		int y1 = input.nextInt();
		System.out.println("Digite o y2: ");
		int y2 = input.nextInt();

		double distancia = Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2));

		System.out.println("Distância = " + distancia);
		
	}
	
	public static void Exercicio2() {
		
		double x = 0;
		double fx = 0;
		
		do {
			System.out.println("Digite o valor de x: ");
			x = input.nextInt();
			
			if (x != -1) {
				if(x < 4) {
					fx = (5*x+3)/Math.sqrt((16-Math.pow(x, 2)));
				}else if( x == 4) {
					fx = 0;
				}else if( x > 4) {
					fx = (5*x+3)/Math.sqrt(Math.pow(x, 2)-16);
				}
				System.out.println("f(x) = " + fx);
			}
			
			
			
		}while (x != -1);
		
	}
	
	public static void Exercicio3() {

		System.out.println("Digite um numero: ");
		int numero = input.nextInt();
		System.out.println("Digite a posição: ");
		int posicao = input.nextInt();
		
		if (numero > 0 && numero <= 999999999) {
			
			int retorno = numero/(int)Math.pow(10, posicao-1)%10;
			
			System.out.println("Retorno = " + retorno);
			
		}else {
			
			System.err.println("Digite um número entre 0 e 999999999!");
			
		}
		
		
	}










}