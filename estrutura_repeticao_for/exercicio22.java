package estrutura_repeticao_for;

public class exercicio22 {

	public static void main(String[] args) {
		
		int quantidade = 0;
		double soma = 0;
		for (int i = 1000; i < 10000; i++) {
			if(i/1000 == i%10 && (i/100)%10 == (i/10)%10) {
				System.out.println(i);
				soma+=i;
				quantidade++;
			}
		}
		System.out.println("Média: " + soma / quantidade);
	}

}
