package expressoes_aritmeticas;
import java.util.Scanner;

//Faça um algoritmo que leia as 3 notas de um aluno e 
//calcule e imprima a média final deste aluno. 
//Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente.


public class exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		int nota1 = input.nextInt();
		System.out.println("Digite a nota 2");
		int nota2 = input.nextInt();		
		System.out.println("Digite a nota 3");
		int nota3 = input.nextInt();
		
		System.out.println("A média ponderada é de: " + ((nota1*2)+(nota2*3)+(nota3*5))/10.0);

		input.close();
	}

}
