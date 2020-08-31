package condicional_ifelse;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		
		int n1 = numero/1000;
		int n2 = numero/100%10;
		int n3 = numero/10%10;
		int n4 = numero%10;
		
		System.out.println(n4 + "" + "" + n3 + "" + "" + n2 + "" + n1);
		
		input.close();
	}

}
