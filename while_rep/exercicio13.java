package while_rep;

public class exercicio13 {

	public static void main(String[] args) {

		double serie = 0;
		double num = 0;
		double den = 0;
		
		int i = 0;
		while (i<20) {
			
			i++;
			num = i * Math.pow(1 + 9 * i,2*i);
			den = Math.pow(7, i-1);

			serie+=num/den;
			
			
		}
		
		serie = Math.cbrt(serie);
		serie += 71;
		
		System.out.println(serie);
		
	}

}
