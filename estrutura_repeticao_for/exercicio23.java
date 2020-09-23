package estrutura_repeticao_for;

public class exercicio23 {

	public static void main(String[] args) {

		double valor = 0;
		double anterior = 2;
		
		for(int aux = 1; aux <= 99; aux+=2) {
			
			valor+=anterior/3;
			anterior*=4;
			
		}
		System.out.println(valor);
	}

}
