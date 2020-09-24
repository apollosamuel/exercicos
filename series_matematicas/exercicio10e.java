package series_matematicas;

public class exercicio10e {

	public static void main(String[] args) {
		
		double serie = 0;
		int num1 = -2;
		int num2 = 3;
		int den1 = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			num1 += 3;
			num2 += i*i;
			den1 = i+1;
			
			
			serie += ((double)num1*Math.sqrt(num2))/Math.pow(den1, i);
			
		}
		
		System.out.println((2.0/3.0)*serie);
	}

}
