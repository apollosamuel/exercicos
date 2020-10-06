package arrays;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String meses[] = new String [12];
		
		for (int i = 0; i < meses.length; i++) {
			System.out.println("Informe os meses: ");
			meses[i] = input.nextLine();
		}
		
		for (int i = 11; i >= 0; i--) {
			System.out.println(meses[i]);
		}
		
		input.close();
	}

}
