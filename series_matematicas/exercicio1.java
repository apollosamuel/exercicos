package series_matematicas;

public class exercicio1 {

	public static void main(String[] args) {

		double serie = 0;
		
		for(int aux = 1; aux <= 37; aux++) {
			double num1 = 38-aux;
			double num2 = 39-aux;
			
			serie += (num1*num2)/aux;
		}
		
		System.out.println(serie);
	}

}
