package while_rep;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int bronze = 0;
		int prata = 0;
		int ouro = 0;
		double valorBronze = 0;
		double valorTotal = 0;
		double menorAplicação = 5000;
		String nomeClienteMenor = "";
				
		 for (int i = 1; i <= 2; i++) {

			System.out.println("Digite o nome do cliente: ");
			String nome = input.nextLine();
			System.out.println("Digite o valor aplicado: ");
			double valor = input.nextDouble(); input.nextLine();
			
			valorTotal+= valor;
			
			if (valor <= 1000.0) {
				bronze++;
				System.out.println(nome + " = Bronze");
				valorBronze+= valor;
			}else if (valor > 1000.0 && valor <= 5000.0) {
				prata++;
				System.out.println(nome + " = Prata");
			}else if (valor > 5000.0) {
				ouro++;
				System.out.println(nome + " = Ouro");
			}
			
			if (menorAplicação > valor) {
				menorAplicação = valor; 
				nomeClienteMenor = nome; 
			}
			
		}
		
		 System.out.println("BRONZE = " + bronze + "\nPRATA = " + prata + "\nOURO = " + ouro);
		 System.out.println("Média dos valores aplicados dos clientes bronze = " + valorBronze/bronze);
		 System.out.println("Volume total de aplicações = " + valorTotal);
		 System.out.println("Nome do cliente que realizou a menor aplicação = " + nomeClienteMenor);
		 
		input.close();
	}

}
