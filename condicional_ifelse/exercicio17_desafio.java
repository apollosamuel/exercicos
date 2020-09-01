package condicional_ifelse;

import java.util.Scanner;

public class exercicio17_desafio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Responda 1 para sim e 2 para não;");

		System.out.println("Você tem curso técnico de programação? ");
		int r1 = input.nextInt();
		System.out.println("Você tem curso superior de programação? ");
		int r2 = input.nextInt();
		System.out.println("Você tem menos de 3 anos de experiência em programação? ");
		int r3 = input.nextInt();
		System.out.println("Você se considera uma pessoa criativa? ");
		int r4 = input.nextInt();
		System.out.println("Você prefere liderar a ser liderado? ");
		int r5 = input.nextInt();
		System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe? ");
		int r6 = input.nextInt();
		System.out.println("Você é autodidata? ");
		int r7 = input.nextInt();
		System.out.println("Você aceitaria uma remuneração inicial de R$1500? ");
		int r8 = input.nextInt();
		System.out.println("Você aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
		int r9 = input.nextInt();

		if (r1 == 1) {
			if (r3 == 1 || r2 == 1) {
			}else {
				System.out.println("Não está apto");
			}
			if (r4 == 1) {
				if (r5 == 1) {
					if (r8 == 2 && r6 == 2) {
						if (r7 == 1) {
							if(r9 == 2) {
								System.out.println("Você está apto a trabalhar na empresa");
							}else {
								System.out.println("Não está apto");
							}
						}else {
							System.out.println("Não está apto");
						}
					}else {
						System.out.println("Não está apto");
					}
				}else {if (r7 == 1 && r6 == 2) {
					if(r9 == 2) {
						System.out.println("Você está apto a trabalhar na empresa");	
					}

				}else {
					System.out.println("Não está apto");
				}
				}
			}
		}

		input.close();
	}
}


