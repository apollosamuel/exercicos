package condicional_ifelse;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o salário: ");
		double salario = input.nextDouble();
		
		if (salario <= 300) {
			double plBruto = 500+(salario*0.70);
			double imposto = plBruto*0.25;
			double plLiquido = plBruto-imposto;
			
			System.out.println("PL Líquido = " + plLiquido);
		} else if (salario > 300 && salario <= 1000) {
			double plBruto = 200+(salario*0.50);
			double imposto = plBruto*0.25;
			double plLiquido = plBruto-imposto;
			
			System.out.println("PL Líquido = " + plLiquido);
		} else {
			double plBruto = salario*0.30;
			double imposto = plBruto*0.25;
			double plLiquido = plBruto-imposto;
			
			System.out.println("PL Líquido = " + plLiquido);
		}
		
		input.close();
	}

}
