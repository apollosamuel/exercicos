package series_matematicas;

public class exercicio10d {

	public static void main(String[] args) {
		
		double serie = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			serie += (2*i-1)/Math.pow(i, 2);
			
		}
		
		System.out.println(serie);

	}

}
