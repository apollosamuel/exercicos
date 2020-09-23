package series_matematicas;

public class exercicio3 {

	public static void main(String[] args) {
		double serie = 0;
		double num1, num2 = 0, den = 0;
		
		for(int aux = 1; aux <= 19; aux++) {
			
			num1 = 1;
			int i=2;
			num2 += Math.sqrt(i*2);
			den += 3+3;
			
			serie += (num1+num2)/den;
			
		}
		System.out.println(serie);
	}

}
