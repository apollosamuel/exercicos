package series_matematicas;

public class exercicio7 {

	public static void main(String[] args) {
		double serie = 0;

		int num1 = -2; int num2 = 0;
		
		for(int i = 1; i <= 6; i++) {

			num1 += 2;
			num2 += 3;

			serie += ((double)(num1+num2))/(6*i+1);
			
		}
		
		System.out.println(serie);

	}

}
