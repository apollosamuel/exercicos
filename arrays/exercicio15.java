package arrays;
import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number[] = new int [10];
		int totalPar = 0;
		int cont = 0;

		for(int i = 0; i < number.length; i++) {
			System.out.println("Digite um número: ");
			number[i] = input.nextInt();
		}

		for(int i = 0; i < number.length; i++) {

			if(number[i]%2 == 0) {

				System.out.print(number[i] + " ");	
				totalPar += number[i];
				cont++;
			}

		}
		System.out.println("");
		System.out.println("Média dos números pares: " + totalPar/cont);

		input.close();
	}

}