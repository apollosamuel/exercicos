package condicional_ifelse;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario = 240;
		
		System.out.println("Digite o total de vendas: ");
		double vendas = input.nextDouble(); 
		
		if (vendas > 1000 && vendas < 10000) {
			salario = (vendas*0.10) + salario;
		} else if (vendas >= 10000) {
			salario = salario + 1000;
		} else {
			salario = 240;
		}
		
		System.out.println("Salário = " + salario);
		
		input.close();
	}

}
