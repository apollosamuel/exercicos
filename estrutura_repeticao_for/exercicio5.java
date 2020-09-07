package estrutura_repeticao_for;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int fulano = 0;
		int ciclano = 0;
		int beltrano = 0;
		int votosBranco = 0;


		for (int x = 1; x <= 2; x++) {
			for (int i = 1; i <= 4; i++) {
				
				System.out.println("1 - Fulano");
				System.out.println("2 - Ciclano");
				System.out.println("3 - Beltrano");
				System.out.println("VOTE: ");
				int voto = input.nextInt();

				switch (voto) {
				case 1:
					if(fulano!=-1) {
						fulano++;
					}else {
						votosBranco++;
					}
					break;

				case 2:
					if(ciclano!=-1) {
						ciclano++;
					}else {
						votosBranco++;
					}
					break;

				case 3:
					if(beltrano!=-1) {
						beltrano++;
					}else {
						votosBranco++;
					}

					break;
				default:
					votosBranco++;
				}

			}
			if(beltrano > ciclano && beltrano > fulano) {
				System.out.println("Beltrano venceu!");
				System.exit(0);
			} else if (ciclano > beltrano && ciclano > fulano) {
				System.out.println("Ciclano venceu!");
				System.exit(0);
			} else if (fulano > beltrano && fulano > ciclano) {
				System.out.println("Fulano venceu!");
				System.exit(0);
			} else if (votosBranco > beltrano &&  votosBranco > ciclano && votosBranco > fulano) {
				System.err.println("Eleição anulada");
				System.exit(0);
			} else if (ciclano == beltrano) {
				System.out.println("EMPATE.");
				fulano = -1;
			} else if (beltrano == fulano) {
				System.out.println("EMPATE.");
				ciclano = -1;
			} else if (ciclano == fulano) {
				System.out.println("EMPATE.");
				beltrano = -1;
			}
		}
		input.close();
	}

}

