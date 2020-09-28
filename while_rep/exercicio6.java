package while_rep;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double audienciaTotal = 0;
		double canal4 = 0;
		double canal7 = 0;
		double canal12 = 0;
		int cont = 0;
		String canalMaisAssistido = "";
		
		
		for(int i = 1; i <= 3; i++) {
			System.out.println("Digite o número do canal: ");
			int canal = input.nextInt();
			System.out.println("Digite o número de pessoal: ");
			int pessoas = input.nextInt();
			System.out.println("Tv estava ligada? \n1 = Sim \n2 = Não");
			int tv = input.nextInt();
			
			
			if(tv == 1 && canal == 4 || canal == 7 || canal == 12) {
				
				cont++;
				audienciaTotal += pessoas;
				
				if (canal == 4) {
					canal4 += pessoas;
				}else if (canal == 7) {
					canal7 += pessoas;
				}else if (canal == 12) {
					canal12 += pessoas;
				}
				
				if(canal4 > canal7 && canal4 > canal12) {
					canalMaisAssistido = "Canal 4";
				}
				if(canal7 > canal4 && canal7 > canal12) {
					canalMaisAssistido = "Canal 7";
				}
				if(canal12 > canal7 && canal12 > canal4) {
					canalMaisAssistido = "Canal 7";
				}

				
			}
			
		}
		
		System.out.println("AUDIÊNCIA: \nCanal 4 = " + canal4 + "\nCanal 7 = " + canal7 + "\nCanal 12 = " + canal12);
		System.out.println("PORCENTAGEM DE AUDIÊNCIA: \nCanal 4 = " + canal4*audienciaTotal/100 
				+ "\nCanal 7 = " + canal7*audienciaTotal/100 
				+ "\nCanal 12 = " + canal12*audienciaTotal/100);
		System.out.println("Canal mais assistido = " + canalMaisAssistido);
		System.out.println("Média de pessoas que estavam assistindo TV = " + audienciaTotal/cont);
		
		input.close();
	}

}
