package condicional_ifelse;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double multa = 0;
		
		System.out.print("Digite a quantidade de poluentes: ");
		double poluentes = input.nextDouble();
		
		if (poluentes > 1500 && poluentes <3500 ) {
			multa = 3000;
		} else if (poluentes > 3500) {
			multa = poluentes*5000;
		} else {
			multa = 0;
		}
		
		System.out.println("Multa = " + multa);
		
		input.close();
	}

}
