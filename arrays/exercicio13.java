package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	    String meses[] = new String[12];
	    
	    for (int i = 0; i < 12; i++) {
	       System.out.print("Digite um nome: ");
	       meses[i] = input.nextLine();
	    }
	    
	    // ORDENA EM ORDEM CRESCENTE (ALFABÉTICA)
	    Arrays.sort(meses);		
	    for (String nome : meses) {
	       System.out.println(nome);
	    }

		
		input.close();
	}

}
