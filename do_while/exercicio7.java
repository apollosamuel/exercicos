package do_while;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.println("Digite a quantidade de pessoas: ");
		int pessoas = input.nextInt();
		
		// usei o .floor com o + 1 pois quero arrendondar para cima e quando a casa
		// decimal muito pequena, o java acaba desprezando
		//Math.log10(1.003) = 0.001300933020418072
		int dias = (int) Math.floor(Math.log10(pessoas) / 0.001300933020418072) + 1;
		int anos = dias / 365;
		dias %= 365;

		int meses = dias / 30;
		dias %= 30;

		System.out.printf("Anos = %d Meses = %d Dias = %d", anos, meses, dias);

		
		input.close();
	}

}
