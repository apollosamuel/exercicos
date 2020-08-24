package expressoes_aritmeticas;
import java.util.Scanner;

//A área da superfície esférica e o volume de uma esfera são calculados a partir das fórmulas abaixo. 
//Faça um algoritmo que leia o raio R de uma esfera e calcule e imprima a sua área e volume.
//Utilizar o valor PI = 3.1416.


public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double pi = 3.1416;
		
		System.out.println("Digite o valor do raio: ");
		int raio = input.nextInt();
		
		System.out.println("Área = " + 4*pi*Math.pow(raio, 2) + "e volume = " + (4.0/3)*pi*Math.pow(raio, 3));
		
		input.close();
	}

}
