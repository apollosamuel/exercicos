package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio20 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite sua altura: ");
		double altura = input.nextDouble();
		
		for(int i = 60; i <= 100; i++) {
			double imc = i/(Math.pow(altura,2));
			
			if (imc < 20) {
				System.out.println("PESO = " + i + "\nIMC =  " + imc + "\nAbaixo do peso");
			}else if (imc >= 20 && imc <= 25) {
				System.out.println("PESO = " + i + "\nIMC =  " + imc + "\nPeso ideal");
			}else if (imc > 25) {
				System.out.println("PESO = " + i + "\nIMC =  " + imc + "\nAcima do peso");
			}
		}
		
		input.close();
	}

}
