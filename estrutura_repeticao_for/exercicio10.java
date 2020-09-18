package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aux = 0; 
		double custoTotal = 0;
		double custoMaior = 0;
		String insumoMaior = "";
		
		System.out.print("Digite a quantidade de insumos a serem registrados: ");
		int insumos = input.nextInt(); input.nextLine();
		
		for (int i = 1; i <= insumos; i++) {
			aux++;
			
			System.out.println("Digite o nome do insumo: ");
			String insumoNome = input.nextLine(); 
			System.out.println("Digite a quantidade: ");
			int quantidade = input.nextInt(); 
			System.out.println("Digite o valor unitário: ");
			double unitario = input.nextDouble(); input.nextLine();
			
			
			double custoParcial = quantidade*unitario;
			System.out.println("Custo Parcial = " + custoParcial);
			
			custoTotal = custoParcial + custoTotal;
			
			if (custoParcial > custoMaior) {
				insumoMaior = insumoNome;
			}
		}
		
		System.out.println("Custo total = " + custoTotal);
		System.out.println("Média dos custos =" + custoTotal/aux);
		System.out.println("Nome do insumo de maior custo = " + insumoMaior);
		
		input.close();
	}

}
