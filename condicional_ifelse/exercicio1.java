package condicional_ifelse;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double fx = 0;
		
		System.out.print("Digite o valor de X: ");
		int x = input.nextInt();
		
		if (x < 4) {
			fx = (5*x+3)/(Math.sqrt(16-Math.pow(x, 2)));
		}else if (x > 4) {
			fx = (5*x+3)/(Math.sqrt(Math.pow(x, 2)-16)); 
		}else {
			fx = 0;;
		}
		
		System.out.println("f(x) = " + fx);
			
		
		input.close();
	}

}
