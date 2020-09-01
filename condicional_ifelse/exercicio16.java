package condicional_ifelse;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double nota=0;
	
		
		System.out.print("Digite o número de faltas: ");
		int faltas = input.nextInt();
		
		System.out.print("Digite a nota da primeira prova: ");
		double p1 = input.nextDouble();
		
		System.out.print("Digite a nota da segunda prova: ");
		double p2 = input.nextDouble();
		
		System.out.print("Digite a nota da terceira prova: ");
		double p3 = input.nextDouble();
		
		System.out.print("Digite a nota do trabalho: ");
		double trabalho = input.nextDouble();
		
		System.out.print("Digite a idade: ");
		int idade = input.nextInt();
		
		if (p1>p2) {
			
			nota+=p1;
			
		} else {
			nota+=p2;
			if (p1>p3) {
				nota+=p1;
			} else {
				nota+=p3;
			}
		}
		
		nota = nota/2.0;
		
		if(faltas <= 5) {
			nota*=3;
			
		}else if (faltas <= 10) {
			nota*=2;
		}
		
		
		if (idade<=17) {
			nota += trabalho*1;
			
		} else if (idade <= 50) {
			nota += trabalho*2;
			
		}else {
			nota += trabalho*3;
			
		}
		
		if (nota<=50) {
			System.out.println("Reprovado.");
		} else if (nota<70) {
			System.out.println("Regular.");
		} else if (nota<80) {
			System.out.println("Bom.");
		} else if (nota<90) {
			System.out.println("Muito bom.");
		} else if (nota>=90) {
			System.out.println("Excelente.");
		}
		
		input.close();
	}

}
