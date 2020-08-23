package sysout_scanner;
import java.util.Scanner; 

//Faça um algoritmo que solicite ao usuário o seu nome, seus documentos (CPF, identidade, título de eleitor, carteira de motorista), seu salário e o nome da empresa em que trabalha, e depois imprima a sua FICHA FUNCIONAL de acordo com o layout abaixo:

//FICHA FUNCIONAL DE: x---------------------nome------------------------x

//Documentos:
//CPF ............................................. 	x-----cpf-----x 
//C.I. ...............................................	x---identidade---x
//Titulo de eleitor  ........................... 	x---título de eleitor---x
//Carteira de motorista ...................	x---carteira de motorista ---x

//Empresa: x-----nome da empresa------x
//Salário: R$ x-----salário-----x

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		
		System.out.print("Digite o seu CPF: ");
		String cpf = input.nextLine();
		
		System.out.print("Digite o sua Carteira de Identidade: ");
		String identidade = input.nextLine();
		
		System.out.print("Digite o seu Título de Eleitor: ");
		int tituloEleitor = input.nextInt();
		
		System.out.print("Digite o sua Carteira de Motorista: ");
		int cnh = input.nextInt(); input.nextLine();
		
		System.out.print("Digite o nome da sua empresa: ");
		String empresa = input.nextLine(); 
		
		System.out.print("Digite o seu salário: ");
		double salario = input.nextDouble();
		
		System.out.println("FICHA FUNCIONAL DE: " + nome);
		
		System.out.println();
		
		System.out.println("Documentos: ");
		System.out.println("CPF......................." + cpf);
		System.out.println("C.I. ....................." + identidade);
		System.out.println("Titulo de eleitor ........" + tituloEleitor);
		System.out.println("Carteira de motorista ...." + cnh);
		
		System.out.println();
		
		System.out.println("Empresa: " + empresa);
		System.out.println("Salário: R$" + salario);
		
		input.close();
	}

}
