package expressoes_aritmeticas;
import java.util.Scanner;

//Faça um algoritmo que leia as coordenadas X e Y de 2 pontos do plano cartesiano e calcule e imprima a distância entre eles.
//Ponto 1 (X1,Y1)  e  Ponto 2 (X2,Y2)


public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a coordenada X1: ");
		int x1 = input.nextInt();
		System.out.println("Digite a coordenada X2: ");
		int x2 = input.nextInt();
		System.out.println("Digite a coordenada Y1: ");
		int y1 = input.nextInt();
		System.out.println("Digite a coordenada Y2: ");
		int y2 = input.nextInt();
		
		System.out.println("Distância igual: " + Math.sqrt(Math.pow((x1-x2), 2)+Math.pow((y1-y2), 2)));
		
		input.close();
	}

}
