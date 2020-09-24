package series_matematicas;

public class exercicio10c {

	public static void main(String[] args) {
		
		double serie = 0;
		int num1 = -1;
		int num2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			num1 += 2;
			num2 += 2;
			
			serie += ((double)(num1))/(num2);
			
		}
		
		System.out.println((1.0/3)*(Math.pow(serie, 2)));

	}

}
