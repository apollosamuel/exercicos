package while_rep;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome = "";
		double he = 0;
		int cont = 0;
		int mediaHoras = 0;
		double salario = 0;
		double maiorSalario = 0;
		String nomeMaior = "";
		String funcaoMaior = "";
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		double salarioTotal = 0;
		
		System.out.println("Digite o valor da hora trabalhada: ");
		double valor = input.nextDouble(); input.nextLine();
		
		do {

			System.out.println("Digite o nome: ");
			nome = input.nextLine();
			
			if (nome.compareToIgnoreCase("FIM") != 0) {
				System.out.println("Informe a função: ");
				String funcao = input.nextLine();
				System.out.println("Informe a quantidade de horas trabalhadas:");
				int horas = input.nextInt(); input.nextLine();
				
				cont++;
				mediaHoras += horas;
				
				if (horas <= 100) {
					cont1++;
					he = 1000;
				}else if (horas > 100 && horas <= 500) {
					cont2++;
					he = horas*10.0;
				}else if (horas > 500) {
					cont3++;
					he = (horas/10)*100;
				}
				
				salario = horas*valor+he;
				System.out.println(nome + ", vai receber: " + salario);
				salarioTotal += salario;
				
				if (salario > maiorSalario) {
					maiorSalario = salario;
					nomeMaior = nome;
					funcaoMaior = funcao;
				}
				
			}
			
			
			
		}while (nome.compareToIgnoreCase("FIM") != 0);
		
		System.out.println("Média horas trablhadas = " + mediaHoras/cont);
		System.out.println(nomeMaior + ", trabalha na função " + funcaoMaior + ", recebeu o maior salário.");
		System.out.println("Até 100: " + cont1 + "\nAcima de 100 até 500: " + cont2 + "\nAcima de 500: " + cont3);
		System.out.println("Valor total = " + salarioTotal);
		
		
		input.close();
	}

}
