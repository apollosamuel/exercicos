package series_matematicas;

public class exercicio10c {

	public static void main(String[] args) {
		
		double serie = 0;
		int num1 = 1;
		int num2 = 1;
		
		
		for(int i = 1; i <= 100; i++) {
			
			num1 += 2;
			num2 += 4;

			serie += ((double)num1*Math.sqrt(num2))/Math.pow(5,i);

		}

		System.out.println(Math.pow(serie, 2));

	}

}
