package condicional_ifelse;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a hora inicial: ");
		int hora1 = input.nextInt();
		
		System.out.print("Digite o minuto inicial: ");
		int minuto1 = input.nextInt();
		
		System.out.print("Digite a hora final: ");
		int hora2 = input.nextInt();
		
		System.out.print("Digite o minuto final: ");
		int minuto2 = input.nextInt();
		
		
		int minDuracao = (60 - minuto1)+minuto2;
		int horaDuracao = hora2-hora1-1+(minDuracao/60);
	
		System.out.println("A duracação é de: " + horaDuracao + ":" + minDuracao%60 + ".");
		
		
		input.close();
		
	}

}
