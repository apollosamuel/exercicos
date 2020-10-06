package arrays;

import java.util.Scanner;

public class exercicio7 {


	private static class Aluno{
		private String nome;
		private int nota;

		public Aluno(String nome, int nota) {
			this.nome = nome;
			this.nota = nota;
		}

		public String getNome() {
			return this.nome;
		}

		public char getConceito() {
			if(nota<=30)
				return 'D';
			else if(nota<=60)
				return 'C';
			else if(nota<=80)
				return 'B';
			else
				return 'A';
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Aluno[] alunos = new Aluno[50];

		for (int i = 0; i < alunos.length; i++) {
			System.out.print("Insira o nome: ");
			String nome = input.nextLine();

			System.out.print("Insira a nota final: ");
			int nota = input.nextInt(); input.nextLine();

			alunos[i] = new Aluno(nome, nota);
		}

	
		for (int i = 0; i < alunos.length; i++) {
			
			System.out.print(alunos[i].getNome());
			
			System.out.println(" | " + alunos[i].getConceito());
		}


		input.close();

	}
}	
