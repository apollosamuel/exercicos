package series_matematicas;

public class exercicio8 {

	public static void main(String[] args) {
		double serie = 0;
		double num1 = 1;
		double num2 = 1;
		
		for(int i = 1; i <= 20; i++) {
			
			
			num1 += 2;
			num2 += 4;
			
			serie+= ((double)(num1))*Math.sqrt(num2)/Math.pow(5, i);

			
		}
		System.out.println(serie*serie);
	}

}
