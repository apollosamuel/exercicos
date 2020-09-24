package series_matematicas;

public class exercicio11f {

	public static void main(String[] args) {
		
		double serie = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			serie += Math.pow(2, i+1)*(2*i -1)/Math.pow(5*i -3, 2);
			
		}
		
		System.out.println(Math.sqrt(serie)*5);


	}

}
