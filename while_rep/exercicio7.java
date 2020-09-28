package while_rep;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double tempTotal = 0;
		double menorTemp = 1000;
		double maiorTemp = 0;
		int cont = 0;
		int cont2 = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("Digite a temperatura: ");
			double temp = input.nextDouble();
			
			cont++;
			tempTotal += temp;
			
			if(menorTemp > temp) {
				menorTemp = temp;
			}
			if(maiorTemp < temp) {
				maiorTemp = temp;	
			}else if(maiorTemp == temp) {
				cont2++;
			}		
			
		}
		
		System.out.println("Menor temperatura: " + menorTemp);
		System.out.println("Maior tempearatura: " + maiorTemp);
		System.out.println("Média temperatura: " + tempTotal/cont);
		System.out.println("A quantidade de dias que ocorreu a maior temperatura: " + cont2);
		
		input.close();
	}

}
