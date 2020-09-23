package series_matematicas;

public class exercicio6 {

	public static void main(String[] args) {
		
		double serie = 0;
		int aux = 0;
		
		for(int i = 1; i <= 20; i++) {
			
			aux += 2;
			
			serie += ((double)i)/Math.sqrt(aux);
			
		}
		System.out.println(10+serie);
	}

}
