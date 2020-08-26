package expressoes_aritmeticas;
import java.util.Scanner;

//Faça um algoritmo que solicite ao usuário o valor de x e calcule e imprima o valor da função f(x).


public class exercico7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor de X: ");
		int x = input.nextInt();
		
		System.out.println("f(x) = " + Math.sqrt(Math.pow((x/4.0+1.0), 2)+1.0/5.0*x));
		
		input.close();
	}
}
