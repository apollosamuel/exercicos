package estrutura_repeticao_for;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				
		for (int i = 0; i <= 3; i++) {
			System.out.println("Digite o Raio: ");
			int raio = input.nextInt();
			System.out.println("Área: " + Math.PI*(Math.pow(raio, 2)));
			
		}
		
		input.close();
	}

}
