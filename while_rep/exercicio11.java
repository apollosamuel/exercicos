package while_rep;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira o número: ");
		int numero = input.nextInt();
		
		for(int i = 1;i <= numero; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		input.close();
	}

}
