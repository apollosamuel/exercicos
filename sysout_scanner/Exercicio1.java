package sysout_scanner;
import java.util.Scanner;

//Faça um algoritmo que solicite ao usuário o seu primeiro  nome, seu nome do meio, seu sobrenome, sua idade e depois imprima todos estes dados de acordo com o layout abaixo:

//Sobrenome, PrimeiroNome SegundoNome
//Idade: 99 anos. 

//Exemplo de saída de dados:

//Freitas, Ricardo Luiz
//Idade: 50 anos.


public class Exercicio1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o seu primeiro nome: "); 
		String primeiroNome = input.nextLine();

		System.out.print("Digite o seu segundo nome: ");
		String segundoNome = input.nextLine();

		System.out.print("Digite o seu terceiro nome: ");
		String terceiroNome = input.nextLine();

		System.out.print("Digite sua idade: ");
		int idade = input.nextInt();

		System.out.println(terceiroNome + ", " + primeiroNome + " " + segundoNome);
		System.out.println("Idade: " + idade + " anos.");


		input.close();
		
	}
	
}