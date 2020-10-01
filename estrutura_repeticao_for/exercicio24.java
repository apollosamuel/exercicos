package estrutura_repeticao_for;

public class exercicio24 {
	public static void main(String[] args) {

		for(int k = 0;k<10;k++) {
			for(int i = 1;i<21;i++) {
				for (int j = 0; j < (i<=10?i:21-i); j++) {
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}
}

