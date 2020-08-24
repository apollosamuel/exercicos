package expressoes_aritmeticas;
import java.util.Scanner;

//Faça um algoritmo que calcule e imprima o valor a ser retido de Imposto de Renda de uma pessoa de acordo com as fórmulas abaixo.
//O salário e o número de dependentes serão informados pelo usuário.
//Fórmulas: 
//Líquido = Salário – (N° de Dependentes x R$60,00)
//Imposto de Renda = 15% do Líquido



public class exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		double salario = input.nextDouble();
		System.out.println("Digite o número de dependentes: ");
		int dependentes = input.nextInt();
		
		System.out.println("O imposto de renda a ser retido é de: " + (salario-(dependentes*60.0))*0.15);
		
		input.close();
	}

}
