package series_matematicas;

public class exercicio2 {

	public static void main(String[] args) {
		double serie = 0;
		
		for(int aux = 1; aux <= 100; aux++) {
			double den1 = aux*aux;
			double den2 = aux-1;
			
			serie += aux/(den1+den2);
		}

		System.out.println(serie);
		
	}

}
