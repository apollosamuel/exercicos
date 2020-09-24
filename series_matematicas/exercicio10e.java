package series_matematicas;

public class exercicio10e {

	public static void main(String[] args) {
		
		double serie = 0;
		int num1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			num1 += 2;
	
			serie += ((double)i)/(3*num1);
			
		}
		
		System.out.println(serie);
	}

}
