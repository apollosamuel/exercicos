package expressoes_aritmeticas;
import java.util.Scanner;

//Faça um algoritmo que solicite ao usuário o valor de S (área de um setor circular)
//e α (ângulo) e calcule e imprima o valor de R (raio). Utilizar o valor PI = 3.1416

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de S: ");
		double s = input.nextDouble();
		System.out.println("Digite o valor de A: ");
		double a = input.nextDouble();
		
		
		System.out.println("R = " + Math.sqrt((s*360)/(3.1416*a))); 
		
		
		input.close();
	}

}
