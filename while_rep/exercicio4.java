package while_rep;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idadeMedia = 0;
		double totalMultas = 0;
		int cont = 0;
		int contM = 0;
		int contF = 0;
		int cont7 = 0;
		double percentM = 0;
		String nomeVelho = "";
		int idadeVelho = 200;
		
		for(int i= 1; i < 3; i++) {
			
			System.out.println("Nome: ");
			String nome = input.nextLine();
			System.out.println("Idade: ");
			int idade = input.nextInt(); input.nextLine();
			System.out.println("Masculino ou Feminino ");
			String sexo = input.nextLine().toUpperCase();
			System.out.println("Quantidades de pontos perdidos: ");
			int pontos = input.nextInt();
			System.out.println("Multa: ");
			double multa = input.nextDouble();input.nextLine();
			
			char charSexo = sexo.charAt(0);
			
			cont++;
			
			idadeMedia += idade;
			totalMultas += multa;
			
			if (charSexo == 'M') {
				contM++;
			}else if (charSexo == 'F') {
				contF++;
			}
			
			percentM = contM/(contM+contF)*100;
			
			if (charSexo == 'F' && pontos == 7) {
				cont7++;
			}
			
			if (idadeVelho < idade ) {
				idadeVelho = idade;
				nomeVelho = nome;
			}
			
		}
		
		System.out.println("Média idade = " + idadeMedia/cont);
		System.out.println("Total multa = " + totalMultas);
		System.out.println("Percentual dos homens multados = " + percentM);
		System.out.println("Mulheres que perderam 7 pontos na carteira = " + cont7);
		System.out.println("Nome: " + nomeVelho + "\nIdade: " + idadeVelho);
		
		input.close();
	}

}
