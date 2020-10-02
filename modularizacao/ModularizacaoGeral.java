package modularizacao;

import java.util.Scanner;
import java.util.Random;




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

	public static void Exercicio4() {
		
		int cont = 0;
		int numero = 0;
		Random gerador = new Random();
		int randomInt = gerador.nextInt(100) + 1;
		
		System.out.println("Bem vindo ao jogo de Adivinhação!");
		
		do {
			System.out.println("Digite um número: ");
			numero = input.nextInt();
			cont++;
			
			if(numero == randomInt) {
				System.out.println("Acertou!");
				System.out.println("Você acertou em " + cont + " tentativas.");
				numero = -1;
			}else if (numero > randomInt) {
				System.out.println("Você errou! O seu chute foi maior do que o número secreto.");
			}else if(numero < randomInt) {
				System.out.println("Você errou! O seu chute foi menor do que o número secreto.");
			}
			
		}while(numero != -1);


	}

	public static void Exercicio5(double angulo) {
		
		System.out.println("Seno: " + Math.sin(angulo));
		System.out.println("Cosseno: " + Math.cos(angulo));
		System.out.println("Tangente: " + Math.tan(angulo));
		System.out.println("Arco seno: " + Math.asin(angulo));
		System.out.println("Arco consseno: " + Math.acos(angulo));
		System.out.println("Arco tangente: " + Math.atan(angulo));
	}





}