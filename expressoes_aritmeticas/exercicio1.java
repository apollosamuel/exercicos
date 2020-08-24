package expressoes_aritmeticas;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int valorX = input.nextInt();
		
		System.out.println("X = " + valorX + ". Então o resultado da função é " + (Math.pow(valorX, 3)+(4*valorX)+10));
		
		input.close();
	}

}
