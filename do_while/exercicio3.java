package do_while;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int r = 0;
		
		System.out.println("Digite o ângulo: ");
		int a = input.nextInt();
		
		do {
			System.out.println("Digite o Raio: ");
			r = input.nextInt();
			
			if (r != -1) {
				System.out.println((a*Math.PI*Math.pow(r, 2))/360);
			}
			
		} while (r != -1);
		
		input.close();
	}

}
