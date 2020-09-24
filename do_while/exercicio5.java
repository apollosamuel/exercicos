package do_while;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double altura = 0;
		double alturam = 0;
		double peso = 0;
		int cont = 0;
		int contm = 0;
		int contf = 0;
		int cont60 = 0;

		
		System.out.println("Digite '-1' para sair.");
		
		do {
			System.out.println("Digite a altura: ");
			altura = input.nextDouble();
			
			if (altura != -1) {
				cont++;
				
				System.out.println("Digite o peso;");
				peso = input.nextDouble(); input.nextLine();
				
				System.out.println("Digite o sexo, Masculino ou Feminino:");
				String sexo = input.nextLine().toUpperCase(); 
				
				char charSexo = sexo.charAt(0);
			
				if (charSexo == 'F') {
					contf++;
					if (peso < 60.0) {
						cont60++;
					}
				}
				
				if (charSexo == 'M') {
					contm++;
					alturam += altura;
				}
				
			}
			
			
			
		} while (altura != -1);
		
		System.out.println("Quantidade de pessoas pesquisadas: " + cont);
		System.out.println("Quantidade de mulheres: " + contf);
		System.out.println("Quantidade de mulheres: " + alturam/contm);
		System.out.println("Quantidade de mulheres com peso menor que 60: " + cont60);
		
		input.close();
	}

}
