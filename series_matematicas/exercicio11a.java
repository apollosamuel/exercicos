package series_matematicas;

public class exercicio11a {

	public static void main(String[] args) {
		
		double serie = 0;
		
		for(int i = 0; i <= 100; i++) {
			
			serie += (8*i+2)/Math.pow(4, i);
			
		}
		
		System.out.println("Valor da série = "+Math.pow(serie,1/3.0));
		

	}

}
