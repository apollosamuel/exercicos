package arrays;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number[] = new int [10];
		int numberInverso[] = new int [10];
		
		for(int i = 0; i < number.length; i++) {
			System.out.println("Digite um número: ");
			number[i] = input.nextInt();
		}
		int x = 10;
		for(int i = 0; i < number.length; i++) {
			x--;
			numberInverso[i] = number[x];
			
		}
		
		for(int i = 0; i < number.length; i++) {

			System.out.print(" " + numberInverso[i]);
		
		}
		
		input.close();
	}

}
