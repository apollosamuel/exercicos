package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int media = 0;
		int aux = 0;
		
		for (int i = 1000; i <= 2000; i++) {
			
			if(i%2 != 0) {
				media += i;
				aux++;
			}
			
		}
		System.out.println("A média dos números é: " + media/aux);
		input.close();
	}

}
