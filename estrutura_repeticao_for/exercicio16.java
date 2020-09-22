package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int x = 3; x <= 12; x++) {
			double fx = Math.sqrt(Math.pow(x, 2)-3);
			System.out.println("X = " + x + "\nf(x) = " + fx);
			System.out.println();
		}
		
		input.close();
	}

}
