package switch_case_break;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do imposto: ");
		double imposto = input.nextDouble();
		System.out.println("Digite o número de dias de atraso:  ");
		int atraso = input.nextInt();
		
		double multa = 0;

		if (atraso > 100) {
			multa = (imposto*1.50)+(atraso*1.0);
		} else if (atraso >= 61 && atraso < 100) {
			multa = (imposto*1.0);
		}else if (atraso >= 31 && atraso <= 60) {
			multa = (imposto*0.1)+(imposto*0.005)*atraso;
		}else if (atraso >= 11 && atraso <= 30) {
			multa = (imposto*0.2);
		}else {
			multa = 0;
		}
		
		System.out.println("Multa = " + multa);
		
		input.close();
	}

}
