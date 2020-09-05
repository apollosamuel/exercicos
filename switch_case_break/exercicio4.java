package switch_case_break;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome de uma equipe de futebol: ");
		String equipe = input.nextLine();
		
		if (equipe.equalsIgnoreCase("AMERICA") || equipe.equalsIgnoreCase("ATLETICO") || equipe.equalsIgnoreCase("CRUZEIRO") || equipe.equalsIgnoreCase("VILLA NOVA")) {
			System.out.println("MINAS GERAIS");
		} else if (equipe.equalsIgnoreCase("BOTAFOGO") || equipe.equalsIgnoreCase("FLAMENGO") || equipe.equalsIgnoreCase("FLUMINENSE") || equipe.equalsIgnoreCase("VASCO")) {
			System.out.println("RIO DE JANEIRO");
		}else if (equipe.equalsIgnoreCase("CORINTHIANS") || equipe.equalsIgnoreCase("PALMEIRAS") || equipe.equalsIgnoreCase("SANTOS") || equipe.equalsIgnoreCase("SAO PAULO")) {
			System.out.println("SÃO PAULO");
		}else if (equipe.equalsIgnoreCase("GREMIO") || equipe.equalsIgnoreCase("INTERNACIONAL") || equipe.equalsIgnoreCase("JUVENTUDE")) {
			System.out.println("RIO GRANDE DO SUL");
		}else if (equipe.equalsIgnoreCase("NAUTICO") || equipe.equalsIgnoreCase("SANTA CRUZ") || equipe.equalsIgnoreCase("SPORT")) {
			System.out.println("PERNAMBUCO");
		}else {
			System.out.println("Não consta no banco de dados, tente novamente.");
		}
		
		input.close();
	}

}
