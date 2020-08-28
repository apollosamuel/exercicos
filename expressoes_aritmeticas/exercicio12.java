package expressoes_aritmeticas;
import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de segundos: ");
		int segundos = input.nextInt();
		
		int hor = segundos/60/60;
		int min = segundos/60%60;
		int seg = segundos%60;
		
		System.out.println("hor = " + hor + ", min = " + min + ", seg = " + seg);
		
		input.close();
	}

}
