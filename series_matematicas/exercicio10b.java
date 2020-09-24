package series_matematicas;

public class exercicio10b {

	public static void main(String[] args) {
		
		double serie = 0;
		double num1 = 0;
		double num2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			num1 += 2;
			num2 += 3;
		
			serie += num1/num2;
			
		}
		
		System.out.println(1 + Math.sqrt(serie));
		

		
	}

}
