package expressoes_aritmeticas;
import java.util.Scanner;

//A distância entre um ponto P e uma reta R é dado pela função abaixo.
//Faça um algoritmo que solicite ao usuário os valores de A, B e C da reta R
//e as coordenadas Xo e Yo do ponto P e calcule e imprima o valor da distância.


public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("--- Informe os valores da reta R ---");
		System.out.println("Digite o valor de A: ");
		int a = input.nextInt();
		System.out.println("Digite o valor de B: ");
		int b = input.nextInt();
		System.out.println("Digite o valor de C: ");
		int c = input.nextInt();
		
		System.out.println();
		
		System.out.println("--- Informe os valores do ponto P ---");
		System.out.println("Digite o valor de X: ");
		int x = input.nextInt();
		System.out.println("Digite o valor de Y: ");
		int y = input.nextInt();
		
		System.out.println();
		
		System.out.println("O valor da distância é: " + (a*x+b*y+c)/Math.sqrt
				(Math.pow(a,2)+Math.pow(b,2)));
		
		
		input.close();
	}

}
