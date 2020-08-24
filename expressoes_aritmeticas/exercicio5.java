package expressoes_aritmeticas;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de uma temperatura em Celsius: ");
		double celsius = input.nextDouble();
		
		System.out.println("Kelvin = " + (celsius+273) + "\nFahrenheit = " + ((1.8*celsius)+32));
		
		input.close();
	}

}
