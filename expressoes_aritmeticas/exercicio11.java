package expressoes_aritmeticas;
import java.util.Scanner;

//Nos cheques bancários, o número do cheque de um determinado banco é 
//composto pelo código do banco (3 dígitos), mais o código da agência (3 dígitos), 
//mais um sequencial numérico (3 dígitos). Faça um algoritmo que leia um número de 
//cheque deste banco e extraia e imprima dele o código do banco, o código da agência e o sequencial do cheque.



public class exercicio11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o número do cheque: ");
		int numero = input.nextInt();
		
		int banco = numero/1000000%1000;
		int agencia = numero/1000%1000;
		int sequencial = numero%1000;
		
		System.out.println("Banco = " + banco + ", Agência = " + agencia + ", Sequencial = " + sequencial);
		
		input.close();
	}

}
