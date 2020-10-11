package arrays;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number[] = new int [10];
		
		for(int i = 0; i < number.length; i++) {
			System.out.println("Digite um número: ");
			number[i] = input.nextInt();
		}
		
		System.out.println("Digite um número real: ");
		double numberReal = input.nextDouble();
		
		
		for(int i = 0; i < number.length; i++) {
			
			System.out.println(number[i]*numberReal);
				
		}
		
		
		input.close();
	}

}
