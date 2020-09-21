package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valor = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o código do modelo;");
			int modelo = input.nextInt();
			
			switch (modelo) {
			case 1:
				valor+=1565;
				break;
			case 2: 
				valor+=1890;
				break;
			case 3: 
				valor+=2150;
				break;
			case 4: 
				valor+=2963;
				break;
			case 5: 
				valor+=3750;
				break;
			}
		}
		
		System.out.println("Faturamento = " + valor);
		
		input.close();
	}

}
