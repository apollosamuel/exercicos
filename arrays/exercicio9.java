package arrays;
import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numero[] = new int [10];
		int x = 0;

		for(int i = 0; i < numero.length; i++) {

			System.out.println("Digite um número");
			numero[i] = input.nextInt();
			x += numero[i];
		}

		for(int y = 0; y < numero.length; y++) {

			if (x%numero[y] == 0) {

				System.out.println("Números que são divisores da soma: " + numero[y]);
			}


		}


		input.close();
	}

}
