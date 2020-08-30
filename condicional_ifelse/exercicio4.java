package condicional_ifelse;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Digite a sua altura em metros: ");
		double altura = input.nextDouble();
		System.out.print("Digite a seu peso: ");
		double peso = input.nextDouble();
		
		double imc = peso/(Math.pow(altura, 2));
		
		if (imc < 18) {
			System.out.println("Pessoa está desnutrida");
		} else if (imc >= 18 && imc < 20) {
			System.out.println("Pessoa está abaixo do peso");
		} else if (imc >= 20 && imc < 25) {
			System.out.println("Pessoa está no peso ideal");
		} else if (imc >= 25 && imc < 27) {
			System.out.println("Pessoa está acima do peso");
		} else {
			System.out.println("Pessoa está obesa.");
		}

		input.close();
	}

}
