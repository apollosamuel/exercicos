package series_matematicas;

public class exercicio11f {

	public static void main(String[] args) {
		
		double serie = 0;
		int num1 = -1; 
		int num2 = 2;
		int num3 = 0;
		int den = -3;
		
		for(int i = 1; i <= 2; i++) {
			
			num1 += 2;
			num3 = num2 + num2;
			
			den += 5;
			
			serie += (num1)/Math.pow(den, 2);
			
		}
		
		System.out.println(5*(Math.sqrt(serie)));
		System.out.println(num2);

	}

}
