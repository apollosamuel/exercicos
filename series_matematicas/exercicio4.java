package series_matematicas;

public class exercicio4 {

	public static void main(String[] args) {

		double serie = 0;
		int num = 0;
		
		for(int aux = 0; aux <= 3; aux++) {
			
			num = 1+4*aux;
			
			serie += ((double)num*(num+1))/((num+2)*(num+3));
			
		}
		
		System.out.println(Math.sqrt(serie));
		System.out.println(num);
	}

}
